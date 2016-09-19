package domain;

public class Doctor extends Employee {

	public Doctor(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Doctor in action...");
	}

	// doctors
	private void prescribeMedicine() {
		System.out.println("Prescribe Medicine");
	}

	private void diagnosePatient() {
		System.out.println("Diagnosing Patient");
	}

	@Override
	public void preformDuties() {
		prescribeMedicine();
		diagnosePatient();
	}
}
