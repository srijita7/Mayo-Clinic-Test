package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporter {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
    TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
    String t = dateFormat.format(new Date());
    static ExtentReports extentreport;
 
    public ExtentReports createReports(String fileName){
        if (extentreport == null)
            return generateReport(fileName);
        else
            return extentreport;
    }
    private ExtentReports generateReport(String fileName){
        try{
            extentreport = new ExtentReports();
            File file = new File(System.getProperty("user.dir") + "/reports/" + fileName + "_" + t + ".html");
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
            sparkReporter.config().setDocumentTitle(fileName + "Test Report");
            sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
            extentreport.attachReporter(sparkReporter);
           
        }catch(Exception e){
            e.getMessage();
        }return extentreport;
    }
    public void addScreenshotToReport(WebDriver driver, ExtentTest test){
        test.addScreenCaptureFromBase64String(((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64));
    }
}
