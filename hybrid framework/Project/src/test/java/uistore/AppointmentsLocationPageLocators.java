package uistore;

import org.openqa.selenium.By;

public class AppointmentsLocationPageLocators {
	private By outsideOfUS=By.xpath("//p[text()='Outside of the U.S.']");

	public By getOutsideOfUS() {
		return outsideOfUS;
	}
}
