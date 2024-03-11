package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GiftDetailsPage;
import pages.HomePageObject;
import utils.Reporter;

public class GiftDetailsStepDefinition {

    WebDriver driver=Hooks.driver;
    GiftDetailsPage giftDetailsPageObject = new GiftDetailsPage();
    ExtentTest extentTest=Hooks.extentTest;
    Reporter reporter;
    HomePageObject homePageObject = new HomePageObject();

    @Given("^user is on the \"([^\"]*)\"$")
    public void user_is_on_the(String arg1)  {
        
    }

    @When("^user click on \"([^\"]*)\" tab$")
    public void user_click_on_tab(String arg1)  {
        switch (arg1) {
            case "Giving_on_Mayoclinic":
                homePageObject.clickGivingToMayo(driver, extentTest);
                break;
            case "Give_Now":
                homePageObject.clickGiveNow(driver, extentTest);
                break;
            case "Desired_Amount":
                giftDetailsPageObject.clickAmount(driver, extentTest);
                break;
            case "Designate_My_Gift":
                giftDetailsPageObject.clickDesignate(driver, extentTest);
                break;
            case "Medical_Education":
                giftDetailsPageObject.clickMedicalEducation(driver, extentTest);
                break;
            case "Anonymous_Donation":
                giftDetailsPageObject.clickAnonymously(driver, extentTest);
                break;
            case "Title_dropdown":
                giftDetailsPageObject.clickTitle(driver, extentTest);
                break;
            case "Mr":
                giftDetailsPageObject.clickMr(driver, extentTest);
                break;
            case "Country":
                giftDetailsPageObject.clickCountry(driver, extentTest);
                break;
            case "India":
                giftDetailsPageObject.clickIndia(driver, extentTest);
                break;
            case "State/Territory":
                giftDetailsPageObject.clickState(driver, extentTest);
                break;
            case "NA":
                giftDetailsPageObject.clickNA(driver, extentTest);
                break;
            case "Make_My_Gift":
                giftDetailsPageObject.clickMakeMyGiftButton(driver, extentTest);
                break;
            default:
                break;
        }
    }

    @When("^user click on \"([^\"]*)\" field$")
    public void user_click_on_field(String arg1){
        switch (arg1) {
            case "First_Name":
                giftDetailsPageObject.clickFirstName(driver, extentTest);
                break;
            case "Last_Name":
                giftDetailsPageObject.clickLastName(driver, extentTest);
                break;
            case "Address":
                giftDetailsPageObject.clickAddress(driver, extentTest);
                break;
            case "City_field":
                giftDetailsPageObject.clickCity(driver, extentTest);
                break;
            case "Zip/PostalCode":
                giftDetailsPageObject.clickZip(driver, extentTest);
                break;
            case "Phone_Number":
                giftDetailsPageObject.clickPhoneNumber(driver, extentTest);
                break;
            case "Email_Address":
                giftDetailsPageObject.clickEmail(driver, extentTest);
                break;
            default:
                break;
        }
    }

    @When("^user enters \"([^\"]*)\" in the given text box in \"([^\"]*)\"$")
    public void user_enters_in_the_given_text_box_in(String arg1, String arg2)  {
        switch (arg2) {
            case "firstname":
                giftDetailsPageObject.sendFirstName(driver, extentTest, arg1);
                break;   
            case "lastname":
                giftDetailsPageObject.sendLastName(driver, extentTest, arg1);
                break;
            case "address":
                giftDetailsPageObject.sendAddress(driver, extentTest, arg1);
                break;
            case "city":
                giftDetailsPageObject.sendCity(driver, extentTest, arg1);
                break;
            case "zip":
                giftDetailsPageObject.sendZip(driver, extentTest, arg1);
                break;
            case "phone":
                giftDetailsPageObject.sendPhoneNumber(driver, extentTest, arg1);
                break;
            case "email":
                giftDetailsPageObject.sendEmail(driver, extentTest, arg1);
                break;
            default:
                break;

        }
        
    }

    @Then("^a new page pops up and the user  verifies the Complete Payment text and captures a screenshot$")
    public void a_new_page_pops_up_and_the_user_verifies_the_Complete_Payment_text_and_captures_a_screenshot()
             {
                giftDetailsPageObject.verifyCompletePaymentText(driver, extentTest);
    }

}
