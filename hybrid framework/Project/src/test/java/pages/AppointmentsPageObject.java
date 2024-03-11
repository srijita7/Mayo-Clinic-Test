package pages;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

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
			Screenshot.takess(driver);
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
			Screenshot.takess(driver);
			reports.addScreenshotToReport(driver, extentTest);

		} catch (Throwable e) {
			LoggerHandler.logError("not " + verifyTitleText+actualText+actualTitleText+expectedText+expectedTitleText);
			extentTest.fail("not " + verifyTitleText+actualText+actualTitleText+expectedText+expectedTitleText);

			reports.addScreenshotToReport(driver, extentTest);

		}
	}

	public void clickOnReferringPhysicians(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getReferringPhysicians(), 10);
			webDriverHelper.clickOnElement(getReferringPhysicians());
			LoggerHandler.logInfo("clicked on referring physicians");
			extentTest.pass("clicked on referring physicians");
		} catch (Exception e) {
			LoggerHandler.logError("not " + "clicked on referring physicians");
			extentTest.fail("not " + "clicked on referring physicians");
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
	
	public void clickOnMedicalDepartments(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getMedDept(), 10);
			webDriverHelper.javascriptScroll(getMedDept());
			Thread.sleep(5000);
			webDriverHelper.jsClick(getMedDept());
			LoggerHandler.logInfo("clicked on medical departments");
			extentTest.pass("clicked on medical departments");
		} catch (Exception e) {
			e.printStackTrace();
			LoggerHandler.logError("not " + "clicked on medical departments");
			extentTest.fail("not " + "clicked on medical departments");
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
	
	public void clickOnRadiology(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getRadiology(), 10);
			webDriverHelper.clickOnElement(getRadiology());
			LoggerHandler.logInfo("clicked on radiology");
			extentTest.pass("clicked on radiology");
		} catch (Exception e) {
			LoggerHandler.logError("not " + "clicked on radiology");
			extentTest.fail("not " + "clicked on radiology");
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public String getAdvancedImagingText(WebDriver driver, ExtentTest extentTest) {
		String newAdvancedImagingHeaderText = "";
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getAdvancedImagingText(), 10);
			newAdvancedImagingHeaderText = webDriverHelper.getText(getAdvancedImagingText());
			LoggerHandler.logInfo(headerTextFetch+" : "+newAdvancedImagingHeaderText);
			extentTest.pass(headerTextFetch+" : "+newAdvancedImagingHeaderText);
		} catch (Exception e) {
			LoggerHandler.logError("not " + headerTextFetch+" : "+newAdvancedImagingHeaderText);
			extentTest.fail("not " + headerTextFetch+" : "+newAdvancedImagingHeaderText);
			reports.addScreenshotToReport(driver, extentTest);
		}
		return newAdvancedImagingHeaderText;
	}

	public void verifyAdvancedImagingText(WebDriver driver, ExtentTest extentTest, String expectedHeaderText, String actualHeaderText) {
		try {
			Assert.assertEquals(actualHeaderText, expectedHeaderText);
			LoggerHandler.logInfo(verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			extentTest.pass(verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			Screenshot.takess(driver);
			reports.addScreenshotToReport(driver, extentTest);
		} catch (Throwable e) {
			LoggerHandler.logError("not " + verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			extentTest.fail("not " + verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
	
	public void clickOnReturningPatients(WebDriver driver, ExtentTest extentTest)
	{
		try {
			webDriverHelper=new WebDriverHelper(driver);
			webDriverHelper.clickOnElement(getReturningPatients());
			LoggerHandler.logInfo("clicked on returning patients");
			extentTest.pass("clicked on returning patients");
		} catch (Exception e) {
			LoggerHandler.logError("not clicked on returning patients");
			extentTest.fail("not clicked on returning patients");
		}
	}
	
	public void clickOnHaveNotSeenMayoClinicProvider(WebDriver driver, ExtentTest extentTest)
	{
		try {
			webDriverHelper=new WebDriverHelper(driver);
			webDriverHelper.clickOnElement(getNotSeenMayoClinicProvider());
			LoggerHandler.logInfo("clicked on I have not seen any Mayo Clinic Provider");
			extentTest.pass("clicked on I have not seen any Mayo Clinic Provider");
		} catch (Exception e) {
			LoggerHandler.logError("not clicked on I have not seen any Mayo Clinic Provider");
			extentTest.fail("not clicked on I have not seen any Mayo Clinic Provider");
		}
	}
	
	public String getRequestAnAppointmentText(WebDriver driver, ExtentTest extentTest) {
		String requestAnAppointmentText = "";
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getRequestAnAppointmentText(), 10);
			requestAnAppointmentText= webDriverHelper.getText(getRequestAnAppointmentText());
			LoggerHandler.logInfo("fetched request an appointment text");
			extentTest.pass("fetched request an appointment text");
		} catch (Exception e) {
			LoggerHandler.logError("not " + "fetched request an appointment text");
			extentTest.fail("not " + "fetched request an appointment text");
			reports.addScreenshotToReport(driver, extentTest);
		}
		return requestAnAppointmentText;
	}

	public void verifyRequestAnAppointmentText(WebDriver driver, ExtentTest extentTest, String expectedHeaderText, String actualHeaderText) {
		try {
			Assert.assertEquals(actualHeaderText, expectedHeaderText);
			LoggerHandler.logInfo(verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			extentTest.pass(verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			Screenshot.takess(driver);
			reports.addScreenshotToReport(driver, extentTest);
		} catch (Throwable e) {
			LoggerHandler.logError("not " + verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			extentTest.fail("not " + verifyHeaderText+actualText+actualHeaderText+expectedText+expectedHeaderText);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
}
