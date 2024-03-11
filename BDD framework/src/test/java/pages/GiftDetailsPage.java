package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.GiftDetailslocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class GiftDetailsPage extends GiftDetailslocators {
    WebDriverHelper helper;
    ExcelReader read = new ExcelReader();
    Reporter reports = new Reporter();
    String sheetName= "Sheet1";

    public void clickAmount(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.clickOnElement(getClickamount());
            LoggerHandler.logInfo("Amount Successfully clicked");
            test.pass("Amount Successfully clicked");
        } catch (Exception e) {

            LoggerHandler.logInfo("Amount Not clicked");
            test.fail("Amount Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickDesignate(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.waitForElementToBeVisible(getClickdesignate(), 10);
            helper.clickOnElement(getClickdesignate());
            LoggerHandler.logInfo("Designate value Successfully clicked");
            test.pass("Designate value Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Designate value Not clicked");
            test.fail("Designate value Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickMedicalEducation(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.waitForElementToBeVisible(getClickmedical(), 10);
            helper.clickOnElement(getClickmedical());
            LoggerHandler.logInfo("Medical education Successfully clicked");
            test.pass("Medical education Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Medical education Not clicked");
            test.fail("Medical education Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickAnonymously(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.waitForElementToBeVisible(getClickanonymously(), 10);
            helper.clickOnElement(getClickanonymously());
            LoggerHandler.logInfo("Anonymous donation Successfully clicked");
            test.pass("Anonymous donation Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Anonymous donation Not clicked");
            test.fail("Anonymous donation Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickTitle(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.waitForElementToBeVisible(getClicktitle(), 10);
            helper.clickOnElement(getClicktitle());
            LoggerHandler.logInfo("Title Successfully clicked");
            test.pass("Title Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Title Not clicked");
            test.fail("Title Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickMr(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.waitForElementToBeVisible(getClickmr(), 10);
            helper.clickOnElement(getClickmr());
            LoggerHandler.logInfo("Mr. Successfully clicked");
            test.pass("Mr. Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Mr. Not clicked");
            test.fail("Mr. Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickFirstName(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            
            helper.clickOnElement(getClickfirstnm());
            LoggerHandler.logInfo("First name clicked ");
            test.pass("First name clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("First name Not clicked");
            test.fail("First name Not clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }
       public void sendFirstName(WebDriver driver, ExtentTest test,String arg2) {
        try {
            helper = new WebDriverHelper(driver);
            helper.clickOnElement(getClickfirstnm());
            helper.sendKeys(getClickfirstnm(),arg2);
            LoggerHandler.logInfo("First name entered ");
            test.pass("First name entered");
        } catch (Exception e) {
            LoggerHandler.logInfo("First name Not entered");
            test.fail("First name Not entered");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickLastName(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            
            helper.clickOnElement(getClicklastnm());
            helper.waitForElementToBeVisible(getClicklastnm(), 10);
            LoggerHandler.logInfo("Last name clicked ");
            test.pass("Last name clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Last name not clicked");
            test.fail("Last name not clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }
     public void sendLastName(WebDriver driver, ExtentTest test,String arg2) {
        try {
            helper = new WebDriverHelper(driver);
            helper.sendKeys(getClicklastnm(), arg2);
            helper.waitForElementToBeVisible(getClicklastnm(), 10);
            LoggerHandler.logInfo("Last name entered ");
            test.pass("Last name entered");
        } catch (Exception e) {
            LoggerHandler.logInfo("Last name not entered");
            test.fail("Last name not entered");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickCountry(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.waitForElementToBeVisible(getClickcountry(), 10);
            helper.clickOnElement(getClickcountry());
            LoggerHandler.logInfo("Country clicked Successfully");
            test.pass("Country clicked Successfully");
        } catch (Exception e) {
            LoggerHandler.logInfo("Country clicekd not Successfully");
            test.fail("Country clicked not Successfully");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickIndia(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.javascriptScroll(getClickIndia());
            helper.waitForElementToBeClickable(getClickIndia(), 10);
            helper.clickOnElement(getClickIndia());
            LoggerHandler.logInfo("India clicked successfully");
            test.pass("India clicked successfully");
        } catch (Exception e) {
            LoggerHandler.logInfo("India not clicked successfully");
            test.fail("India not clicked successfully");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickState(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.waitForElementToBeVisible(getClickstate(), 10);
            helper.clickOnElement(getClickstate());
            LoggerHandler.logInfo("State Successfully clicked");
            test.pass("State Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("State Not clicked");
            test.fail("State Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickNA(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.waitForElementToBeVisible(getClickna(), 10);
            helper.clickOnElement(getClickna());
            LoggerHandler.logInfo("NA Successfully clicked");
            test.pass("NA Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("NA Not clicked");
            test.fail("NA Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickAddress(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            
            helper.clickOnElement(getClickaddress());
            LoggerHandler.logInfo("Address Successfully clicked");
            test.pass("Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Not clicked");
            test.fail("Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }
     public void sendAddress(WebDriver driver, ExtentTest test,String arg2) {
        try {
            helper = new WebDriverHelper(driver);
            helper.sendKeys(getClickaddress(), arg2);
            LoggerHandler.logInfo("Address Successfully entered");
            test.pass("Address Successfully entered");
        } catch (Exception e) {
            LoggerHandler.logInfo("Address Not entered");
            test.fail("Address Not entered");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickCity(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            
            helper.clickOnElement(getClickcity());
            LoggerHandler.logInfo("City Successfully clicked");
            test.pass("City Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("City Not clicked");
            test.fail("City Not Clicked");
            reports.addScreenshotToReport(driver, test);

        }
    }
    public void sendCity(WebDriver driver, ExtentTest test,String arg2) {
        try {
            helper = new WebDriverHelper(driver);
            helper.sendKeys(getClickcity(), arg2);
            LoggerHandler.logInfo("City Successfully entered");
            test.pass("City Successfully entered");
        } catch (Exception e) {
            LoggerHandler.logInfo("City Not entered");
            test.fail("City Not entered");
            reports.addScreenshotToReport(driver, test);

        }
    }

    public void clickZip(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            
            helper.clickOnElement(getClickzip());
            helper.waitForElementToBeVisible(getClickzip(), 10);
            LoggerHandler.logInfo("Zip Successfully clicked");
            test.pass("Zip Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Zip Not clicked");
            test.fail("Zip Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }
    public void sendZip(WebDriver driver, ExtentTest test,String arg2) {
        try {
            helper = new WebDriverHelper(driver);
            helper.sendKeys(getClickzip(), arg2);
            Thread.sleep(2000);
            LoggerHandler.logInfo("Zip Successfully entered");
            test.pass("Zip Successfully entered");
        } catch (Exception e) {
            LoggerHandler.logInfo("Zip Not entered");
            test.fail("Zip Not entered");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickPhoneNumber(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            
            helper.clickOnElement(getClickphone());
            LoggerHandler.logInfo("Phone Successfully clicked");
            test.pass("Phone Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Phone Not clicked");
            test.fail("Phone Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }
    public void sendPhoneNumber(WebDriver driver, ExtentTest test,String arg2) {
        try {
            helper = new WebDriverHelper(driver);
            helper.sendKeys(getClickphone(), arg2);
            helper.waitForElementToBeVisible(getClickphone(), 10);
            LoggerHandler.logInfo("Phone Successfully entered");
            test.pass("Phone Successfully entered");
        } catch (Exception e) {
            LoggerHandler.logInfo("Phone Not entered");
            test.fail("Phone Not entered");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickEmail(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            
            helper.clickOnElement(getClickemail());
            helper.waitForElementToBeVisible(getClickemail(), 10);
            LoggerHandler.logInfo("Email Successfully clicked");
            test.pass("Email Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Email Not clicked");
            test.fail("Email Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }
     public void sendEmail(WebDriver driver, ExtentTest test,String arg2) {
        try {
            helper = new WebDriverHelper(driver);
            helper.sendKeys(getClickemail(), arg2);
            helper.waitForElementToBeVisible(getClickemail(), 10);
            LoggerHandler.logInfo("Email Successfully entered");
            test.pass("Email Successfully entered");
        } catch (Exception e) {
            LoggerHandler.logInfo("Email Not entered");
            test.fail("Email Not entered");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickMakeMyGiftButton(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.waitForElementToBeVisible(getClickbutton(), 0);
            helper.clickOnElement(getClickbutton());
            Screenshot.getScreenShot(driver);
            LoggerHandler.logInfo("Button Successfully clicked");
            test.pass("Button Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Button Not clicked");
            test.fail("BUtton Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void verifyCompletePaymentText(WebDriver driver, ExtentTest test) {
        try {
            String verify="Complete payment";
			driver.switchTo().frame("bbcheckout-iframe");
            helper.waitForElementToBeVisible(getVerifytext(), 0);
            String data = helper.getText(getVerifytext());
            Assert.assertTrue(data.contains(verify));
            LoggerHandler.logInfo("Successfull text matching");
            test.pass("Successfull text matching");
            Screenshot.getScreenShot(driver);
        } catch (Exception e) {
            LoggerHandler.logInfo("Not successfull text matching");
            test.fail("Not successfull text matching");
            reports.addScreenshotToReport(driver, test);
        }
    }
}


