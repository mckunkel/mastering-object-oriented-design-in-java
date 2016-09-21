
public class App {
	public static void main(String[] args) {
		PerformaceStage stage = PerformaceStage.getInstance();
		stage.turnOnLights();

		System.out.println(stage.getCounter());

		PerformaceStage stage2 = PerformaceStage.getInstance();
		System.out.println(stage.getCounter());

	}

}
