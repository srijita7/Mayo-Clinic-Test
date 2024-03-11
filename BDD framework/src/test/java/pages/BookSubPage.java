package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.BookSubsLocators;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class BookSubPage {
    WebDriverHelper helper;
    BookSubsLocators bookSubsLocators=new BookSubsLocators();
    Reporter reports = new Reporter();

    public void clickOnViewCancer(WebDriver driver,ExtentTest test,WebDriverHelper helper){
        try{
            By element=By.xpath(bookSubsLocators.getViewCancer());
            helper.jsClick(element);
            LoggerHandler.logInfo("Click on view cancer passed");
            test.pass("Click on view cancer passed");
        }catch(Exception e){
            LoggerHandler.logError("Click on view cancer failed");
            test.fail("Click on view cancer failed");
            reports.addScreenshotToReport(driver, test);
        }
    }
}
