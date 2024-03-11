package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.ApplyNowLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ApplyNowPage {
    WebDriverHelper helper;
    Reporter reports = new Reporter();

    ApplyNowLocators aloc=new ApplyNowLocators();
    
    public void checkMessage(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try{
            String str="You don't need to have an account";
        
           
            By element=By.xpath(aloc.getText());
            String msg=helper.getText(element);
            Assert.assertTrue(str.contains(msg));
            LoggerHandler.logInfo("Checking message passed");
            test.pass("Checking message passed");
            Screenshot.takess(driver);
        }catch(Exception e){
            
           
            LoggerHandler.logError("Checking message failed");
            test.fail("Checking message failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
}
