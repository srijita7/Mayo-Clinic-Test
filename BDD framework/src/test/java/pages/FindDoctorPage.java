package pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.FindDoctorLocators;
import utils.*;

public class FindDoctorPage extends FindDoctorLocators {
    WebDriverHelper objDriverHelper;
    Reporter reports = new Reporter();
    ExcelReader excelReader = new ExcelReader();

    public void searchDoctor(WebDriver driver, ExtentTest test, int row, int col) {

        try {
            objDriverHelper = new WebDriverHelper(driver);
            String data=excelReader.readExcel("Sheet1", row, col);
            objDriverHelper.sendKeys(getSearchBarDoc(), data);

            LoggerHandler.logInfo("Search Doctor result passed");
            test.pass("Search Doctor result passed");

        } catch (Exception e) {

            LoggerHandler.logError("Search Doctor result failed, check screenshot for details");
            test.fail("Search Doctor result failed, check screenshot for details");
            reports.addScreenshotToReport(driver, test);
        }
    }
    public void clickSearchBar(WebDriver driver, ExtentTest test) {

        try {
            objDriverHelper = new WebDriverHelper(driver);
            objDriverHelper.clickOnElement(getSearchBarDoc());

            LoggerHandler.logInfo("Click search box passed");
            test.pass("Search box clicking passed");

        } catch (Exception e) {

            LoggerHandler.logError("Click search box failed, check screenshot for details");
            test.fail("Search box clicking failed, check screenshot for details");
            reports.addScreenshotToReport(driver, test);
        }
    }
     public void selectLocation(WebDriver driver, ExtentTest test) {

        try {
            objDriverHelper = new WebDriverHelper(driver);
            objDriverHelper.clickOnElement(getLocation());


            LoggerHandler.logInfo("Select Location passed");
            test.pass("Location selected");

        } catch (Exception e) {

            LoggerHandler.logError("Select Location failed, check screenshot for details");
            test.fail("Location selection failed , check screenshot for details");
            reports.addScreenshotToReport(driver, test);
        }
    }
       public void clickonRequiredLocation(WebDriver driver, ExtentTest test) {

        try {
            objDriverHelper = new WebDriverHelper(driver);
            objDriverHelper.clickOnElement(getSelectLoc());
         

            LoggerHandler.logInfo("Selecting desired Location passed");
            test.pass("Desired Location selected");

        } catch (Exception e) {

            LoggerHandler.logError("Selecting desired Location failed, check screenshot for details");
            test.fail("Desired Location selection failed, check screenshot for details");
            reports.addScreenshotToReport(driver, test);
        }
    }
    public void clickSearchButton(WebDriver driver, ExtentTest test) {

        try {
            objDriverHelper = new WebDriverHelper(driver);
            objDriverHelper.clickOnElement(getSearchButton());

            LoggerHandler.logInfo("Search information passed");
            test.pass("Search performed");

        } catch (Exception e) {

            LoggerHandler.logError("Search information failed, check screenshot for details");
            test.fail("Search not performed, check screenshot for details");
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
            Screenshot.getScreenShot(driver);
        } catch (Exception e) {
            LoggerHandler.logError("TC2 failed, check screenshot for details");
            test.fail("TC2 failed, check screenshot for details");
            reports.addScreenshotToReport(driver, test);
        }

    }
}
