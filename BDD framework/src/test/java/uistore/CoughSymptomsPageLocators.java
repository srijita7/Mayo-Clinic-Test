package uistore;

import org.openqa.selenium.By;

public class CoughSymptomsPageLocators {
	private By whenToSeeADoctorLink=By.xpath("(//a[text()='When to see a doctor'])[2]");
	public By getWhenToSeeADoctorLink() {
		return whenToSeeADoctorLink;
	}
}
