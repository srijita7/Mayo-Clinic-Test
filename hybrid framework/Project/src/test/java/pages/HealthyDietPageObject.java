package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HealthyDietLocator;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HealthyDietPageObject extends HealthyDietLocator {
    WebDriverHelper webDriverHelper;
    ExtentTest test;
    Reporter reports=new Reporter();

    public String getLabelText(WebDriver driver) {
        String labelText = "";
        try {
            webDriverHelper = new WebDriverHelper(driver);
            labelText = webDriverHelper.getText(getHealthyDietLabel());
        } catch (Exception e) {
            e.getMessage();
            reports.addScreenshotToReport(driver, test);
        }
        return labelText;
    }

    public void verifyLabelText(WebDriver driver, ExtentTest test, String expectedText, String actualText) {
        try {
            Assert.assertEquals(expectedText, actualText);
            test.log(Status.PASS, "Healthy Diets label verified");
            LoggerHandler.logInfo("Healthy Diets label verified");
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
