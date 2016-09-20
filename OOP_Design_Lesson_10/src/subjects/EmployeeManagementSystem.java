package subjects;

import java.util.ArrayList;
import java.util.List;

import domain.Employee;
import domain.dao.EmployeeDAO;
import observers.IObserver;

public class EmployeeManagementSystem implements ISubject {

	private Employee employee;
	private String msg = null;
	private List<IObserver> observers;
	private List<Employee> employees;
	private EmployeeDAO employeeDAO;

	public EmployeeManagementSystem() {
		observers = new ArrayList<IObserver>();
		employeeDAO = new EmployeeDAO();
		employees = employeeDAO.generateEmployees();
	}

	public void modifyEmployeeName(int id, String newName) {
		boolean notify = false;
		for (Employee emp : employees) {
			if (id == emp.employeeID) {
				emp.setName(newName);
				this.employee = emp;
				this.msg = "Employee Name Changed";
				notify = true;
			}
		}
		if (notify)
			notifyObservers();
	}

	public void printEmployeeList() {
		for (Employee emp : employees) {
			System.out.println("Employee Data: " + emp.toString());
		}
	}

	public void hireNewEmployee(Employee emp) {
		employee = emp;
		msg = "New Hire";
		employeeDAO.addEmployee(emp);
		notifyObservers();
	}

	@Override
	public void registerObserver(IObserver o) {
		// the observers added to this list are interested in getting notified.
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		int removeIndex = observers.indexOf(o);
		observers.remove(removeIndex);
	}

	public void notifyObservers() {
		for (IObserver department : observers) {
			department.callMe(employee, msg);
		}
	}

}
