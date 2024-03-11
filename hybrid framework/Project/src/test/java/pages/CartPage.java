package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.CartLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CartPage {
    CartLocators cloc=new CartLocators();
     WebDriverHelper helper;
     Reporter reports = new Reporter();

    
    public void checkOrderSummary(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try{
            String str="Order Summary";
        
            
            By element=By.xpath(cloc.getOrderSummary());
            String summary=helper.getText(element);
            Assert.assertTrue(str.contains(summary));
            LoggerHandler.logInfo("Checking order summary passed");
            test.pass("Checking order summary passed");
            Screenshot.takess(driver);
        }catch(Exception e){
            LoggerHandler.logError("Checking order summary failed");
            test.fail("Checking order summary failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
}
