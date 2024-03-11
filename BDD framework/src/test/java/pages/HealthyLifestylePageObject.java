package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HealthyLifestyleLocator;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class HealthyLifestylePageObject extends HealthyLifestyleLocator {
  WebDriverHelper webDriverHelper;
  ExtentTest test;
  Reporter reports=new Reporter();

  public void clickNutrition(WebDriver driver, ExtentTest test) {
    try {
      webDriverHelper = new WebDriverHelper(driver);
      webDriverHelper.waitForElementToBeVisible(getNutrition(), 10);
      webDriverHelper.clickOnElement(getNutrition());
      test.log(Status.PASS, "Nutrition and Healthy Lifestyle clicked successfully");
      LoggerHandler.logInfo("Nutrition and Healthy Lifestyle clicked successfully");
    } catch (Exception e) {

      test.log(Status.FAIL, "Nutrition and Healthy Lifestyle click failed");
      LoggerHandler.logError("Nutrition and Healthy Lifestyle click failed");
      reports.addScreenshotToReport(driver, test);
    }
  }

  public void clickHealthyDiet(WebDriver driver, ExtentTest test) {
    try {
      webDriverHelper = new WebDriverHelper(driver);
      webDriverHelper.waitForElementToBeVisible(getHealthyDiet(), 10);
      webDriverHelper.clickOnElement(getHealthyDiet());
      test.log(Status.PASS, "Healthy Diet clicked successfully");
      LoggerHandler.logInfo("Healthy Diet clicked successfully");
    } catch (Exception e) {

      test.log(Status.FAIL, "Healthy Diet click failed");
      LoggerHandler.logError("Healthy Diet click failed");
      reports.addScreenshotToReport(driver, test);
    }
  }
}
