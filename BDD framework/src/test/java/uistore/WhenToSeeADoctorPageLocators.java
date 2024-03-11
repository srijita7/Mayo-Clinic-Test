package uistore;

import org.openqa.selenium.By;

public class WhenToSeeADoctorPageLocators {
	private By whenToSeeADoctorHeader=By.xpath("//h2[text()='When to see a doctor']");
	private By clickHereForAnEmailPreviewLink=By.xpath("//a[text()='Click here for an email preview.']");
	
	public By getWhenToSeeADoctorHeader() {
		return whenToSeeADoctorHeader;
	}
	public By getClickHereForAnEmailPreviewLink() {
		return clickHereForAnEmailPreviewLink;
	}
}
