package devices;

public class TV implements Device {

	@Override
	public void turnOff() {
		System.out.println("TV has been turned off");
	}

	@Override
	public void turnOn() {
		System.out.println("TV has been turned on");
	}

	@Override
	public String toString() {
		return "TV";
	}

}
