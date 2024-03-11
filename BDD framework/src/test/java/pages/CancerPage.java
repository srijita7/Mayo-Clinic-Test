package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import uistore.CancerLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;
import com.aventstack.extentreports.ExtentTest;
public class CancerPage {
   WebDriverHelper helper;
    CancerLocators cancerLocators =new CancerLocators();
    Reporter reports = new Reporter();

    
    public void clickOnBeyondCancer(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try{
            By element=By.xpath(cancerLocators.getBeyondCancer());
            helper.jsClick(element);
            LoggerHandler.logInfo("Click on Beyond Cancer passed");
            test.pass("Click on Beyond Cancer passed");
        }catch(Exception e){
            LoggerHandler.logError("Click on Beyond Cancer failed");
            test.fail("Click on Beyond Cancer failed");
            reports.addScreenshotToReport(driver,test);
            
        }
    }
}
