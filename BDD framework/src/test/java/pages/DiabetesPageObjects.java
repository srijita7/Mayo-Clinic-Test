package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import uistore.DiabetesPageLocators;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.*;

public class DiabetesPageObjects extends DiabetesPageLocators {
    WebDriverHelper objDriverHelper;
    Reporter objReporter= new Reporter();

    public void clickDiabetes(WebDriver driver, ExtentTest test) {
        try {
            objDriverHelper = new WebDriverHelper(driver);
            objDriverHelper.clickOnElement(getType2Diabetes());
            LoggerHandler.logInfo("Click on Type2Diabetes passed");
            test.pass("Click on Type2Diabetes passed");
        } catch (Exception e) {
            LoggerHandler.logError("Click on Type2Diabetes failed, check screenshot for details");
            test.fail("Click on Type2Diabetes failed, check screenshot for details");
            objReporter.addScreenshotToReport(driver, test);
        }
    }

    public void clickSymptomsAndCauses(WebDriver driver, ExtentTest test) {
        try {
            objDriverHelper = new WebDriverHelper(driver);
            objDriverHelper.clickOnElement(getSymptomsCauses());
            LoggerHandler.logInfo("Click on symptoms and causes passed");
            test.pass("Click on symptoms and causes passed");
        } catch (Exception e) {
            LoggerHandler.logError("Click on symptoms and causes failed, check screenshot for details");
            test.fail("Click on symptoms and causes failed, check screenshot for details");
            objReporter.addScreenshotToReport(driver, test);
        }
    }

    public void clickDiagnosisTreatment(WebDriver driver, ExtentTest test) {
        try {
            objDriverHelper = new WebDriverHelper(driver);
            objDriverHelper.clickOnElement(getDiagnosisTreatments());
            Screenshot.getScreenShot(driver);
            LoggerHandler.logInfo("Click on diagnosis and treartment passed");
            test.pass("Click on diagnosis and treartment passed");
        } catch (Exception e) {
            LoggerHandler.logError("Click on diagnosis and treartment failed, check screenshot for details");
            test.fail("Click on diagnosis and treartment failed, check screenshot for details");
            objReporter.addScreenshotToReport(driver, test);
        }
    }

    public void clickDoctorsDepartments(WebDriver driver, ExtentTest test) {
        try {
            objDriverHelper = new WebDriverHelper(driver);
            objDriverHelper.clickOnElement(getDoctordepartments());
            LoggerHandler.logInfo("Click on doctorss&departments");
            test.pass("Click on doctorss&departments");
        } catch (Exception e) {
             LoggerHandler.logError("Click on doctorss&departments failed, check screenshot for details");
            test.fail("Click on doctorss&departments failed, check screenshot for details");
            objReporter.addScreenshotToReport(driver, test);
        }
    }

    public void verifyFirst(WebDriver driver, ExtentTest test) {
        try {
            LoggerHandler.createLog();
            objDriverHelper = new WebDriverHelper(driver);
            String result = objDriverHelper.getText(getVerify());
            Assert.assertTrue(result.contains("Departments and specialties"));
            Screenshot.getScreenShot(driver);
            LoggerHandler.logInfo("TC1Passed.");
            test.pass("TC1Passed.");
        } catch (Exception e) {
            LoggerHandler.logError("TC1 failed, check screenshot for details");
            test.fail("TC1 failed, check screenshot for details");
            objReporter.addScreenshotToReport(driver, test);
        }
    }
}
