package domain;

public class Accountant extends Employee {

	public Accountant(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Accountant accounting...");
	}

	private void sumValues() {
		System.out.println("Counting beans");
	}

	@Override
	public void preformDuties() {
		sumValues();
	}

}
