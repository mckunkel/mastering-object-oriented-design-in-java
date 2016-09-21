package factoryDesignPattern;

public class Truck implements Vehicle {
	@Override
	public void startEngine() {
		System.out.println("started truck engine...");
	}
}
