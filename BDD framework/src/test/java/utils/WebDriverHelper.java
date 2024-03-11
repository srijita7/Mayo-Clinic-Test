package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

public class WebDriverHelper {
    private WebDriver driver;

    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }
    public static WebDriverHelper initializer(WebDriver driver){

        WebDriverHelper helper=new WebDriverHelper(driver);
        return helper;
    }
    public void waitForElementToBeClickable(By element, int timeoutInSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeVisible(By element, int timeoutInSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void clickOnElement(By element) {
        WebElement webElement = driver.findElement(element);
        webElement.click();
    }

    public void sendKeys(By element, String data) {
        WebElement webElement = driver.findElement(element);
        webElement.sendKeys(data);
    }

    public String getText(By element) {
        WebElement webElement = driver.findElement(element);
        return webElement.getText();
    }

    public void javascriptScrollVertically(int scrollAmount) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + scrollAmount + ")");
    }

    public void javascriptScroll(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: lightskyblue; border: 2px solid red;');",
                element);
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void switchToNewWindow() {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.isEmpty()) {
                driver.switchTo().window(windowHandle);   
            }
        }
    }

    public void enterAction(By element) {
        WebElement webElement = driver.findElement(element);
        webElement.sendKeys(Keys.ENTER);
    }

    public void hoverOverElement(By element) {
        WebElement webElement = driver.findElement(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).perform();
    }

    public void jsClick(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: lightskyblue; border: 2px solid red;');",
                element);
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
        js.executeScript("arguments[0].click();", element);
    }

    public void clearInput(By ele) {

        driver.findElement(ele).clear();
    }

    public String pageURL()
    {
        return driver.getCurrentUrl();
    }

}
