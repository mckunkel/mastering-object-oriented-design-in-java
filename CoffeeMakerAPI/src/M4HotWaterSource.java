
public class M4HotWaterSource extends HotWaterSource {

	private CoffeeMakerAPI api;

	public M4HotWaterSource(CoffeeMakerAPI api) {
		this.api = api;
	}

	@Override
	public boolean isReady() {
		int boilerStatus = api.getBoilerStatus();
		return boilerStatus == api.BOILER_NOT_EMPTY;
	}

	@Override
	public void start() {
		api.setReliefValveState(api.VALVE_CLOSED);
		api.setBoilerState(api.BOILER_ON);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
