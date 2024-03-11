package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.PneumoniaPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class PneumoniaPageObject extends PneumoniaPageLocators{
	WebDriverHelper webDriverHelper;
	ExtentTest extentTest;
	Reporter reports = new Reporter();
	ExcelReader exRead=new ExcelReader();
	
	public void clickOnFirstLink(WebDriver driver, ExtentTest extentTest)
	{
		try {
			webDriverHelper=new WebDriverHelper(driver);
			webDriverHelper.clickOnElement(getFirstLink());
			LoggerHandler.logInfo("clicked on first link");
			extentTest.pass("clicked on first link");
		} catch (Exception e) {
			LoggerHandler.logError("not clicked on first link");
			extentTest.fail("not clicked on first link");
		}
	}
	
	public void clickOnDiagnosis(WebDriver driver, ExtentTest extentTest)
	{
		try {
			webDriverHelper=new WebDriverHelper(driver);
			webDriverHelper.clickOnElement(getDiagnosisAndTreatment());
			LoggerHandler.logInfo("clicked on diagnosis");
			extentTest.pass("clicked on diagnosis");
		} catch (Exception e) {
			LoggerHandler.logError("not clicked on diagnosis");
			extentTest.fail("not clicked on diagnosis");
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
