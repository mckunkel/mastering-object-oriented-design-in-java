package domain;

public class Customer {

	private String gender;
	private double time;
	private String department;
	private boolean purchase;

	public Customer(String gender, double time, String department, boolean purchase) {
		super();
		this.gender = gender;
		this.time = time;
		this.department = department;
		this.purchase = purchase;
	}

	@Override
	public String toString() {
		return "Customer [gender=" + gender + ", time=" + time + ", department=" + department + ", purchase=" + purchase
				+ "]";
	}

}
