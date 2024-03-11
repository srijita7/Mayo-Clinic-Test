package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.AcetaminophenLocators;
import utils.LoggerHandler;
import utils.WebDriverHelper;
import utils.Reporter;

public class AcetaminophenPage {
	AcetaminophenLocators acetaminophenLocatorsObject = new AcetaminophenLocators();
	Reporter reporter=new Reporter();
	public void scrollBeforeUse(WebDriver driver,ExtentTest test) {
		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			driverHelper.javascriptScroll(acetaminophenLocatorsObject.getBeforeUse());
			LoggerHandler.logInfo("scrolling until before use successfull");
			test.pass("scrolling until before use successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("scrolling until before use failed");
			test.fail("scrolling until before use failed");
		}
	}

	public void clickBeforeUse(WebDriver driver,ExtentTest test) {
		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			driverHelper.clickOnElement(acetaminophenLocatorsObject.getBeforeUse());
			LoggerHandler.logInfo("click on before use successfull");
			test.pass("click on before use successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("click on before use failed");
			test.fail("click on before use failed");
		}
	}

	public void scrollProperUse(WebDriver driver,ExtentTest test) {
		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			driverHelper.javascriptScroll(acetaminophenLocatorsObject.getProperUse());
			LoggerHandler.logInfo("scrolling until proper use successfull");
			test.pass("scrolling until proper use successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("scrolling until proper use failed");
			test.fail("scrolling until proper use failed");
		}
	}

	public void clickProperUse(WebDriver driver,ExtentTest test) {
		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			driverHelper.clickOnElement(acetaminophenLocatorsObject.getProperUse());
			LoggerHandler.logInfo("click on proper use successfull");
			test.pass("click on proper use successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("click on proper use failed");
			test.fail("click on proper use failed");
		}
	}

	public void scrollPrecautions(WebDriver driver,ExtentTest test) {
		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			driverHelper.javascriptScroll(acetaminophenLocatorsObject.getPrecautions());
			LoggerHandler.logInfo("Scrolling until precautions successfull");
			test.pass("Scrolling until precautions successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("scrolling until precautions failed");
			test.fail("scrolling until precautions failed");
		}
	}

	public void clickPrecautions(WebDriver driver,ExtentTest test) {
		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			driverHelper.clickOnElement(acetaminophenLocatorsObject.getPrecautions());
			LoggerHandler.logInfo("click on precautions successfull");
			test.pass("click on precautions successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("click on precautions failed");
			test.fail("click on precautions failed");
		}
	}

	public void scrollSideEffects(WebDriver driver,ExtentTest test) {
		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			driverHelper.javascriptScroll(acetaminophenLocatorsObject.getSideEffects());
			LoggerHandler.logInfo("scrolling until side effects successfull");
			test.pass("scrolling until side effects successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("scrolling until side effects failed");
			test.fail("scrolling until side effects failed");
		}
	}

	public void clickSideEffects(WebDriver driver,ExtentTest test) {
		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			driverHelper.clickOnElement(acetaminophenLocatorsObject.getSideEffects());
			LoggerHandler.logInfo("click on side effects successfull");
			test.pass("click on side effects successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("click on side effects failed");
			test.fail("click on side effects failed");
		}
	}
	public void verifySideEffectsText(WebDriver driver,ExtentTest test, String expectedText) {
		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			String actualText = driverHelper.getText(acetaminophenLocatorsObject.getSideEffectsText());
			Assert.assertTrue(actualText.contains(expectedText));
			LoggerHandler.logInfo("Side effects verified");
			test.pass("Side effects verified");
		} catch (AssertionError e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("Side effects verifying failed");
			test.fail("Side effects verifying failed");
		}
	}
}
