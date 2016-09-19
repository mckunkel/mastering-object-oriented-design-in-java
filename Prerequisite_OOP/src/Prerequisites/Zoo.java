package Prerequisites;
public class Zoo {

	public static void main(String args[]) {

		Animal sparrow1 = new Sparrow(12, "M", 23);
		Animal fish1 = new Fish(3, "M", 10);
		// Bird bird1 = new Bird(3, "F", 10);
		//
		// Chicken chick1 = new Chicken(4, "M", 23);
		//
		// fish1.swim();
		// fish1.eat();
		// bird1.eat();
		// sparrow1.move();
		// fish1.move();
		moveAnimal(fish1);
		moveAnimal(sparrow1);

		Flyable flyingBird = new Sparrow(13, "F", 12);

		flyingBird.fly();

	}

	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
