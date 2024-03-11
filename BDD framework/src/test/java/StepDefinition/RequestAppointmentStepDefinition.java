package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AppointmentsLocationPageObject;
import pages.AppointmentsPageObject;
import pages.HomePageObject;
import pages.NewAppointmentsPageObject;

public class RequestAppointmentStepDefinition {

    HomePageObject homePageObject = new HomePageObject();
    AppointmentsPageObject appointmentsPageObject = new AppointmentsPageObject();
    AppointmentsLocationPageObject appointmentsLocationPageObject = new AppointmentsLocationPageObject();
    NewAppointmentsPageObject newAppointmentsPageObject = new NewAppointmentsPageObject();

    WebDriver driver = Hooks.driver;
    ExtentTest extentTest = Hooks.extentTest;

    @When("^user clicks on \"([^\"]*)\" link on \"([^\"]*)\" page$")
    public void userClicksOnLinkOnPage(String link, String page) {
        switch (link) {
            case "Request Appointment":
                homePageObject.clickOnRequestAppointment(driver, extentTest);
                break;
            case "New Patients":
                appointmentsPageObject.clickOnNewPatients(driver, extentTest);
                break;
            case "Outside of the U.S.":
                appointmentsLocationPageObject.clickOnLocationOutsideUS(driver, extentTest);
                break;
            case "Continue":
                newAppointmentsPageObject.clickOnContinue(driver, extentTest);
                break;
            case "Start":
                newAppointmentsPageObject.clickOnStart(driver, extentTest);
                break;
            case "Yes I am a patient":
            case "Yes":
                newAppointmentsPageObject.clickOnYes(driver, extentTest);
                break;
            case "I do not have any medical records":
                newAppointmentsPageObject.clickOnIDoNotHaveAnyMedicalRecords(driver, extentTest);
                break;
            case "Mayo Clinic logo":
                newAppointmentsPageObject.clickOnLogo(driver, extentTest);
                break;
            default:break;
        }

    }

    @When("^user clicks on \"([^\"]*)\" option from the popup$")
    public void userClicksOnOptionFromThePopup(String option) {
        switch (option) {
            case "Exit the request":
                newAppointmentsPageObject.clickOnExitRequestButton(driver, extentTest);
                break;
            default:break;
        }
    }

    @Then("^user verifies the text \"([^\"]*)\"$")
    public void userVerifiesTheText(String expectedText) {
        String actualText = "";
        switch (expectedText) {
            case "Patient Information":
                actualText = newAppointmentsPageObject.getPatientInformationSectionText(driver, extentTest);
                newAppointmentsPageObject.verifyPatientInformationSectionText(driver, extentTest, expectedText,
                        actualText);
                break;
            case "New Patients":
                actualText = appointmentsPageObject.getHeaderText(driver, extentTest);
                appointmentsPageObject.verifyHeaderText(driver, extentTest, expectedText, actualText);
                break;
            case "Start your appointment request here.":
                actualText = appointmentsPageObject.getTitleText(driver, extentTest);
                appointmentsPageObject.verifyTitleText(driver, extentTest, expectedText, actualText);
                break;
            default:break;
        }
    }

}
