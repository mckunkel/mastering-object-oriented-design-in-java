
public class M4ContainmentVessel extends ContainmentVessel implements Pollable {

	private CoffeeMakerAPI api;
	private boolean isBrewing;

	public M4ContainmentVessel(CoffeeMakerAPI api) {
		this.api = api;
		isBrewing = false;
	}

	@Override
	public boolean isReady() {
		int plateStatus = api.getWarmerPlateStatus();
		return plateStatus == api.POT_EMPTY;
	}

	@Override
	public void start() {
		isBrewing = true;
	}

	@Override
	public void poll() {
		// TODO Auto-generated method stub
		
	}

}
