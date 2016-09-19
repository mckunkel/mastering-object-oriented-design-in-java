package devices;

public class SurroundSoundSystem implements Device {

	@Override
	public void turnOff() {
		System.out.println("Sound system has been turned off");
	}

	@Override
	public void turnOn() {
		System.out.println("Sound system has been turned on");
	}

	@Override
	public String toString() {
		return "SurroundSoundSystem";
	}

}
