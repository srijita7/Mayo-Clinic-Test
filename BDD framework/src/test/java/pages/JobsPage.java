package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.JobsLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class JobsPage {
    JobsLocators jobsLocators = new JobsLocators();
    WebDriverHelper helper;
    Reporter reports = new Reporter();
    ExcelReader exRead= new ExcelReader();

   

    public void clickOnSearchByRole(WebDriver driver, ExtentTest test,WebDriverHelper helper) {
        try {
            By element = By.xpath(jobsLocators.getSearchByRole());
            helper.clickOnElement(element);
            LoggerHandler.logInfo("Click on Search By Role Passed");
            test.pass("Click on Search By Role Passed");
        } catch (Exception e) {

            LoggerHandler.logError("Click on Search By Role failed");
            test.fail("Click on Search By Role failed");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void sendDataToSearchByRole(WebDriver driver,ExtentTest test,WebDriverHelper helper,int row,int col) {
        try {
            By element = By.xpath(jobsLocators.getSearchByRole());
            String data=exRead.readExcel("Sheet1", row, col);
            helper.sendKeys(element, data);
            LoggerHandler.logInfo("Send data to Search By Role Passed");
            test.pass("Send data to Search By Role Passed");
        } catch (Exception e) {
            LoggerHandler.logError("Send data to Search By Role failed");
            test.fail("Send data Search By Role failed");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickOnSearchLocation(WebDriver driver,ExtentTest test,WebDriverHelper helper) {
        try {
            By element = By.xpath(jobsLocators.getSearchLocation());
            helper.clickOnElement(element);
            LoggerHandler.logInfo("Click on Search Location Passed");
            test.pass("Click on Search Location Passed");
        } catch (Exception e) {

            LoggerHandler.logError("Click on Search Location failed");
            test.fail("Click on Search Location failed");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void sendDataToSearchLocation(WebDriver driver,ExtentTest test,WebDriverHelper helper,int row,int col) {
        try {
            By element = By.xpath(jobsLocators.getSearchLocation());
            String data = exRead.readExcel("Sheet1", row, col);
            helper.sendKeys(element, data);
            LoggerHandler.logInfo("Send Keys to Search Location Passed");
            test.pass("Send Keys to Search Location Passed");
        } catch (Exception e) {

            LoggerHandler.logError("Send Keys to Search Location failed");
            test.fail("Send Keys to Search Location failed");
            reports.addScreenshotToReport(driver,test);
        }
    }

    public void clickOnMinnesota(WebDriver driver, ExtentTest test,WebDriverHelper helper) {
        try {
            By element = By.xpath(jobsLocators.getMinnesota());
            helper.clickOnElement(element);
            LoggerHandler.logInfo("Click on minnesota passed");
            test.pass("Click on minnesota passed");
        } catch (Exception e) {
            LoggerHandler.logError("Click on minnesota failed");
            test.fail("Click on minnesota failed");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickOnSearchIcon(WebDriver driver,ExtentTest test,WebDriverHelper helper) {
        try {
            By element = By.xpath(jobsLocators.getSearchIcon());
            helper.clickOnElement(element);
            LoggerHandler.logInfo("Click on search icon passed");
            test.pass("Click on search icon passed");
        } catch (Exception e) {
            LoggerHandler.logError("Click on search icon failed");
            test.fail("Click on search icon failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
}
