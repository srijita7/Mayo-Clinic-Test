package pages;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.FindDoctorLocators;
import utils.*;

public class FindDoctorPage extends FindDoctorLocators {
    WebDriverHelper objDriverHelper;
    Reporter reports = new Reporter();
    ExcelReader excelReader = new ExcelReader();

    public void searchDoctor(WebDriver driver, ExtentTest test) {

        try {
            objDriverHelper = new WebDriverHelper(driver);
            objDriverHelper.clickOnElement(getSearchBarDoc());
            String data=excelReader.readExcel("Sheet1", 2, 1);
            objDriverHelper.sendKeys(getSearchBarDoc(), data);
            objDriverHelper.clickOnElement(getLocation());
            objDriverHelper.clickOnElement(getSelectLoc());
            objDriverHelper.clickOnElement(getSearchButton());

            LoggerHandler.logInfo("Search Doctor result passed");
            test.pass("Search Doctor result passed");

        } catch (Exception e) {

            LoggerHandler.logError("Search Doctor result failed, check screenshot for details");
            test.fail("Search Doctor result failed, check screenshot for details");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void selectFirst(WebDriver driver, ExtentTest test) {

        try {
            objDriverHelper = new WebDriverHelper(driver);
            objDriverHelper.clickOnElement(getFirstResult());

            LoggerHandler.logInfo("Click on first search result passed");
            test.pass("Click on first search result passed");

        } catch (Exception e) {

            LoggerHandler.logError("Click on first search result failed, check screenshot for details");
            test.fail("Click on first search result failed, check screenshot for details");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void sendMessage(WebDriver driver, ExtentTest test) {

        try {
            objDriverHelper = new WebDriverHelper(driver);
            objDriverHelper.clickOnElement(getSecureMessage());

            LoggerHandler.logInfo("Click on secure message portal passed");
            test.pass("Click on secure message portal passed");

        } catch (Exception e) {

            LoggerHandler.logError("Click on secure message portal failed, check screenshot for details");
            test.fail("Click on secure message portal failed, check screenshot for details");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void verify(WebDriver driver, ExtentTest test) {
        objDriverHelper = new WebDriverHelper(driver);
        try {
            String result = objDriverHelper.getText(getVerifyText());
            Assert.assertTrue(result.equalsIgnoreCase("Patient Online Services"));
            LoggerHandler.logInfo("TC2 passed");
            test.info("TC2 passed");
            Screenshot.takess(driver);
        } catch (Exception e) {
            LoggerHandler.logError("TC2 failed, check screenshot for details");
            test.fail("TC2 failed, check screenshot for details");
            reports.addScreenshotToReport(driver, test);
        }

    }
}
