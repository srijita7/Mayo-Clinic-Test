package uistore;

import org.openqa.selenium.By;

public class DrugsAndSupplementsLocators {
    private By searchDrugsAndSupplementsBar=By.xpath("//input[@id='azureSearchBox']");
	private By searchButton=By.xpath("//input[@id='main_0_maincontent_1_SearchDS']");
	private By acetaminophen=By.xpath("//a[@data-di-id='di-id-e68bf2b7-870c430c']");
    public By getSearchDrugsAndSupplementsBar() {
        return searchDrugsAndSupplementsBar;
    }
    public By getSearchButton() {
        return searchButton;
    }
    public By getAcetaminophen() {
        return acetaminophen;
    }
}
