
public class M4UserInterface extends UserInterface {

	private void checkButton() {
		int buttonStatus = CoffeeMakerAPI.api.getBrewButtonStatus();
		if (buttonStatus == CoffeeMakerAPI.BREW_BUTTON_PUSHED) {
			startBrewing();
		}
	}

}
