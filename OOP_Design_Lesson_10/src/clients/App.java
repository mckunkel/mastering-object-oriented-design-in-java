package clients;

import java.util.Date;

import domain.Employee;
import observers.HRDepartment;
import observers.IObserver;
import observers.PayrollDepartment;
import subjects.EmployeeManagementSystem;

public class App {

	public static void main(String[] args) {

		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();

		EmployeeManagementSystem ems = new EmployeeManagementSystem();

		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);

		ems.printEmployeeList();
		Employee bob = new Employee("Bob", new Date(), 35000, true);
		ems.hireNewEmployee(bob);

		ems.printEmployeeList();

		ems.modifyEmployeeName(5, "Imtiaz");
		// ems.modifyEmployeeName(2, "Imtiaz");
		ems.printEmployeeList();

		for (int i = 0; i < 100; i++) {

			SessionIdentifierGenerator ses = new SessionIdentifierGenerator();
			bob = new Employee(ses.nextSessionId(), new Date(), 3000, true);
			ems.hireNewEmployee(bob);
		}

		ems.printEmployeeList();

	}
}
