package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
    public static void getScreenShot(WebDriver driver) throws IOException{
        Date d = new Date();
        String date = d.toString().replace(" ", "-");

        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr, new File(".//screenshot/Mayo Clinic_" + date + ".jpeg"));
    }
    
}
