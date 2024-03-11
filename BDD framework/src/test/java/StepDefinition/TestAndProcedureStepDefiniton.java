package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePageObject;
import pages.TestProceduresPageObject;
import utils.Reporter;

public class TestAndProcedureStepDefiniton {
    Reporter reporter;
    WebDriver driver=Hooks.driver;
    ExtentTest extentTest=Hooks.extentTest;
    TestProceduresPageObject testProceduresPageObject = new TestProceduresPageObject();
    HomePageObject homePageObject = new HomePageObject();


@When("^User clicks on \"([^\"]*)\"$")
public void user_clicks_on(String arg1)  {


    switch(arg1) {
        case "Health Library":
            homePageObject.clickOnHealthLibrary(driver, extentTest);
            break;
        case "Test and Procedures":
            homePageObject.clickTestAndProcedure(driver, extentTest);
            break;
        case "Keyword-M":
            testProceduresPageObject.clickKeywordM(driver, extentTest);
            break;
        case "MRI":
            testProceduresPageObject.clickMri(driver, extentTest);
        default:
            break;
    
    }
}

@Then("^User verifies the result page contains the label Overview$")
public void user_verifies_the_result_page_contains_the_label_Overview()  {
    
    String headerText = testProceduresPageObject.getHeaderText(driver);
	testProceduresPageObject.verifyHeaderText(driver, extentTest, "Overview", headerText);
	testProceduresPageObject.takeSnapshot(driver, extentTest);

}
}
