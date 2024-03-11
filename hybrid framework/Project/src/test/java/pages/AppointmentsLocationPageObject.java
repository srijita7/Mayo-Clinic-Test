package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import uistore.AppointmentsLocationPageLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class AppointmentsLocationPageObject extends AppointmentsLocationPageLocators {
	WebDriverHelper webDriverHelper;
	Reporter reports=new Reporter();

	String outsideOfUSClick="clicked on Outside of US";

	public void clickOnLocationOutsideUS(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getOutsideOfUS(), 10);
			webDriverHelper.clickOnElement(getOutsideOfUS());
			LoggerHandler.logInfo(outsideOfUSClick);
			extentTest.pass(outsideOfUSClick);
		} catch (Exception e) {
			LoggerHandler.logError("not "+outsideOfUSClick);
			extentTest.fail("not "+outsideOfUSClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
}
