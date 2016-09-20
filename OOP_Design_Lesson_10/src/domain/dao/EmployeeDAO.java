package domain.dao;

import java.util.ArrayList;
import java.util.List;

import domain.Employee;

public class EmployeeDAO {

	Employee emp1 = new Employee("Mike", null, 5000, true);
	Employee emp2 = new Employee("Steve", null, 4500, true);
	Employee emp3 = new Employee("John", null, 7000, true);
	Employee emp4 = new Employee("Pat", null, 6000, true);
	Employee emp5 = new Employee("Joe", null, 8000, true);

	List<Employee> employees;

	public List<Employee> generateEmployees() {
		employees = new ArrayList<Employee>();

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

		return employees;

	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

}
