package user;

import devices.Projector;
import devices.SurroundSoundSystem;
import devices.TV;
import remotes.RemoteControl;

public class Person {

	public static void main(String[] args) {
		// Lets make some devices
		TV tv = new TV();
		Projector projector = new Projector();
		SurroundSoundSystem surSsys = new SurroundSoundSystem();

		// lets play with the remote
		RemoteControl remoteControl = RemoteControl.getInstance();
		remoteControl.connectToDevice(projector);
		remoteControl.clickOnButon();

		remoteControl.connectToDevice(tv);
		remoteControl.clickOnButon();

		remoteControl.connectToDevice(surSsys);
		remoteControl.clickOnButon();

	}

}
