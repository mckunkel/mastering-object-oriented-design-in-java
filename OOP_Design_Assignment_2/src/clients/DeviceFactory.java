package clients;

import processes.GeneralManufacturingProcess;
import processes.SmartphoneManufacturingProcess;

public class DeviceFactory {

	public static void main(String[] args) {
		GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("iPhone process");
		manufacturer.launchProcess();
	}

}
