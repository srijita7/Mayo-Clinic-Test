package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ApplyNowPage;
import pages.HomePageObject;
import pages.JobsPage;
import pages.ResearchPage;
import pages.SearchJobsPage;
import utils.WebDriverHelper;

public class ExploreCareerStepDefinition {
    WebDriver driver=Hooks.driver;
    WebDriverHelper helper=WebDriverHelper.initializer(driver);
    HomePageObject homePage=new HomePageObject();
    ExtentTest extentTest=Hooks.extentTest;
    JobsPage jobsPage=new JobsPage();
    SearchJobsPage searchJobsPage=new SearchJobsPage();
    ResearchPage researchPage=new ResearchPage();
    ApplyNowPage applyNowPage=new ApplyNowPage();
    @When("^the user clicked on Explore Career in Home Page$")
public void the_user_clicked_on_Explore_Career_in_Home_Page() {
    homePage.clickOnExploreCareer(driver, extentTest);
    
}

@When("^the user clicked \"([^\"]*)\" in Explore Career result page$")
public void the_user_clicked_in_Explore_Career_result_page(String arg1)  {
    switch(arg1){
        case "Search By Role input box":
        jobsPage.clickOnSearchByRole(driver, extentTest, helper);
        break;

        case "Enter Location input box":
        jobsPage.clickOnSearchLocation(driver, extentTest, helper);
        break;

        default:break;
        
    }
}

@When("^gave (\\d+) (\\d+) in the Search by Role input box$")
public void gave_in_the_Search_by_Role_input_box(int arg1, int arg2) {
   jobsPage.sendDataToSearchByRole(driver, extentTest, helper,arg1,arg2);

}

@When("^gave (\\d+) (\\d+) in Enter Location input box$")
public void gave_in_Enter_Location_input_box(int arg1, int arg2) {
    jobsPage.sendDataToSearchLocation(driver, extentTest, helper, arg1, arg2);
    jobsPage.clickOnMinnesota(driver, extentTest, helper);
}

@When("^clicked search icon in Explore Career result page$")
public void clicked_search_icon_in_Explore_Career_result_page() {
    jobsPage.clickOnSearchIcon(driver, extentTest, helper);
    
}

@When("^the user clicked \"([^\"]*)\" in Search Jobs result page$")
public void the_user_clicked_in_Search_Jobs_result_page(String arg1){
   switch(arg1){
    case "area of interest":
    searchJobsPage.clickOnAreaOfInterest(driver, extentTest, helper);
    break;

    case "Critical Care":
    searchJobsPage.clickOnCriticalCare(driver, extentTest, helper);
    break;

    default:break;

   }
}

@When("^clicked first result in Search Jobs result page$")
public void clicked_first_result_in_Search_Jobs_result_page()  {
    searchJobsPage.clickOnResearch(driver, extentTest, helper);
}

@When("^clicked Apply Now in Research result page$")
public void clicked_Apply_Now_in_Research_result_page()  {
    researchPage.clickOnApplyNow(driver, extentTest, helper);
}
@Then("^the user verifies the displayed message in Apply result page$")
public void the_user_verifies_the_displayed_message_in_Apply_result_page()  {
    applyNowPage.checkMessage(driver, extentTest, helper);
}
}
