package vehicles;

import parts.Engine;

public class Vehicle {

	private Engine myEngine;

	public Vehicle(Engine anEngine) {
		myEngine = anEngine;
	}

	public void crankIgnition() {
		myEngine.startEngine();
		System.out.println("Vehicle is running");
	}

}
