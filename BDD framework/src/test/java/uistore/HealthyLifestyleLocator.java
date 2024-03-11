package uistore;

import org.openqa.selenium.By;

public class HealthyLifestyleLocator {
    private By nutrition = By.xpath("//span[text()='Nutrition and healthy eating']");
 public By getNutrition() {
	return nutrition;
}
 private By healthyDiet = By.xpath("(//a[text()='Healthy diets'])[2]");
 public By getHealthyDiet() {
	return healthyDiet;
}
}
