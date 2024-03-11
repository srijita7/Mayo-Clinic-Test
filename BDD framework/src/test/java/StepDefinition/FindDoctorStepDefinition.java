package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FindDoctorPage;
import pages.HomePageObject;

public class FindDoctorStepDefinition {
    WebDriver driver = Hooks.driver;
    ExtentTest extentTest = Hooks.extentTest;
    HomePageObject objHomePageObject = new HomePageObject();
    FindDoctorPage objFindDoctorPage = new FindDoctorPage();

    @When("^user clicks on the Doctor's name, conditions or procedure search box on result page$")
    public void user_clicks_on_the_Doctor_s_name_conditions_or_procedure_search_box_on_result_page() {
        objFindDoctorPage.clickSearchBar(driver, extentTest);
    }

    @When("^user enters (\\d+) (\\d+) in the search box$")
    public void user_enters_in_the_search_box(int arg1, int arg2)  {
        objFindDoctorPage.searchDoctor(driver, extentTest, arg1, arg2);
    }

    @When("^user selects \"([^\"]*)\"$")
    public void user_selects(String arg1)  {
        switch (arg1) {
                case "Care at Mayo Clinic":
                objHomePageObject.clickCareAtMayo(driver, extentTest);
                break;
            case "Find a doctor":
                objHomePageObject.clickFindDoctor(driver, extentTest);
                break;
            case "Location":
                objFindDoctorPage.selectLocation(driver, extentTest);
                break;
            case "Rochester MN":
                objFindDoctorPage.clickonRequiredLocation(driver, extentTest);
                break;
            case "Search icon":
                objFindDoctorPage.clickSearchButton(driver, extentTest);
                break;
            case "first Cardiologist from the results page":
                objFindDoctorPage.selectFirst(driver, extentTest);
                break;
            case "Send a secure message via patient portal":
                objFindDoctorPage.sendMessage(driver, extentTest);
                break;
            default:
                break;
        }
    }

    @Then("^user verifies if the label says PATIENT ONLINE SERVICES\\.$")
    public void user_verifies_if_the_label_says_PATIENT_ONLINE_SERVICES()  {
        objFindDoctorPage.verify(driver, extentTest);
    }

}
