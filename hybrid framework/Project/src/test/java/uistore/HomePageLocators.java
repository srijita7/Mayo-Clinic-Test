package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
	private By requestAppointmentLink = By.xpath("//span[text()='Request appointment']");
	private By healthLibraryOption = By.xpath("//span[@class='cmp-tab__button-title'][contains(text(),'Health')]");
	private By symptomsOption = By.xpath("//span[@class='cmp-button__text'][text()='Symptoms']");
	private By searchBar = By.xpath("//input[@id='search-input-globalsearch-a02e2c35b8']");
	private By searchButton = By.xpath("(//span[contains(text(),'Search')])[5]");
	private By careAtMayo = By.xpath("//button[@data-di-id='di-id-4525827b-3b9d719f']");
	private By findDoctor = By.xpath("//a[@data-di-id='#button-66c7ae1b58']");
	private By newsletter=By.xpath("//span[text()='Sign up for free e-newsletters']");
	private By pneumoniaCause=By.xpath("//b[contains(text(),'cause')]");

	public By getCareAtMayo() {
		return careAtMayo;
	}

	public By getNewsletter() {
		return newsletter;
	}

	public By getPneumoniaCause() {
		return pneumoniaCause;
	}

	public By getFindDoctor() {
		return findDoctor;
	}

	private By testProcedure = By.xpath("(//span[@class='cmp-button__text'][text()='Tests & Procedures'])[1]");
	private By healthyLifestyle = By.xpath("(//span[@class='cmp-button__text'][text()='Healthy Lifestyle'])[1]");
	private By clickGivingtomayo = By.xpath("//button[@data-di-id='di-id-2efe4273-dd7c55b']");
	private By clickgivenow = By.xpath("(//a[@href='https://philanthropy.mayoclinic.org/donateMC'])[1]");
	private String bookSubs = "//a[@id='button-6802ac6a46']";
	private String exporeCareer = "//a[@id='button-ecaf322194']";
	private String acceptAlert = "//button[@id='system-ialert-button']";

	public By getRequestAppointmentLink() {
		return requestAppointmentLink;
	}

	public By getSearchBar() {
		return searchBar;
	}

	public By getSearchButton() {
		return searchButton;
	}

	public By getClickGivingtomayo() {
		return clickGivingtomayo;
	}

	public By getClickgivenow() {
		return clickgivenow;
	}

	public By getHealthLibraryOption() {
		return healthLibraryOption;
	}

	public By getSymptomsOption() {
		return symptomsOption;
	}

	public String getBookSubs() {
		return bookSubs;
	}

	public String getExporeCareer() {
		return exporeCareer;
	}

	public String getAcceptAlert() {
		return acceptAlert;
	}

	public By getTestProcedure() {
		return testProcedure;
	}

	public By getHealthyLifestyle() {
		return healthyLifestyle;
	}
	
	private By searchIcon=By.xpath("//span[@class='cmp-search-button__innerButton']");

	public By getSearchIcon() {
		return searchIcon;
	}
	
	private By topSearchBar=By.xpath("//span[text()='Search by keyword or phrase']//preceding::input");

	public By getTopSearchBar() {
		return topSearchBar;
	}
		
	
}

	      

	
		
	

	
		
	

	

	 

	

	