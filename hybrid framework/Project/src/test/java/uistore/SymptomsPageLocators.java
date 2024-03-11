package uistore;

import org.openqa.selenium.By;

public class SymptomsPageLocators {
	private By keyC=By.xpath("//span[text()='C']");
	private By cough=By.xpath("//a[text()='Cough']");
	private By oneOrMoreSymptoms=By.xpath("//a[text()='Check on one or more symptoms to find possible causes.']");
	private By eyeDiscomfort=By.xpath("//a[text()='Eye discomfort and redness in adults']");
	private By redness=By.xpath("//label[text()='Redness']");
	private By findCauses=By.xpath("//input[@value='Find causes']");
	private By pinkEye=By.xpath("//a[text()='Pink eye (conjunctivitis)']");
	private By imageText=By.xpath("//span[contains(text(),'Pink eye')]");
	
	public By getKeyC() {
		return keyC;
	}
	public By getCough() {
		return cough;
	}
	public By getOneOrMoreSymptoms() {
		return oneOrMoreSymptoms;
	}
	public By getEyeDiscomfort() {
		return eyeDiscomfort;
	}
	public By getRedness() {
		return redness;
	}
	public By getFindCauses() {
		return findCauses;
	}
	public By getPinkEye() {
		return pinkEye;
	}
	public By getImageText() {
		return imageText;
	}
	
	
	
	
}
