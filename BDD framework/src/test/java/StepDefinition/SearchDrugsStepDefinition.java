package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AcetaminophenPage;
import pages.DrugsAndSupplementsPage;
import pages.EmailPreviewPageObject;
import pages.HealthLibararyPage;
import pages.HomePageObject;
import utils.Reporter;
import utils.Screenshot;

public class SearchDrugsStepDefinition{
    Reporter reporter;
    AcetaminophenPage acetaminophenPageObject = new AcetaminophenPage();
    DrugsAndSupplementsPage drugsAndSupplementsPageObject = new DrugsAndSupplementsPage();
    HomePageObject homePageObject = new HomePageObject();
    HealthLibararyPage healthLibararyPageObject = new HealthLibararyPage();
    EmailPreviewPageObject emailPreviewPageObject = new EmailPreviewPageObject();
    WebDriver driver=Hooks.driver;
    ExtentTest extentTest=Hooks.extentTest;

    @Given("^user is on the Home Page$")
    public void user_is_on_the_Home_Page()  {

        
    }

    @When("^user clicks on the \"([^\"]*)\"$")
    public void user_clicks_on_the(String arg1) {
        switch (arg1) {
            case "Health Library":
                homePageObject.clickOnHealthLibrary(driver, extentTest);
                break;
            case "Drugs & Supplements":
                healthLibararyPageObject.clickDrugsAndSupplements(driver, extentTest);
                break;
            case "search Drugs and Supplements":
                drugsAndSupplementsPageObject.clickSearchDrugsAndSupplementsBar(driver, extentTest);
                break;
            case "search button":
                drugsAndSupplementsPageObject.clickSearchButton(driver, extentTest);
                break;
            case "Acetaminophen article":
                drugsAndSupplementsPageObject.clickAcetaminophen(driver, extentTest);
                break;
            default:
                break;
        }
    }

    @When("^user give (\\d+) (\\d+) in the \"([^\"]*)\" field$")
    public void user_give_in_the_field(int arg1, int arg2, String arg3){
        drugsAndSupplementsPageObject.sendAcetaminophen(driver, extentTest, arg1, arg2);
    }

    @When("^user scrolls page until \"([^\"]*)\" navigation$")
    public void user_scrolls_page_until_navigation(String arg1) {
        switch (arg1) {
            case "Before Use":
                acetaminophenPageObject.scrollBeforeUse(driver, extentTest);
                break;
            case "Proper Use":
                acetaminophenPageObject.scrollProperUse(driver, extentTest);
                break;
            case "Precautions":
                acetaminophenPageObject.scrollPrecautions(driver, extentTest);
                break;
            case "Side Effects":
                acetaminophenPageObject.scrollSideEffects(driver, extentTest);
                break;
            default:
                break;
        }
    }

    @When("^user clicks on the \"([^\"]*)\" navigation$")
    public void user_clicks_on_the_navigation(String arg1) {
        switch (arg1) {
            case "Before Use":
                acetaminophenPageObject.clickBeforeUse(driver, extentTest);
                break;
            case "Proper Use":
                acetaminophenPageObject.clickProperUse(driver, extentTest);
                break;
            case "Precautions":
                acetaminophenPageObject.clickPrecautions(driver, extentTest);
                break;
            case "Side Effects":
                acetaminophenPageObject.clickSideEffects(driver, extentTest);
                break;
            default:
                break;
        }
    }

    @Then("^user validates \"([^\"]*)\" isDisplayed$")
    public void user_validates_isDisplayed(String arg1) {
        acetaminophenPageObject.verifySideEffectsText(driver, extentTest, arg1);
        try {
            Screenshot.getScreenShot(driver);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
