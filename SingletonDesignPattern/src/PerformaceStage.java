
public class PerformaceStage {

	private static PerformaceStage INSTANCE = null;
	private static int counter;

	// private constructor for singleton
	private PerformaceStage() {
		counter++;
	}

	public synchronized static PerformaceStage getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PerformaceStage();
		}
		return INSTANCE;
	}

	public void turnOnLights() {
		System.out.println("Turned on lights...");
	}

	public int getCounter() {
		return counter;
	}
}
