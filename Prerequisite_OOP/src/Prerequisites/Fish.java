package Prerequisites;
public class Fish extends Animal {

	public Fish(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
	}

	@Override
	public void eat() {
		System.out.println("eating inside Fish class...");
	}

	public void swim() {
		System.out.println("swimming...");
	}

	@Override
	public void move() {
		System.out.println("The fish is swimming");
	}

}
