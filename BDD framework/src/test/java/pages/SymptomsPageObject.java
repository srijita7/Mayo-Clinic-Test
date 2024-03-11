package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.SymptomsPageLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class SymptomsPageObject extends SymptomsPageLocators {
	WebDriverHelper webDriverHelper;

	String keyClick = "clicked on Key C";
	String coughClick = "clicked on cough";

	Reporter reports=new Reporter();

	public void clickOnKeyC(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getKeyC(), 10);
			webDriverHelper.clickOnElement(getKeyC());
			LoggerHandler.logInfo(keyClick);
			extentTest.pass(keyClick);
		} catch (Exception e) {
			LoggerHandler.logError("not " + keyClick);
			extentTest.fail("not " + keyClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickOnCough(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getCough(), 10);
			webDriverHelper.clickOnElement(getCough());
			LoggerHandler.logInfo(coughClick);
			extentTest.pass(coughClick);
		} catch (Exception e) {
			LoggerHandler.logError("not " + coughClick);
			extentTest.fail("not " + coughClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
}
