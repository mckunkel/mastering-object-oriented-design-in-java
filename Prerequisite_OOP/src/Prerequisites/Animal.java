package Prerequisites;
public abstract class Animal {
	int age;
	String gender;
	int weightInLbs;

	public Animal(int age, String gender, int weightInLbs) {
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}

	public void eat() {
		System.out.println("eating...");
	}

	public void sleep() {
		System.out.println("working...");
	}

	public abstract void move();

}
