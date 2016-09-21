
public class UserInterface {
	private HotWaterSource hws;
	private ContainmentVessel cv;

	public void done() {
	}

	public void complete() {
	}

	protected void startBrewing() {
		if (hws.isReady() && cv.isReady()) {
			hws.start();
			cv.start();
		}

	}

}
