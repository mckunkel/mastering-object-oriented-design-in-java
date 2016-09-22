
public class M4ContainmentVessel extends ContainmentVessel implements Pollable {

	private CoffeeMakerAPI api;
	private int lastPotStatus;

	public M4ContainmentVessel(CoffeeMakerAPI api) {
		this.api = api;
		lastPotStatus = api.POT_EMPTY;
	}

	@Override
	public boolean isReady() {
		int plateStatus = api.getWarmerPlateStatus();
		return plateStatus == api.POT_EMPTY;
	}

	@Override
	public void poll() {
		int potstatus = api.getWarmerPlateStatus();
		if (potstatus != lastPotStatus) {
			if (isBrewing) {
				handleBrewingEvent(potstatus);
			} else if (isComplete == false) {
				handleIncompleteEvent(potstatus);
			}
			lastPotStatus = potstatus;
		}
	}

	private void handleBrewingEvent(int potStatus) {
		if (potStatus == api.POT_NOT_EMPTY) {
			containerAvailable();
			api.setWarmerState(api.WARMER_ON);
		} else if (potStatus == api.WARMER_EMPTY) {
			containerUnavailable();
			api.setWarmerState(api.WARMER_OFF);
		} else { // potStatus == api.POT_EMPTY
			containerAvailable();
			api.setWarmerState(api.WARMER_OFF);
		}
	}

	private void handleIncompleteEvent(int potStatus) {
		if (potStatus == api.POT_NOT_EMPTY) {
			api.setWarmerState(api.WARMER_ON);
		} else if (potStatus == api.WARMER_EMPTY) {
			api.setWarmerState(api.WARMER_OFF);
		} else { // potStatus == api.POT_EMPTY
			declareComplete();
		}
	}
}
