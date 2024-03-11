package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.BeyondCancerLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class BeyondCancerPage {
    BeyondCancerLocators beyondCancerLocators=new BeyondCancerLocators();
    Reporter reports = new Reporter();
     WebDriverHelper helper;
     ExcelReader exRead= new ExcelReader();
    public void clickOnInput(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try {
            By element=By.xpath(beyondCancerLocators.getInput());
            helper.clickOnElement(element);
            LoggerHandler.logInfo("Click On Input Passed");
            test.pass("Click On Input Passed");
        } catch (Exception e) {
            LoggerHandler.logError("Click On Input Failed");
            test.fail("Click On Input Failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
    public void clearsInput(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try {
            By element=By.xpath(beyondCancerLocators.getInput());
            helper.clearInput(element);
            LoggerHandler.logInfo("Clear Input Passed");
            test.pass("Clear Input Passed");
        } catch (Exception e) {
            LoggerHandler.logError("Clear Input Failed");
            test.fail("Clear Input Failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
    public void sendKeysToInput(WebDriver driver,ExtentTest test,WebDriverHelper helper, int row, int col){
        try {
            By element=By.xpath(beyondCancerLocators.getInput());
            String data= exRead.readExcel("Sheet1", row, col);
            helper.sendKeys(element, data);
            LoggerHandler.logInfo("Send Keys to input passed");
            test.pass("Send Keys To input passed");
        } catch (Exception e) {
            LoggerHandler.logError("Send Keys to input failed");
            test.fail("Send Keys to input failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
    public void clickOnAddToCart(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try {
            By element=By.xpath(beyondCancerLocators.getAddToCart());
            helper.jsClick(element);
            LoggerHandler.logInfo("Click on Add to cart passed");
            test.pass("Click on Add to cart passed");


        } catch (Exception e) {
           
            LoggerHandler.logError("Click on Add to cart failed");
            test.fail("Click on Add to cart failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
}
