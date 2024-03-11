package uistore;

import org.openqa.selenium.By;

public class SymptomsPageLocators {
	private By keyC=By.xpath("//span[text()='C']");
	private By cough=By.xpath("//a[text()='Cough']");
	public By getKeyC() {
		return keyC;
	}
	public By getCough() {
		return cough;
	}
	
	
}
