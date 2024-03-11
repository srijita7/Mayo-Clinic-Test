package pages;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.WhenToSeeADoctorPageLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class WhenToSeeADoctorPageObject extends WhenToSeeADoctorPageLocators {
	WebDriverHelper webDriverHelper;

	String headerTextFetch = "fetched header text";
	String headerTextVerify = "verified header text";
	String emailPreviewScroll="scrolled to click here for an email preview";
	String emailPreviewClick = "clicked on click here for an email preview";
	String actualText=" | Actual text : ";
	String expectedText=" | Expected Text : ";

	Reporter reports=new Reporter();

	public String getHeaderText(WebDriver driver, ExtentTest extentTest) {
		String whenToSeeADoctorHeaderText = "";
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getWhenToSeeADoctorHeader(), 10);
			whenToSeeADoctorHeaderText = webDriverHelper.getText(getWhenToSeeADoctorHeader());
			LoggerHandler.logInfo(headerTextFetch+" : "+whenToSeeADoctorHeaderText);
			extentTest.pass(headerTextFetch+" : "+whenToSeeADoctorHeaderText);
		} catch (Exception e) {
			LoggerHandler.logError("not " + headerTextFetch+" : "+whenToSeeADoctorHeaderText);
			extentTest.fail("not " + headerTextFetch+" : "+whenToSeeADoctorHeaderText);
			reports.addScreenshotToReport(driver, extentTest);
		}
		return whenToSeeADoctorHeaderText;
	}

	public void verifyHeaderText(WebDriver driver, ExtentTest extentTest, String expectedHeaderText, String actualHeaderText) {
		try {
			Assert.assertEquals(actualHeaderText, expectedHeaderText);
			LoggerHandler.logInfo(headerTextVerify+actualText+actualHeaderText+expectedText+expectedHeaderText);
			extentTest.pass(headerTextVerify+actualText+actualHeaderText+expectedText+expectedHeaderText);
			Screenshot.getScreenShot(driver);
			reports.addScreenshotToReport(driver, extentTest);
		} catch (Throwable e) {
			LoggerHandler.logError("not " +headerTextVerify+actualText+actualHeaderText+expectedText+expectedHeaderText);
			extentTest.fail("not " +headerTextVerify+actualText+actualHeaderText+expectedText+expectedHeaderText);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void scrollToClickHereForAnEmailPreview(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.javascriptScroll(getClickHereForAnEmailPreviewLink());
			LoggerHandler.logInfo(emailPreviewScroll);
			extentTest.pass(emailPreviewScroll);
		} catch (Exception e) {
			LoggerHandler.logError("not " + emailPreviewScroll);
			extentTest.fail("not " + emailPreviewScroll);
			reports.addScreenshotToReport(driver, extentTest);
		}
    }

	public void clickOnClickHereForAnEmailPreviewLink(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.clickOnElement(getClickHereForAnEmailPreviewLink());
			LoggerHandler.logInfo(emailPreviewClick);
			extentTest.pass(emailPreviewClick);
		} catch (Exception e) {
			LoggerHandler.logError("not " + emailPreviewClick);
			extentTest.fail("not " + emailPreviewClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

}
