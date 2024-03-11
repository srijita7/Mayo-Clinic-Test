package uistore;

import org.openqa.selenium.By;

public class HealthyDietLocator {
    private By healthyDietLabel = By.xpath("//h2[text()='Healthy diets']");
    public By getHealthyDietLabel() {
        return healthyDietLabel;
    }
}
