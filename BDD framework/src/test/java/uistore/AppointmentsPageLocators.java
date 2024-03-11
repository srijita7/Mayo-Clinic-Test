package uistore;

import org.openqa.selenium.By;
public class AppointmentsPageLocators {
	private By newPatients=By.xpath("//a[@href='/appointments/location']");
	private By headerText=By.xpath("(//h2[@class='  cmp-link-item-robust__headline'])[1]");
	private By titleText=By.xpath("//div[@data-testid='cmp-title']");
	

	public By getHeaderText() {
		return headerText;
	}


	public By getTitleText() {
		return titleText;
	}


	public By getNewPatients() {
		return newPatients;
	}
	
}
