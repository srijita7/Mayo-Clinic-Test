package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.ApplyNowLocators;
import uistore.NewslettersPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NewslettersPageObject extends NewslettersPageLocators{
	WebDriverHelper webDriverHelper;
    Reporter reports = new Reporter();
    ExcelReader excelReader=new ExcelReader();
    
    String sheetName= "Sheet1";
    
    String submitClick="clicked on Submit";
    String preferencesTextFetch="fetched Preferences text";
    String preferencesTextVerify="verified Preferences text";

    
    public void clickOnEmail(WebDriver driver,ExtentTest test){
        try{
            webDriverHelper=new WebDriverHelper(driver);
            webDriverHelper.clickOnElement(getEmail());
            LoggerHandler.logInfo("clicked on email");
            test.pass("clicked on email");
        }catch(Exception e){
           LoggerHandler.logError("not clicked on email");
           test.fail("not clicked on email");
           reports.addScreenshotToReport(driver, test);
        }
    }
    
    public void enterEmail(WebDriver driver,ExtentTest test){
        try{
            webDriverHelper=new WebDriverHelper(driver);
            String email=excelReader.readExcel(sheetName, 1, 9);
            webDriverHelper.sendKeys(getEmail(), email);
            LoggerHandler.logInfo("entered email");
            test.pass("entered email");
        }catch(Exception e){
           LoggerHandler.logError("not entered email");
           test.fail("not entered email");
           reports.addScreenshotToReport(driver, test);
        }
    }
    
    public void clickOnFirstName(WebDriver driver,ExtentTest test){
        try{
            webDriverHelper=new WebDriverHelper(driver);
            webDriverHelper.clickOnElement(getFirstName());
            LoggerHandler.logInfo("clicked on first name");
            test.pass("clicked on first name");
        }catch(Exception e){
           LoggerHandler.logError("not clicked on first name");
           test.fail("not clicked on first name");
           reports.addScreenshotToReport(driver, test);
        }
    }
    
    public void enterFirstName(WebDriver driver,ExtentTest test){
        try{
            webDriverHelper=new WebDriverHelper(driver);
            String firstName=excelReader.readExcel(sheetName, 1, 10);
            webDriverHelper.sendKeys(getFirstName(), firstName);
            LoggerHandler.logInfo("entered first name");
            test.pass("entered first name");
        }catch(Exception e){
           LoggerHandler.logError("not entered first name");
           test.fail("not entered first name");
           reports.addScreenshotToReport(driver, test);
        }
    }
    
    public void clickOnAllCommunications(WebDriver driver,ExtentTest test){
        try{
            webDriverHelper=new WebDriverHelper(driver);
            webDriverHelper.clickOnElement(getAllCommunications());
            LoggerHandler.logInfo("clicked on all communications");
            test.pass("clicked on all communications");
        }catch(Exception e){
           LoggerHandler.logError("not clicked on all communications");
           test.fail("not clicked on all communications");
           reports.addScreenshotToReport(driver, test);
        }
    }
    public void clickOnSubmit(WebDriver driver,ExtentTest test){
        try{
            webDriverHelper=new WebDriverHelper(driver);
            webDriverHelper.clickOnElement(getSubmit());
            LoggerHandler.logInfo(submitClick);
            test.pass(submitClick);
        }catch(Exception e){
           LoggerHandler.logError("not "+submitClick);
           test.fail("not "+submitClick);
           reports.addScreenshotToReport(driver, test);
        }
    }
    
    public String getText(WebDriver driver, ExtentTest test)
    {
    	String preferencesText="";
    	try{
            webDriverHelper=new WebDriverHelper(driver);
            preferencesText=webDriverHelper.getText(getPreferencesText());
            LoggerHandler.logInfo(preferencesTextFetch);
            test.pass(preferencesTextFetch);
        }catch(Exception e){
           LoggerHandler.logError("not "+preferencesTextFetch);
           test.fail("not "+preferencesTextFetch);
           reports.addScreenshotToReport(driver, test);
        }
    	return preferencesText;
    }
    
    public void verifyText(WebDriver driver, ExtentTest test, String expectedText, String actualText)
    {
    	try{
            Assert.assertTrue(actualText.contains(expectedText));
            LoggerHandler.logInfo(preferencesTextVerify);
            test.pass(preferencesTextVerify);
            reports.addScreenshotToReport(driver, test);
            Screenshot.takess(driver);
        }catch(Throwable e){
           LoggerHandler.logError("not "+preferencesTextVerify);
           test.fail("not "+preferencesTextVerify);
           reports.addScreenshotToReport(driver, test);
        }
    }
}
