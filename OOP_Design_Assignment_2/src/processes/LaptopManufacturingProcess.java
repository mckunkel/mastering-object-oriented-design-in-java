package processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {

	public LaptopManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assembleDevice() {
		System.out.println("assembled laptop");
	}

	@Override
	public void testDevice() {
		System.out.println("tested laptop");

	}

	@Override
	public void packageDevice() {
		System.out.println("packaged laptop");

	}

	@Override
	public void storeDevice() {
		System.out.println("stored laptop");

	}

}
