package domain.dao;

import domain.Employee;

public class EmployeeDAO {

	public void saveEmployee(Employee employee) {
		System.out.println("saved employee to the database" + employee);
	}

	public void deleteEmployee(Employee employee) {
		System.out.println("deleted employee to the database" + employee);

	}

}
