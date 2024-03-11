package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.TestProceduresLocator;
import utils.*;

public class TestProceduresPageObject extends TestProceduresLocator {
    WebDriverHelper webDriverHelper;
    ExtentTest test;
    Reporter reports=new Reporter();

    public void clickM(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);
            webDriverHelper.waitForElementToBeVisible(getKeywordM(), 10);
            webDriverHelper.clickOnElement(getKeywordM());
            test.log(Status.PASS, "Keyword M pressed");
            LoggerHandler.logInfo("Keyword M pressed");
        } catch (Exception e) {

            test.log(Status.FAIL, "Keyword M click failed");
            LoggerHandler.logError("Keyword M click failed");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickMri(WebDriver driver, ExtentTest test) {
        try {
            webDriverHelper = new WebDriverHelper(driver);
            webDriverHelper.waitForElementToBeVisible(getMri(), 10);
            webDriverHelper.clickOnElement(getMri());
            test.log(Status.PASS, "MRI clicked successfully");
            LoggerHandler.logInfo("MRI clicked successfully");
        } catch (Exception e) {

            test.log(Status.FAIL, "MRI click unsuccessfull");
            LoggerHandler.logError("MRI click unsuccessfull");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public String getHeaderText(WebDriver driver) {
        String headerText = "";
        try {
            webDriverHelper = new WebDriverHelper(driver);
            headerText = webDriverHelper.getText(getOverviewHeader());
        } catch (Exception e) {
            e.getMessage();
            reports.addScreenshotToReport(driver, test);
        }
        return headerText;
    }

    public void verifyHeaderText(WebDriver driver, ExtentTest test, String expectedText, String actualText) {
        try {
            Assert.assertEquals(expectedText, actualText);
            test.log(Status.PASS, "Overview Header verified");
            LoggerHandler.logInfo("Overview Header verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "Verification failed");
            LoggerHandler.logError("Verification failed");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void takeSnapshot(WebDriver driver, ExtentTest test) {
        try {
            Screenshot.takess(driver);
            test.log(Status.PASS, "Screenshot taken");
            LoggerHandler.logInfo("Screenshot taken");
        } catch (Exception e) {

            test.log(Status.FAIL, "Screenshot capture failed");
            LoggerHandler.logError("Screenshot capture failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
}
