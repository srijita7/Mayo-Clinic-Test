package uistore;

import org.openqa.selenium.By;

public class TestProceduresLocator {


private By keywordM = By.xpath("//span[text()='M']");
 public By getKeywordM() {
	return keywordM;
}
private By mri = By.xpath("(//a[@href='/tests-procedures/mri/about/pac-20384768'])[2]");
public By getMri() {
   return mri;
}
private By overviewHeader = By.xpath("//h2[text()='Overview']");
public By getOverviewHeader() {
	return overviewHeader;
}
}
