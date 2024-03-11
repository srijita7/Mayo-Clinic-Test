package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.SearchJobsLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class SearchJobsPage {
    WebDriverHelper helper;
    SearchJobsLocators sloc=new SearchJobsLocators();
    Reporter reports = new Reporter();

    
    public void clickOnAreaOfInterest(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try{
            By element=By.xpath(sloc.getAreaOfInterest());
            helper.clickOnElement(element);
            LoggerHandler.logInfo("Click on area of interest passed");
            test.pass("Click on interest passed");
        }catch(Exception e){
           
            LoggerHandler.logError("Click on interest failed");
            test.fail("Click on interest failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
    public void clickOnCriticalCare(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try{
            By element=By.xpath(sloc.getCriticalCare());
            helper.jsClick(element);
            LoggerHandler.logInfo("Click on CriticalCare passed");
            test.pass("Click on CriticalCare passed");
        }catch(Exception e){
           
            LoggerHandler.logError("Click on CriticalCare failed");
            test.fail("Click on CriticalCare failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
    public void clickOnResearch(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try{
            By element=By.xpath(sloc.getResearch());
            helper.clickOnElement(element);
            LoggerHandler.logInfo("Click on Research passed");
            test.pass("Click on Research passed");
        }catch(Exception e){
        
            LoggerHandler.logError("Click on Research failed");
            test.fail("Click on Research failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
}
