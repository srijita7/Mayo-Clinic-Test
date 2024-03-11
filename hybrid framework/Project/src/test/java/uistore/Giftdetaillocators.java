package uistore;

import org.openqa.selenium.By;

public class Giftdetaillocators {

By clickamount = By.xpath("(//label[@class='btn'])[2]");
By clickdesignate = By.xpath("//select[@id='designation']");
By clickmedical = By.xpath("//option[contains(text(),'Medical Education')]");
By clickanonymously = By.xpath("//label[contains(text(),'I would like to donate anonymously')]");
By clicktitle = By.xpath("//select[@id='personalTitle']");
By clickmr = By.xpath("//option[contains(text(),'Mr.')]");
By clickfirstnm= By.xpath("//input[@id='personalFirstName']");
By clicklastnm= By.xpath("//input[@id='personalLastName']");
By clickcountry= By.xpath("//select[@id='personalCountry']");
By clickIndia = By.xpath("(//option[contains(text(),'India')])[3]");
By clickstate = By.xpath("//select[@id='personalState']");
By clickna = By.xpath("//option[contains(text(),'NA')]");
By clickaddress = By.xpath("//input[@id='personalAddress']");
By clickcity = By.xpath("//input[@id='personalCity']");
By clickzip = By.xpath("//input[@id='personalZip']");
By clickphone = By.xpath("//input[@id='personalPhone']");
By clickemail = By.xpath("//input[@id='personalEmail']");
By clickbutton = By.xpath("//button[@id='adfSubmit']");
By verifytext = By.xpath("//h1[contains(text(),'Complete payment')]");



public By getClickamount() {
    return clickamount;
}
public By getClickdesignate() {
    return clickdesignate;
}
public By getClickmedical() {
    return clickmedical;
}
public By getClickanonymously() {
    return clickanonymously;
}
public By getClicktitle() {
    return clicktitle;
}
public By getClickmr() {
    return clickmr;
}
public By getClickfirstnm() {
    return clickfirstnm;
}
public By getClicklastnm() {
    return clicklastnm;
}
public By getClickcountry() {
    return clickcountry;
}
public By getClickIndia() {
    return clickIndia;
}
public By getClickstate() {
    return clickstate;
}
public By getClickna() {
    return clickna;
}
public By getClickaddress() {
    return clickaddress;
}
public By getClickcity() {
    return clickcity;
}
public By getClickzip() {
    return clickzip;
}
public By getClickphone() {
    return clickphone;
}
public By getClickemail() {
    return clickemail;
}
public By getClickbutton() {
    return clickbutton;
}
public By getVerifytext() {
    return verifytext;
}


}
   

