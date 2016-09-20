
public class LargeEngine implements Engine {

	private int horsePower;

	public LargeEngine(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public void startEngine() {
		System.out.println("started large " + horsePower + " hp engine");
	}
}
