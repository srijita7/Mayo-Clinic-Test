package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.ResearchLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class ResearchPage {
    ResearchLocators researchLocators=new ResearchLocators();
    WebDriverHelper helper;
    Reporter reports = new Reporter();

    
    public void clickOnApplyNow(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try{
            By element=By.xpath(researchLocators.getApplyNow());
            helper.clickOnElement(element);
            LoggerHandler.logInfo("Click on Apply now passed");
            test.pass("Click on Apply Now passed");
        }catch(Exception e){
            LoggerHandler.logError("Click on Apply Now failed");
            test.fail("Click on Apply Now failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
}
