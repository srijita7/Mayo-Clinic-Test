package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import runner.RunTest;
import uistore.CoughSymptomsPageLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class CoughSymptomsPageObject extends CoughSymptomsPageLocators {
	WebDriverHelper webDriverHelper;

	String doctorClick = "clicked on when to see a doctor link";

	Reporter reports=new Reporter();

	public void clickOnWhenToSeeADoctor(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.clickOnElement(getWhenToSeeADoctorLink());
			LoggerHandler.logInfo(doctorClick);
			extentTest.pass(doctorClick);
		} catch (Exception e) {
			LoggerHandler.logError("not " + doctorClick);
			extentTest.fail("not " + doctorClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
}
