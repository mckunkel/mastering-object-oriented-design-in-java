package domain;

import java.util.Date;

public class Employee {

	private String name;
	private Date hireDate;
	private int salary;
	public int employeeID;
	private boolean working = false;

	private static int COUNTER;

	public Employee(String name, Date hireDate, int salary, boolean working) {
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
		this.working = working;

		employeeID = ++COUNTER;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getID() {
		return this.employeeID;
	}

	public void setID(int employeeID) {
		this.employeeID = employeeID;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", hireDate=" + hireDate + ", salary=" + salary + ", employeeID=" + employeeID
				+ ", working=" + working + "]";
	}

}
