package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;


import uistore.Giftdetaillocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class Giftdetailpage extends Giftdetaillocators {
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
            String str = read.readExcel(sheetName, 1, 0);
            helper.sendKeys(getClickfirstnm(), str);
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
            String str1 = read.readExcel(sheetName, 1,
                    1);
            helper.sendKeys(getClicklastnm(), str1);
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
            String str3 = read.readExcel(sheetName, 1,
                    2);
            helper.sendKeys(getClickaddress(), str3);
            LoggerHandler.logInfo("Address Successfully entered");
            test.pass("Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Not clicked");
            test.fail("Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickCity(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            String str4 = read.readExcel(sheetName, 1,
                    3);
            helper.sendKeys(getClickcity(), str4);
            LoggerHandler.logInfo("City Successfully clicked");
            test.pass("City Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("City Not clicked");
            test.fail("City Not Clicked");
            reports.addScreenshotToReport(driver, test);

        }
    }

    public void clickZip(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            String str5 = read.readExcel(sheetName, 1,
                    4);
            helper.sendKeys(getClickzip(), str5);
            helper.waitForElementToBeVisible(getClickzip(), 10);
            LoggerHandler.logInfo("Zip Successfully clicked");
            test.pass("Zip Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Zip Not clicked");
            test.fail("Zip Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickPhoneNumber(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            String str6 = read.readExcel(sheetName, 1,
                    5);
            helper.sendKeys(getClickphone(), str6);
            helper.waitForElementToBeVisible(getClickphone(), 10);
            LoggerHandler.logInfo("Phone Successfully clicked");
            test.pass("Phone Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Phone Not clicked");
            test.fail("Phone Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickEmail(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            String str7 = read.readExcel(sheetName, 1,
                    6);
            helper.sendKeys(getClickemail(), str7);
            helper.waitForElementToBeVisible(getClickemail(), 10);
            LoggerHandler.logInfo("Email Successfully clicked");
            test.pass("Email Successfully clicked");
        } catch (Exception e) {
            LoggerHandler.logInfo("Email Not clicked");
            test.fail("Email Not Clicked");
            reports.addScreenshotToReport(driver, test);
        }
    }

    public void clickMakeMyGiftButton(WebDriver driver, ExtentTest test) {
        try {
            helper = new WebDriverHelper(driver);
            helper.waitForElementToBeVisible(getClickbutton(), 0);
            helper.clickOnElement(getClickbutton());
            Screenshot.takess(driver);
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
            Screenshot.takess(driver);
        } catch (Exception e) {
            LoggerHandler.logInfo("Not successfull text matching");
            test.fail("Not successfull text matching");
            reports.addScreenshotToReport(driver, test);
        }
    }
}


