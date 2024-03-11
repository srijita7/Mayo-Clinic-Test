package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DiabetesPageObjects;
import pages.FindDoctorPage;
import pages.HomePageObject;

public class DiabetesStepDefinition {
    WebDriver driver = Hooks.driver;
    ExtentTest extentTest= Hooks.extentTest;
    HomePageObject objHomePageObject= new HomePageObject();
    DiabetesPageObjects objDiabetesPageObjects= new DiabetesPageObjects();
    FindDoctorPage objFindDoctorPage = new FindDoctorPage();
    

@When("^user enters (\\d+) (\\d+) in the search bar$")
public void user_enters_in_the_search_bar(int arg1, int arg2){
    objHomePageObject.searchDiabetes(driver, extentTest, arg1, arg2);
    
}

@When("^user clicks on \"([^\"]*)\"$")
public void user_clicks_on(String arg1){
    switch (arg1) {
        case "Search box":
            objHomePageObject.clickOnSearchBar(driver, extentTest);
            break;
        case "Search Button":
            objHomePageObject.clickSearchButton(driver, extentTest);
            break;
        case "type2 diabetes":
            objDiabetesPageObjects.clickDiabetes(driver, extentTest);
            break;
        case "Symptoms and Causes":
            objDiabetesPageObjects.clickSymptomsAndCauses(driver, extentTest);
            break;
         case "Diagnosis and Treatment":
          objDiabetesPageObjects.clickDiagnosisTreatment(driver, extentTest);
            break;
        case "Doctors and Departments":
            objDiabetesPageObjects.clickDoctorsDepartments(driver, extentTest);
            break;
        default:
            break;
    }
    
}

@Then("^user verifies heading present on the result page is accurate$")
public void user_verifies_heading_present_on_the_result_page_is_accurate() {
    objDiabetesPageObjects.verifyFirst(driver, extentTest);
    
}
}
