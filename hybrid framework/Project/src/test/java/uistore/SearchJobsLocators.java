package uistore;

public class SearchJobsLocators {
    private String areaOfInterest="//button[@id='custom_fields.industryfield-toggle']";
    private String criticalCare="(//ul//li//span[contains(text(),'Critical Care')])[1]";
    private String research="(//a[@href='/job/rochester/research-fellow-pulmonary-limper-lab/33647/53174594144'])[1]";
    public String getAreaOfInterest(){
        return areaOfInterest;
    }
    public String getCriticalCare() {
        return criticalCare;
    }
    public String getResearch() {
        return research;
    }

    
}
