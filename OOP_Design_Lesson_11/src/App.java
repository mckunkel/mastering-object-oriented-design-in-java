
public class App {
	public static void main(String[] args) {

		User websiteUser = new User.Builder("bobMax", "bobMax@me.com").firstName("bob").lastName("Max").build();
		System.out.println(websiteUser);

		Vehicle aCar = new Vehicle.Builder("car").make("Ford").model("ThunderBird").build();
		System.out.println(aCar);

	}
}
