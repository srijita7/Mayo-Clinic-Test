package uistore;

import org.openqa.selenium.By;

public class HealthLibraryLocators {
    private By drugsAndSupplements=By.xpath("(//span[@class='cmp-button__text'][text()='Drugs & Supplements'])[1]");

	public By getDrugsAndSupplements() {
		return drugsAndSupplements;
	}
}
