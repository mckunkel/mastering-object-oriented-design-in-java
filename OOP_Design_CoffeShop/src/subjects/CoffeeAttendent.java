package subjects;

import java.util.ArrayList;
import java.util.List;

import observers.Customer;

public class CoffeeAttendent {

	private List<Customer> zombies;
	private List<String> completedDrinks;

	public CoffeeAttendent() {
		zombies = new ArrayList<Customer>();
		completedDrinks = new ArrayList<String>();
	}

	public void takeOrder(Customer customer) {
		zombies.add(customer);
		System.out.println("Coffee Attendent: '" + customer.getName() + ", I've started working on your order of "
				+ customer.getDrinkOrdered() + ". Please do not eat my brains!'");
	}

	public void prepareDrink(String drinkToBePrepared) {
		double timeTaken = Math.random() * 10; // give value between 1 and 50
		try {
			Thread.sleep((long) (timeTaken) * 1000);
			completedDrinks.add(drinkToBePrepared);
		} catch (InterruptedException e) {
			System.out.println(" for some reason, drink was not prepared..");
		}

	}

	public void callOutCompletedOrders() {
		for (String readyDrink : completedDrinks) {
			System.out.println("Order up: " + readyDrink);
			for (Customer customer : zombies) {
				customer.orderReady(readyDrink);
			}
		}

	}

}
