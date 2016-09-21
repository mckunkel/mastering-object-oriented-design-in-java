package factoryDesignPattern;

public class ElectricCar implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("pushed the button to start electric car...");
	}

}
