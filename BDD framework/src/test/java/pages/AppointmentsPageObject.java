package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import uistore.AppointmentsPageLocators;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.Reporter;

public class AppointmentsPageObject extends AppointmentsPageLocators {
	WebDriverHelper webDriverHelper;
	String newPatientsClick = "clicked on new patients";
	String headerTextFetch = "fetched header text";
	String verifyHeaderText = "verified header text";
	String titleTextFetch = "fetched title text";
	String verifyTitleText = "verified title text";
	String actualText=" | Actual text : ";
	String expectedText=" | Expected text : ";

	Reporter reports = new Reporter();

	public void clickOnNewPatients(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getNewPatients(), 10);
			webDriverHelper.clickOnElement(getNewPatients());
			LoggerHandler.logInfo(newPatientsClick);
			extentTest.pass(newPatientsClick);
		} catch (Exception e) {
			LoggerHandler.logError("not " + newPatientsClick);
			extentTest.fail("not " + newPatientsClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public String getHeaderText(WebDriver driver, ExtentTest extentTest) {
		String newPatientsHeaderText = "";
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getHeaderText(), 10);
			newPatientsHeaderText = webDriverHelper.getText(getHeaderText());
			LoggerHandler.logInfo(headerTextFetch+" : "+newPatientsHeaderText);
			extentTest.pass(headerTextFetch+" : "+newPatientsHeaderText);
		} catch (Exception e) {
			LoggerHandler.logError("not " + headerTextFetch+" : "+newPatientsHeaderText);
			extentTest.fail("not " + headerTextFetch+" : "+newPatientsHeaderText);
			reports.addScreenshotToReport(driver, extentTest);
		}
		return newPatientsHeaderText;
	}

	public void verifyHeaderText(WebDriver driver, ExtentTest extentTest, String expectedHeaderText, String actualHeaderText) {
		try {
			Assert.assertEquals(actualHeaderText, expectedHeaderText);
			LoggerHandler.logInfo(verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			extentTest.pass(verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			Screenshot.getScreenShot(driver);
			reports.addScreenshotToReport(driver, extentTest);
		} catch (Throwable e) {
			LoggerHandler.logError("not " + verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			extentTest.fail("not " + verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public String getTitleText(WebDriver driver, ExtentTest extentTest) {
		String startAppointmentTitleText = "";

		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.switchToNewWindow();
			webDriverHelper.waitForElementToBeVisible(getTitleText(), 10);
			startAppointmentTitleText = webDriverHelper.getText(getTitleText());
			LoggerHandler.logInfo(titleTextFetch+" : "+startAppointmentTitleText);
			extentTest.pass(titleTextFetch+" : "+startAppointmentTitleText);
		} catch (Exception e) {
			LoggerHandler.logError("not " + titleTextFetch+" : "+startAppointmentTitleText);
			extentTest.fail("not " + titleTextFetch+" : "+startAppointmentTitleText);
			reports.addScreenshotToReport(driver, extentTest);
		}
		return startAppointmentTitleText;
	}

	public void verifyTitleText(WebDriver driver, ExtentTest extentTest, String expectedTitleText, String actualTitleText) {
		try {
			Assert.assertEquals(actualTitleText, expectedTitleText);
			LoggerHandler.logInfo(verifyTitleText+actualText+actualTitleText+expectedText+expectedTitleText);
			extentTest.pass(verifyTitleText+actualText+actualTitleText+expectedText+expectedTitleText);
			Screenshot.getScreenShot(driver);
			reports.addScreenshotToReport(driver, extentTest);

		} catch (Throwable e) {
			LoggerHandler.logError("not " + verifyTitleText+actualText+actualTitleText+expectedText+expectedTitleText);
			extentTest.fail("not " + verifyTitleText+actualText+actualTitleText+expectedText+expectedTitleText);

			reports.addScreenshotToReport(driver, extentTest);

		}
	}
}
