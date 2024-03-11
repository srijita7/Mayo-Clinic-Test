package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import runner.RunTest;
import uistore.SymptomsPageLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
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
	
	public void clickOnOneOrMoreSymptoms(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getOneOrMoreSymptoms(), 10);
			webDriverHelper.clickOnElement(getOneOrMoreSymptoms());
			LoggerHandler.logInfo("clicked on one or more symptoms");
			extentTest.pass("clicked on one or more symptoms");
		} catch (Exception e) {
			LoggerHandler.logError("not " + "clicked on one or more symptoms");
			extentTest.fail("not " + "clicked on one or more symptoms");
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
	
	public void clickOnEyeDiscomfort(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getEyeDiscomfort(), 10);
			webDriverHelper.clickOnElement(getEyeDiscomfort());
			LoggerHandler.logInfo("clicked on eye discomfort");
			extentTest.pass("clicked on eye discomfort");
		} catch (Exception e) {
			LoggerHandler.logError("not " + "clicked on eye discomfort");
			extentTest.fail("not " + "clicked on eye discomfort");
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
	
	public void clickOnRedness(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeClickable(getRedness(), 10);
			webDriverHelper.clickOnElement(getRedness());
			LoggerHandler.logInfo("clicked on redness");
			extentTest.pass("clicked on redness");
		} catch (Exception e) {
			e.printStackTrace();
			LoggerHandler.logError("not " + "clicked on redness");
			extentTest.fail("not " + "clicked on redness");
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
	
	public void clickOnFindCauses(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getFindCauses(), 10);
			webDriverHelper.clickOnElement(getFindCauses());
			LoggerHandler.logInfo("clicked on find causes");
			extentTest.pass("clicked on find causes");
		} catch (Exception e) {
			LoggerHandler.logError("not " + "clicked on find causes");
			extentTest.fail("not " + "clicked on find causes");
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
	
	public void clickOnPinkEye(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getPinkEye(), 10);
			webDriverHelper.clickOnElement(getPinkEye());
			LoggerHandler.logInfo("clicked on pink eye");
			extentTest.pass("clicked on pink eye");
		} catch (Exception e) {
			LoggerHandler.logError("not " + "clicked on pink eye");
			extentTest.fail("not " + "clicked on pink eye");
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
	
	public String getImageText(WebDriver driver, ExtentTest extentTest)
	{
		String imageText="";
		try {
			webDriverHelper=new WebDriverHelper(driver);
			imageText=webDriverHelper.getText(getImageText());
			LoggerHandler.logInfo("fetched image text");
			extentTest.pass("fetched image text");
		} catch (Exception e) {
			LoggerHandler.logError("not fetched image text");
			extentTest.fail("not fetched image text");
		}
		return imageText;
	}
	
	public void verifyImageText(WebDriver driver, ExtentTest extentTest, String expectedText, String actualText)
	{
		try {
			webDriverHelper=new WebDriverHelper(driver);
			Assert.assertTrue(actualText.contains(expectedText));
			LoggerHandler.logInfo("verified image text");
			extentTest.pass("verified image text");
			Screenshot.takess(driver);
		} catch (Throwable e) {
			LoggerHandler.logError("not verified image text");
			extentTest.fail("not verified image text");
		}
	}
}
