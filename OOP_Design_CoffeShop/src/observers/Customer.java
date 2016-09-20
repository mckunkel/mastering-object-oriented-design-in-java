package observers;

public class Customer implements WaitingCustomer {

	public String name;
	public String drinkOrdered;

	public Customer(String name, String drinkOrdered) {
		this.name = name;
		this.drinkOrdered = drinkOrdered;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDrinkOrdered() {
		return drinkOrdered;
	}

	@Override
	public void orderReady(String preparedDrink) {
		if (drinkOrdered.equals(preparedDrink)) {
			exitStore();
		}
	}

	private void exitStore() {
		System.out.println(name + ": Thank you, I have received my " + drinkOrdered
				+ ". I am no longer a zombie and will be leaving the store now...");
	}
}
