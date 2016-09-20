package clients;

import observers.Customer;
import subjects.CoffeeAttendent;

public class CofeeShop {
	public static void main(String[] args) {

		Customer robert = new Customer("Robert", "French Vanilla");
		Customer bill = new Customer("Bill", "Hot Coffee");

		CoffeeAttendent coffeeAttendent = new CoffeeAttendent();
		coffeeAttendent.takeOrder(robert);
		coffeeAttendent.takeOrder(bill);

		// prepare drink
		coffeeAttendent.prepareDrink("French Vanilla");
		coffeeAttendent.prepareDrink("Hot Coffee");

		// order up...
		coffeeAttendent.callOutCompletedOrders();

	}

}
