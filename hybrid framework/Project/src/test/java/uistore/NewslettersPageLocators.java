package uistore;

import org.openqa.selenium.By;

public class NewslettersPageLocators {
	private By email=By.xpath("//input[@name='emailAddress']");
	private By firstName=By.xpath("//input[@name='firstName']");
	private By allCommunications=By.xpath("//a[contains(text(),'to opt in to all Mayo Clinic')]");
	private By submit=By.xpath("//input[@class='submit-button-style']");
	
	public By getEmail() {
		return email;
	}
	public By getFirstName() {
		return firstName;
	}
	public By getAllCommunications() {
		return allCommunications;
	}
	public By getSubmit() {
		return submit;
	}
	
	private By preferencesText=By.xpath("//span[contains(text(),'Thank you for updating your preferences')]");

	public By getPreferencesText() {
		return preferencesText;
	}
	
	
}
