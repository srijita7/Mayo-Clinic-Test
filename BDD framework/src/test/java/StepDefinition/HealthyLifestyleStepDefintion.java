package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HealthyDietPageObject;
import pages.HealthyLifestylePageObject;
import pages.HomePageObject;
import utils.Reporter;

public class HealthyLifestyleStepDefintion {
   
    Reporter reporter;
    WebDriver driver=Hooks.driver;
    ExtentTest extentTest=Hooks.extentTest;
    HealthyLifestylePageObject healthyLifestylePageObject = new HealthyLifestylePageObject();
    HomePageObject homePageObject = new HomePageObject();
    HealthyDietPageObject healthyDietPageObject = new HealthyDietPageObject();


 @When("^User click on \"([^\"]*)\"$")
public void User_clicks_on(String arg1) {
    

    switch (arg1) {
        case "Health Library":
            homePageObject.clickOnHealthLibrary(driver, extentTest);
            break;
        case "Healthy Lifestyle":
            homePageObject.clickHealthyLifestyle(driver, extentTest);
            break;
        case "Nutriton and Healthy Eating":
            healthyLifestylePageObject.clickNutrition(driver, extentTest);
            break;
        case "Healthy Diets":
            healthyLifestylePageObject.clickHealthyDiet(driver, extentTest);
            break;
        default:
            break;
    }
}

@Then("^User verifies Healthy diets label is present in the result page$")
public void User_verifies_Healthy_diets_label_is_present_in_the_result_page() {
    
    String labelText = healthyDietPageObject.getLabelText(driver);
	healthyDietPageObject.verifyLabelText(driver, extentTest, "Healthy diets", labelText);
	healthyDietPageObject.takeSnapshot(driver, extentTest);

}
}
