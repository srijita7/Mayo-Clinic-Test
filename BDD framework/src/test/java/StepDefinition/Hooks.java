package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.*;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
    static WebDriver driver;
    public static final ExtentReports extentReports = new Reporter().createReports("Mayo Clinic Test Report");
    static ExtentTest extentTest;
    static int i = 1;

    String homePage="opened home page";

    @Before
    public void startUp(Scenario scenario) {
        extentTest = extentReports.createTest("Test case " + i +" - "+scenario.getName());
        LoggerHandler.logInfo("Test case " + i +" - "+scenario.getName());
        try {
            driver = openBrowser();
            extentTest.pass(homePage);
            LoggerHandler.logInfo(homePage);
        } catch (Exception e) {
            extentTest.fail("not "+homePage);
            LoggerHandler.logInfo("not "+homePage);
        }
    }

    @After
    public void tearDown() {
        extentReports.flush();
        if (i == 10) {
            SendEmail.sendMail(extentTest);
        }
        i++;
        driver.quit();
    }
}
