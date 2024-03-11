package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import uistore.CartLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CartPage {
    CartLocators cartLocators=new CartLocators();
     WebDriverHelper helper;
     Reporter reports = new Reporter();

    
    public void checkOrderSummary(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try{
            String str="Order Summary";
        
            
            By element=By.xpath(cartLocators.getOrderSummary());
            String summary=helper.getText(element);
            Assert.assertTrue(str.contains(summary));
            LoggerHandler.logInfo("Checking order summary passed");
            test.pass("Checking order summary passed");
            Screenshot.getScreenShot(driver);
        }catch(Exception e){
            LoggerHandler.logError("Checking order summary failed");
            test.fail("Checking order summary failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
}
