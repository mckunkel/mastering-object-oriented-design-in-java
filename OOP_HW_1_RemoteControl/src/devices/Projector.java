package devices;

public class Projector implements Device {

	@Override
	public void turnOff() {
		System.out.println("Projector has been turned off");
	}

	@Override
	public void turnOn() {
		System.out.println("Projector has been turned on");
	}

	@Override
	public String toString() {
		return "Projector";
	}

}
