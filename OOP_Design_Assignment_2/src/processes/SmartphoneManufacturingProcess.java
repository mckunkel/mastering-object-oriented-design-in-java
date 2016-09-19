package processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

	public SmartphoneManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assembleDevice() {
		System.out.println("assembled smartphone");
	}

	@Override
	public void testDevice() {
		System.out.println("tested smartphone");

	}

	@Override
	public void packageDevice() {
		System.out.println("packaged smartphone");

	}

	@Override
	public void storeDevice() {
		System.out.println("stored smartphone");

	}

}
