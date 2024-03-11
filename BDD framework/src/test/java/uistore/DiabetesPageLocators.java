package uistore;

import org.openqa.selenium.By;

public class DiabetesPageLocators {
    private By type2Diabetes=By.xpath("(//div[@class='cmp-text__rich-content   cmp-text--body-sans-small'])[2]");
    private By symptomsCauses= By.xpath("//div[@id='access-nav']//li[1]");
    private By diagnosisTreatments= By.xpath("//div[@id='access-nav']//li[2]");
    private By doctorDepartments= By.xpath("//div[@id='access-nav']//li[3]");
    private By verify= By.xpath("//h2[contains(text(),'Departments and specialties')]");
    public By getType2Diabetes() {
        return type2Diabetes;
    }
    public By getSymptomsCauses() {
        return symptomsCauses;
    }
    public By getDiagnosisTreatments() {
        return diagnosisTreatments;
    }
    public By getDoctordepartments() {
        return doctorDepartments;
    }
    public By getVerify() {
        return verify;
    }
}
