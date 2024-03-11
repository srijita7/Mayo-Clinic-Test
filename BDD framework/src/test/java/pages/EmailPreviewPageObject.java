package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.EmailPreviewPageLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class EmailPreviewPageObject extends EmailPreviewPageLocators{
	WebDriverHelper webDriverHelper;
	
	String getCareNowScroll="scrolled to Get Care Now";
	String getCareNowClick="clicked on Get Care Now";

	Reporter reports=new Reporter();
	
	public void scrollToGetCareNow(WebDriver driver, ExtentTest extentTest) {
			try {
				webDriverHelper = new WebDriverHelper(driver);
				webDriverHelper.javascriptScroll(getGetCareNowOption());
				LoggerHandler.logInfo(getCareNowScroll);
				extentTest.pass(getCareNowScroll);
			} catch (Exception e) {
				LoggerHandler.logError("not " + getCareNowScroll);
				extentTest.fail("not " + getCareNowScroll);
				reports.addScreenshotToReport(driver, extentTest);
			}
    }
	
	public void clickOnGetCareNow(WebDriver driver, ExtentTest extentTest)
	{
		try {
			webDriverHelper=new WebDriverHelper(driver);
			webDriverHelper.clickOnElement(getGetCareNowOption());
			LoggerHandler.logInfo(getCareNowClick);
			extentTest.pass(getCareNowClick);
		} catch (Exception e) {
			LoggerHandler.logError("not "+getCareNowClick);
			extentTest.fail("not "+getCareNowClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
}
