package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AppointmentsPageObject;
import pages.CoughSymptomsPageObject;
import pages.EmailPreviewPageObject;
import pages.HomePageObject;
import pages.SymptomsPageObject;
import pages.WhenToSeeADoctorPageObject;

enum Links {
    HEALTH_LIBRARY("Health Library"),
    SYMPTOMS("Symptoms"),
    C("C"),
    COUGH("Cough"),
    WHEN_TO_SEE_A_DOCTOR("When to see a doctor"),
    CLICK_HERE_FOR_AN_EMAIL_PREVIEW("Click here for an email preview"),
    GET_CARE_NOW("Get care now");
    
    private String value;

    private Links(String value) {
       this.value = value;
    }

    public String getValue() {
       return value;
    }
}
public class ViewSymptomsStepDefinition {
    HomePageObject homePageObject = new HomePageObject();

    AppointmentsPageObject appointmentsPageObject = new AppointmentsPageObject();
    SymptomsPageObject symptomsPageObject = new SymptomsPageObject();
    CoughSymptomsPageObject coughSymptomsPageObject = new CoughSymptomsPageObject();
    WhenToSeeADoctorPageObject whenToSeeADoctorPageObject = new WhenToSeeADoctorPageObject();
    EmailPreviewPageObject emailPreviewPageObject = new EmailPreviewPageObject();

    WebDriver driver = Hooks.driver;
    ExtentTest extentTest = Hooks.extentTest;

    @When("^User clicks on \"([^\"]*)\" link on \"([^\"]*)\" page$")
    public void userClicksOnLinkOnPage(String linkOnPage, String page) {
    	
    	Links link=Links.valueOf(linkOnPage.replace(" ", "_").toUpperCase());
    	
        switch (link) {
            case HEALTH_LIBRARY:
                homePageObject.clickOnHealthLibrary(driver, extentTest);
                break;
            case SYMPTOMS:
                homePageObject.clickOnSymptoms(driver, extentTest);
                break;
            case C:
                symptomsPageObject.clickOnKeyC(driver, extentTest);
                break;
            case COUGH:
                symptomsPageObject.clickOnCough(driver, extentTest);
                break;
            case WHEN_TO_SEE_A_DOCTOR:
                coughSymptomsPageObject.clickOnWhenToSeeADoctor(driver, extentTest);
                break;
            case CLICK_HERE_FOR_AN_EMAIL_PREVIEW:
                whenToSeeADoctorPageObject.clickOnClickHereForAnEmailPreviewLink(driver, extentTest);
                break;
            case GET_CARE_NOW:
                emailPreviewPageObject.clickOnGetCareNow(driver, extentTest);
                break;
            default:break;
        }
    }

    @When("^User scrolls down to \"([^\"]*)\" section$")
    public void userScrollsDownToSection(String section) {
        switch (section) {
            case "Email Preview":
                whenToSeeADoctorPageObject.scrollToClickHereForAnEmailPreview(driver, extentTest);
                break;
            case "Get care now":
                emailPreviewPageObject.scrollToGetCareNow(driver, extentTest);
                break;
            default:break;
        }

    }

    @Then("^User verifies the Text \"([^\"]*)\"$")
    public void userVerifiesTheText(String expectedText) {
        String actualText = "";
        switch (expectedText) {
            case "When to see a doctor":
                actualText = whenToSeeADoctorPageObject.getHeaderText(driver, extentTest);
                whenToSeeADoctorPageObject.verifyHeaderText(driver, extentTest, expectedText, actualText);
                break;
            case "Start your appointment request here.":
                actualText = appointmentsPageObject.getTitleText(driver, extentTest);
                appointmentsPageObject.verifyTitleText(driver, extentTest, expectedText, actualText);
                break;
            default:break;
        }
    }

}
