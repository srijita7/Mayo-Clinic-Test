package uistore;

import org.openqa.selenium.By;

public class FindDoctorLocators {
    private By searchBarDoc=By.xpath("//input[@id='azureSearchTerm']");
    private By selectLoc= By.xpath("//select[@id='SearchLocation']");
    private By location= By.xpath("//option[contains(text(),'Rochester, MN')]");
    private By searchButton= By.xpath("//input[@id='searchBtn']");
    private By firstResult= By.xpath("(//ol[@class='result-items']//h4)[1]");
    private By secureMessage= By.xpath("//a[@data-di-id='#biosSendSecureMessage']");
    private By verifyText=By.xpath("//p[@class='flywheel body-small font-bold margin-b-l']//a");
    public By getSearchBarDoc() {
        return searchBarDoc;
    }
    public By getSelectLoc() {
        return selectLoc;
    }
    public By getLocation() {
        return location;
    }
    public By getSearchButton() {
        return searchButton;
    }
    public By getFirstResult() {
        return firstResult;
    }
    public By getSecureMessage() {
        return secureMessage;
    }
    public By getVerifyText() {
        return verifyText;
    }
}
