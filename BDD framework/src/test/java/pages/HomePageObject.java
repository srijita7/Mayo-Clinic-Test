package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class HomePageObject extends HomePageLocators {
	WebDriverHelper webDriverHelper;
	ExtentTest extentTest;
	String requestAppointmentClick = "clicked on Request Appointment";
	String healthLibraryClick = "clicked on Health Library";
	String symptomsClick = "clicked on Symptoms";
	Reporter reports = new Reporter();
	ExcelReader exRead=  new ExcelReader();
	String successfulClick="Button Successfuly Clicked";
	String clickFail="Button click failed";
	String testandProcedure="Test and Procedures";
	String healthLifeStyle="Test and Procedures";
	String booksAndSubscription="Books and subscriptions";

	public void clickOnRequestAppointment(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.clickOnElement(getRequestAppointmentLink());
			LoggerHandler.logInfo(requestAppointmentClick);
			extentTest.pass(requestAppointmentClick);
		} catch (Exception e) {
			LoggerHandler.logError("not " + requestAppointmentClick);
			extentTest.fail("not " + requestAppointmentClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickOnHealthLibrary(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeVisible(getHealthLibraryOption(), 10);
			webDriverHelper.hoverOverElement(getHealthLibraryOption());
			webDriverHelper.clickOnElement(getHealthLibraryOption());
			LoggerHandler.logInfo(healthLibraryClick);
			extentTest.pass(healthLibraryClick);
		} catch (Exception e) {
			LoggerHandler.logInfo("not "+healthLibraryClick);
			extentTest.pass("not "+healthLibraryClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickOnSymptoms(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.waitForElementToBeClickable(getSymptomsOption(), 10);
			webDriverHelper.hoverOverElement(getSymptomsOption());
			webDriverHelper.clickOnElement(getSymptomsOption());
			LoggerHandler.logInfo(symptomsClick);
			extentTest.pass(symptomsClick);
		} catch (Exception e) {
			LoggerHandler.logError("not "+symptomsClick);
			extentTest.fail("not "+symptomsClick);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}
	public void clickGivingToMayo(WebDriver driver, ExtentTest extentTest) {
		try{
		webDriverHelper = new WebDriverHelper(driver);
		webDriverHelper.clickOnElement(getClickGivingtomayo());
		LoggerHandler.logInfo(successfulClick);
        extentTest.pass(successfulClick);
		}
		catch(Exception e){
			LoggerHandler.logInfo(clickFail);
            extentTest.fail(clickFail);

		}
	}

	public void clickGiveNow(WebDriver driver,ExtentTest extentTest) {
		try{
		webDriverHelper = new WebDriverHelper(driver);
		webDriverHelper.clickOnElement(getClickgivenow());
		LoggerHandler.logInfo(successfulClick);
        extentTest.pass(successfulClick);

		}
		catch(Exception e){
			LoggerHandler.logInfo(clickFail);
            extentTest.fail(clickFail);

		}
	}


	public void clickTestAndProcedure(WebDriver driver, ExtentTest extentTest) {
		try{
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.clickOnElement(getTestProcedure());
			extentTest.log(Status.PASS, testandProcedure+successfulClick);
			LoggerHandler.logInfo(testandProcedure+successfulClick);
		} catch (Exception e) {

			extentTest.log(Status.FAIL, testandProcedure+clickFail);
			LoggerHandler.logError(testandProcedure+clickFail);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickHealthyLifestyle(WebDriver driver, ExtentTest extentTest) {
		try {
			webDriverHelper = new WebDriverHelper(driver);
			webDriverHelper.clickOnElement(getHealthyLifestyle());
			extentTest.log(Status.PASS, healthLifeStyle+successfulClick);
			LoggerHandler.logInfo(healthLifeStyle+successfulClick);
		} catch (Exception e) {

			extentTest.log(Status.FAIL, healthLifeStyle+clickFail);
			LoggerHandler.logError(healthLifeStyle+clickFail);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickOnBookSubscription(WebDriver driver, ExtentTest extentTest) {
		webDriverHelper = new WebDriverHelper(driver);
		try {
			By ele = By.xpath(getBookSubs());
			webDriverHelper.clickOnElement(ele);
			driver.navigate().refresh();
			LoggerHandler.logInfo(booksAndSubscription+successfulClick);
			extentTest.pass(booksAndSubscription+successfulClick);
		} catch (Exception e) {

			LoggerHandler.logError(booksAndSubscription+clickFail);
			extentTest.fail(booksAndSubscription+clickFail);
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickOnExploreCareer(WebDriver driver, ExtentTest extentTest) {
		webDriverHelper = new WebDriverHelper(driver);
		try {
			By elementForExploreCareer = By.xpath(getExporeCareer());
			webDriverHelper.clickOnElement(elementForExploreCareer);
			By elementForAlert = By.xpath(getAcceptAlert());
			webDriverHelper.clickOnElement(elementForAlert);
			LoggerHandler.logInfo("Click on Explore career passed");
			extentTest.pass("Clicked on Explore career");
		} catch (Exception e) {
			LoggerHandler.logError("Click on Explore Career failed");
			extentTest.fail("Could not Click on Explore Career");
			reports.addScreenshotToReport(driver, extentTest);
		}
	}

	public void clickOnSearchBar(WebDriver driver, ExtentTest extentTest) {
		try{
		webDriverHelper = new WebDriverHelper(driver);
		webDriverHelper.clickOnElement(getSearchBar());
		LoggerHandler.logInfo("Click on Search bar passed");
		extentTest.pass("Clicked on Search bar");
		}catch(Exception e){
			
			LoggerHandler.logError("Click on Search bar failed, check screenshot for details");
			extentTest.fail("Could not Click on Search bar, check screenshot for details");
			reports.addScreenshotToReport(driver, extentTest);
		}
		

	}

	public void searchDiabetes(WebDriver driver, ExtentTest extentTest, int row, int col) {
		try{
		webDriverHelper = new WebDriverHelper(driver);
		String data= exRead.readExcel("Sheet1", row, col);
		webDriverHelper.sendKeys(getSearchBar(), data);
		webDriverHelper.clickOnElement(getSearchButton());
		LoggerHandler.logInfo("Entering diabetes passed");
		extentTest.pass("Diabetes entered successfully");

		}catch(Exception e){
			LoggerHandler.logError("Entering diabetes failed, check screenshot for details");
			extentTest.fail("Diabetes not entered, check screenshot for details");
			reports.addScreenshotToReport(driver, extentTest);	
		}
	
	}
	public void clickSearchButton(WebDriver driver, ExtentTest extentTest) {
		try{
		webDriverHelper.clickOnElement(getSearchButton());
		LoggerHandler.logInfo("Search diabetes passed");
		extentTest.pass("Diabetes searched successfully");

		}catch(Exception e){
			LoggerHandler.logError("Searching diabetes failed, check screenshot for details");
			extentTest.fail("Diabetes not searched, check screenshot for details");
			reports.addScreenshotToReport(driver, extentTest);	
		}
	
	}

	public void clickCareAtMayo(WebDriver driver,ExtentTest extentTest) {
		
		try{
		webDriverHelper = new WebDriverHelper(driver);
		webDriverHelper.clickOnElement(getCareatMayo());
	
		LoggerHandler.logInfo("Click on Care at Mayo passed");
		extentTest.pass("Clicked on Care at Mayo");

		}catch(Exception e){
		
			LoggerHandler.logError("Click on Care at Mayo failed, check screenshot for details");
			extentTest.fail("Care at Mayo not clicked, check screenshot for details");
			reports.addScreenshotToReport(driver, extentTest);	
		}
	}
	public void clickFindDoctor(WebDriver driver,ExtentTest extentTest) {
		
		try{
		webDriverHelper = new WebDriverHelper(driver);

		webDriverHelper.waitForElementToBeClickable(getFindDoctor(), 5);
		webDriverHelper.clickOnElement(getFindDoctor());
		LoggerHandler.logInfo("Click on Find a doctor passed");
		extentTest.pass("Clicked on Find a doctor");

		}catch(Exception e){
		
			LoggerHandler.logError("Click on Find a doctor failed, check screenshot for details");
			extentTest.fail("Find a doctor not clicked, check screenshot for details");
			reports.addScreenshotToReport(driver, extentTest);	
		}
	}

	public void clickOnRequestAppointment(WebDriver driver) {
			
		try{
		webDriverHelper = new WebDriverHelper(driver);
		webDriverHelper.clickOnElement(getRequestAppointmentLink());
		LoggerHandler.logInfo("Click on Request appointment passed");
		extentTest.pass("Clicked on Request appointment");

		}catch(Exception e){
		
			LoggerHandler.logError("Click on Request appointment failed, check screenshot for details");
			extentTest.fail("Could not Click on Request appointment, check screenshot for details");
			reports.addScreenshotToReport(driver, extentTest);	
		}
	}

	public void clickOnSymptoms(WebDriver driver) {
		try{
	webDriverHelper = new WebDriverHelper(driver);
		webDriverHelper.waitForElementToBeClickable(getSymptomsOption(), 10);
		webDriverHelper.hoverOverElement(getSymptomsOption());
		webDriverHelper.clickOnElement(getSymptomsOption());
					
		LoggerHandler.logInfo("Click on Request Symptoms passed");
		extentTest.pass("Clicked on Request Symptoms");

		}catch(Exception e){
		
			LoggerHandler.logError("Click on Symptoms failed, check screenshot for details");
			extentTest.fail("Could not Click on Symptoms, check screenshot for details");
			reports.addScreenshotToReport(driver, extentTest);	
		}
	}

}

