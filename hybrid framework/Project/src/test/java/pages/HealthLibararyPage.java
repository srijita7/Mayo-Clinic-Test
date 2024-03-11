package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import uistore.HealthLibraryLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class HealthLibararyPage extends HealthLibraryLocators {
	WebDriverHelper webDriverHelper;
	Reporter reporter=new Reporter();
	public void clickDrugsAndSupplements(WebDriver driver,ExtentTest test) {
		webDriverHelper = new WebDriverHelper(driver);
		try {
			webDriverHelper.waitForElementToBeClickable(getDrugsAndSupplements(), 10);
			webDriverHelper.hoverOverElement(getDrugsAndSupplements());
			webDriverHelper.clickOnElement(getDrugsAndSupplements());
			LoggerHandler.logInfo("click on drugs and supplements successfull");
			test.pass("click on drugs and supplements successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("click on drugs and supplements failed");
			test.fail("click on drugs and supplements failed");
		}
	}

}
