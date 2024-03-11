package uistore;

import org.openqa.selenium.By;

public class NewAppointmentsPageLocators {
	private By continueOption=By.xpath("//button[text()=' Continue ']");
	private By startOption=By.xpath("//button[text()=' Start ']");
	private By yesOption=By.xpath("//div[contains(text(),'Yes')]");
	private By doNotHaveMedicalRecordsOption=By.xpath("//div[text()='I do not have any medical records ']");
	private By patientInformationSection=By.xpath("//span[@class='section-text']");
	private By logoImg=By.xpath("//img[@class='logo-image']");
	private By exitRequestButton=By.xpath("(//button[text()=' Exit the request '])[3]");
	public By getContinueOption() {
		return continueOption;
	}
	public By getStartOption() {
		return startOption;
	}
	public By getYesOption() {
		return yesOption;
	}
	public By getDoNotHaveMedicalRecordsOption() {
		return doNotHaveMedicalRecordsOption;
	}
	public By getPatientInformationSection() {
		return patientInformationSection;
	}
	public By getLogoImg() {
		return logoImg;
	}
	public By getExitRequestButton() {
		return exitRequestButton;
	}
	
}
