package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BeyondCancerPage;
import pages.BookSubPage;
import pages.CancerPage;
import pages.CartPage;
import pages.HomePageObject;
import utils.WebDriverHelper;

public class CartStepDefinition {
    WebDriver driver=Hooks.driver;
    WebDriverHelper helper=WebDriverHelper.initializer(driver);
    HomePageObject homePage=new HomePageObject();
    ExtentTest extentTest=Hooks.extentTest;
    BookSubPage bookSubPage=new BookSubPage();
    CancerPage cancerPage=new CancerPage();
    BeyondCancerPage beyondCancerPage=new BeyondCancerPage();
    CartPage cartPage=new CartPage();

@When("^the user clicked on \"([^\"]*)\" in Home Page$")
public void the_user_clicked_on_in_Home_Page(String arg1)  {
    switch(arg1){
        case "Health Library":
        homePage.clickOnHealthLibrary(driver, extentTest);
        break;

        case "Book and Subscription":
        homePage.clickOnBookSubscription(driver, extentTest);
        break;

        default:break;
    }
}

@When("^clicked View Cancer in Book & Subscription result page$")
public void clicked_View_Cancer_in_Book_Subscription_result_page() {
    bookSubPage.clickOnViewCancer(driver, extentTest, helper);
}

@When("^clicked Beyond Breast Cancer in Cancer result page$")
public void clicked_Beyond_Breast_Cancer_in_Cancer_result_page(){
    cancerPage.clickOnBeyondCancer(driver, extentTest, helper);
}

@When("^the user clicked \"([^\"]*)\" in Breast Cancer result page$")
public void the_user_clicked_in_Breast_Cancer_result_page(String arg1)  {
    switch(arg1){
        case "quantity input box":
        beyondCancerPage.clickOnInput(driver, extentTest, helper);
        break;

        case "Add to Cart":
        beyondCancerPage.clickOnAddToCart(driver, extentTest, helper);
        break;

        default:break;
    }
}

@When("^clears the default value in input box$")
public void clears_the_default_value_in_input_box() {
    beyondCancerPage.clearsInput(driver, extentTest, helper);
}

@When("^gave (\\d+) (\\d+) in quantity input box$")
public void gave_in_quantity_input_box(int arg1, int arg2) {
   beyondCancerPage.sendKeysToInput(driver, extentTest, helper, arg1, arg2);
   
}

@Then("^the user verifies the displayed messageḍ$")
public void the_user_verifies_the_displayed_messageḍ()  {
   cartPage.checkOrderSummary(driver, extentTest, helper);
}


}
