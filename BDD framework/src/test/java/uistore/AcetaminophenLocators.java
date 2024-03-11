package uistore;

import org.openqa.selenium.By;

public class AcetaminophenLocators {
    private By beforeUse=By.xpath("//a[@data-di-id='di-id-3141938e-bc430a48']");
	private By properUse=By.xpath("//a[@data-di-id='di-id-207711fd-b8c48796']");
	private By precautions=By.xpath("//a[@data-di-id='di-id-207711fd-7415ca64']");
	private By sideEffects=By.xpath("(//a[contains(text(),'Side Effects')])[2]");
    private By sideEffectsText=By.xpath("//h2[contains(text(),'Side Effects')]");
    public By getSideEffectsText() {
        return sideEffectsText;
    }
    public By getBeforeUse() {
        return beforeUse;
    }
    public By getProperUse() {
        return properUse;
    }
    public By getPrecautions() {
        return precautions;
    }
    public By getSideEffects() {
        return sideEffects;
    }
}
