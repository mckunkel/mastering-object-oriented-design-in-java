package clients;

import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {

	public static void main(String[] args) {
		Employee peggy = new Employee(1, "peggy", "acounting", true);
		ClientModule.hireNewEmployee(peggy);
		printEmployeeReport(peggy, FormatType.XML);
	}

	public static void hireNewEmployee(Employee employee) {

		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(employee);

	}

	public static void terminateEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.deleteEmployee(employee);
	}

	public static void printEmployeeReport(Employee employee, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());

	}

}
