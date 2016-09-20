package observers;

public interface WaitingCustomer {

	void orderReady(String preparedDrink);

	public String getName();

	public String getDrinkOrdered();

}
