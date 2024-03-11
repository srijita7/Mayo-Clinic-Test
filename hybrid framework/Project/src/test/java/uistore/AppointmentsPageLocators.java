package uistore;

import org.openqa.selenium.By;
public class AppointmentsPageLocators {
	private By newPatients=By.xpath("//a[@href='/appointments/location']");
	private By headerText=By.xpath("(//h2[@class='  cmp-link-item-robust__headline'])[1]");
	private By titleText=By.xpath("//div[@data-testid='cmp-title']");
	private By referringPhysicians=By.xpath("//*[text()='Referring physicians']");
	private By medDept=By.xpath("//a[text()='medical departments and centers at each Mayo Clinic campus']");
	private By radiology=By.xpath("//a[text()='Radiology']");
	private By advancedImagingText=By.xpath("//*[text()='Advanced imaging for complex conditions']");
	private By returningPatients=By.xpath("//*[text()='Returning patients']");
	private By notSeenMayoClinicProvider=By.xpath("//*[text()='No']");
	private By requestAnAppointmentText=By.xpath("//h1[text()='The easiest way to request an appointment for a new concern is to call us or submit an online request.']");
	

	public By getReferringPhysicians() {
		return referringPhysicians;
	}


	public By getRequestAnAppointmentText() {
		return requestAnAppointmentText;
	}


	public By getMedDept() {
		return medDept;
	}


	public By getReturningPatients() {
		return returningPatients;
	}


	public By getNotSeenMayoClinicProvider() {
		return notSeenMayoClinicProvider;
	}


	public By getRadiology() {
		return radiology;
	}


	public By getAdvancedImagingText() {
		return advancedImagingText;
	}


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
