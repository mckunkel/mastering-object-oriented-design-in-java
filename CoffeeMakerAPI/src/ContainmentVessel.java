
public abstract class ContainmentVessel {
	private UserInterface ui;
	private HotWaterSource hws;
	protected boolean isBrewing;
	protected boolean isComplete;

	public ContainmentVessel() {
		isBrewing = false;
		isComplete = false;
	}

	public void init(UserInterface ui, HotWaterSource hws) {
		this.ui = ui;
		this.hws = hws;
	}

	public void start() {
		isBrewing = true;
		isComplete = false;
	}

	public void done() {
		isBrewing = false;
	}

	protected void declareComplete() {
		ui.done();
		isComplete = true;
	}

	protected void containerAvailable() {
		hws.resume();
	}

	protected void containerUnavailable() {
		hws.pause();
	}

	public abstract boolean isReady();

}
