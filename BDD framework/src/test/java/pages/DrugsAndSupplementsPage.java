package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import uistore.DrugsAndSupplementsLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class DrugsAndSupplementsPage {
	DrugsAndSupplementsLocators drugsAndSupplementsLocatorsObject = new DrugsAndSupplementsLocators();
	Reporter reporter=new Reporter();
	public void clickSearchDrugsAndSupplementsBar(WebDriver driver, ExtentTest test) {

		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			driverHelper.clickOnElement(drugsAndSupplementsLocatorsObject.getSearchDrugsAndSupplementsBar());
			LoggerHandler.logInfo("click on drugs and supplements input bar successfull");
			test.pass("click on drugs and supplements input bar successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("click on drugs and supplements input bar failed");
			test.fail("click on drugs and supplements input bar failed");
		}
	}

	public void sendAcetaminophen(WebDriver driver, ExtentTest test, int row, int col) {
		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		ExcelReader excelReader=new ExcelReader();
		try {
			String Acetaminophen = excelReader.readExcel("Sheet1", row, col);
			driverHelper.sendKeys(drugsAndSupplementsLocatorsObject.getSearchDrugsAndSupplementsBar(),
			Acetaminophen);
			LoggerHandler.logInfo("send input in search drugs and supplents bar successfull");
			test.pass("send input in search drugs and supplents bar successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("send input in search drugs and supplents bar failed");
			test.fail("send input in search drugs and supplents bar failed");
		}
	}

	public void clickSearchButton(WebDriver driver, ExtentTest test) {

		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			driverHelper.clickOnElement(drugsAndSupplementsLocatorsObject.getSearchButton());
			LoggerHandler.logInfo("click on search button successfull");
			test.pass("click on search button successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("click on search button failed");
			test.fail("click on search button failed");
		}
	}

	public void clickAcetaminophen(WebDriver driver,  ExtentTest test) {

		WebDriverHelper driverHelper = new WebDriverHelper(driver);
		try {
			driverHelper.clickOnElement(drugsAndSupplementsLocatorsObject.getAcetaminophen());
			LoggerHandler.logInfo("click on acetaminophen article successfull");
			test.pass("click on acetaminophen article successfull");
		} catch (Exception e) {
			reporter.addScreenshotToReport(driver, test);
			LoggerHandler.logError("click on acetaminophen article failed");
			test.fail("click on acetaminophen article failed");
		}
	}
}
