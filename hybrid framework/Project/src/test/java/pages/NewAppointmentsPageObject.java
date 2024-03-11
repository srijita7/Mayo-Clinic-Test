package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.NewAppointmentsPageLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NewAppointmentsPageObject extends NewAppointmentsPageLocators {
	WebDriverHelper webDriverHelper;

	String continueClick="clicked on Continue";
	String startClick="clicked on Start";
	String yesClick="clicked on Yes";
	String medicalRecordsClick="clicked on I do not have any medical records";
	String sectionTextFetch="fetched Patient Information section text";
	String sectionTextVerify="verified section text";
	String logoClick="clicked on Mayo clinic logo";
	String exitRequestButtonClick="clicked on Exit Request button";
	String actualText=" | Actual text : ";
	String expectedTest=" | Expected Text : ";

	Reporter reports=new Reporter();

	public void clickOnContinue(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getContinueOption(), 10);
			webDriverHelper.clickOnElement(getContinueOption());
			LoggerHandler.logInfo(continueClick);
			extentTest.pass(continueClick);
		} catch (Exception e) {
			LoggerHandler.logError("not "+continueClick);
			extentTest.fail("not "+continueClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickOnStart(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getStartOption(), 10);
			webDriverHelper.clickOnElement(getStartOption());
			LoggerHandler.logInfo(startClick);
			extentTest.pass(startClick);
		} catch (Exception e) {
			LoggerHandler.logError("not "+startClick);
			extentTest.fail("not "+startClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickOnYes(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getYesOption(), 10);
			webDriverHelper.clickOnElement(getYesOption());
			LoggerHandler.logInfo(yesClick);
			extentTest.pass(yesClick);
		} catch (Exception e) {
			LoggerHandler.logError("not "+yesClick);
			extentTest.fail("not "+yesClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickOnIDoNotHaveAnyMedicalRecords(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getDoNotHaveMedicalRecordsOption(), 10);
			webDriverHelper.clickOnElement(getDoNotHaveMedicalRecordsOption());
			LoggerHandler.logInfo(medicalRecordsClick);
			extentTest.pass(medicalRecordsClick);
		} catch (Exception e) {
			LoggerHandler.logError("not "+medicalRecordsClick);
			extentTest.fail("not "+medicalRecordsClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public String getPatientInformationSectionText(WebDriver driver, ExtentTest extentTest) {
		String patientInformationSectionText = "";
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getPatientInformationSection(), 10);
			patientInformationSectionText = webDriverHelper.getText(getPatientInformationSection());
			LoggerHandler.logInfo(sectionTextFetch+" : "+patientInformationSectionText);
			extentTest.pass(sectionTextFetch+" : "+patientInformationSectionText);
		} catch (Exception e) {
			LoggerHandler.logError("not "+sectionTextFetch+" : "+patientInformationSectionText);
			extentTest.fail("not "+sectionTextFetch+" : "+patientInformationSectionText);
			reports.addScreenshotToReport(driver, extentTest);
		}
		return patientInformationSectionText;
	}

	public void verifyPatientInformationSectionText(WebDriver driver, ExtentTest extentTest, String expectedSectionText, String actualSectionText) {
		try {
			Assert.assertEquals(actualSectionText, expectedSectionText);
			LoggerHandler.logInfo(sectionTextVerify+actualText+actualSectionText+expectedTest+expectedSectionText);
			extentTest.pass(sectionTextVerify+actualText+actualSectionText+expectedTest+expectedSectionText);
			Screenshot.takess(driver);
			reports.addScreenshotToReport(driver, extentTest);
		} catch (Throwable e) {
			LoggerHandler.logError("not "+sectionTextVerify+actualText+actualSectionText+expectedTest+expectedSectionText);
			extentTest.fail("not "+sectionTextVerify+actualText+actualSectionText+expectedTest+expectedSectionText);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickOnLogo(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.clickOnElement(getLogoImg());
			LoggerHandler.logInfo(logoClick);
			extentTest.pass(logoClick);
		} catch (Exception e) {
			LoggerHandler.logError("not "+logoClick);
			extentTest.fail("not "+logoClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickOnExitRequestButton(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeClickable(getExitRequestButton(), 10);
			webDriverHelper.clickOnElement(getExitRequestButton());
			LoggerHandler.logInfo(exitRequestButtonClick);
			extentTest.pass(exitRequestButtonClick);
		} catch (Exception e) {
			LoggerHandler.logError("not "+exitRequestButtonClick);
			extentTest.fail("not "+exitRequestButtonClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
}
