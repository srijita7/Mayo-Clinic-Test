package uistore;

import org.openqa.selenium.By;

public class PneumoniaPageLocators {
	private By firstLink=By.xpath("(//ol[@class='navlist search-results']//a)[1]");
	private By diagnosisAndTreatment=By.xpath("//a[text()='Diagnosis &']");
	private By imageText=By.xpath("//span[contains(text(),'Chest X-ray showing pneumonia')]");
	public By getFirstLink() {
		return firstLink;
	}
	public By getDiagnosisAndTreatment() {
		return diagnosisAndTreatment;
	}
	public By getImageText() {
		return imageText;
	}
	
	
	
}
