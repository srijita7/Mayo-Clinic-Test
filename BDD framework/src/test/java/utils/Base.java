package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    private WebDriver driver;
    static final int IMPLICIT_WAIT = 10;
    static final int PAGE_LOAD_TIME = 25;
    static Properties prop = new Properties();
    
    public Base() {
        String filepath = System.getProperty("user.dir") + "/config/browser.properties";
        try ( FileInputStream file = new FileInputStream(filepath);) {
            
            prop = new Properties();
            prop.load(file);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public WebDriver openBrowser(){
        String browsername = prop.getProperty("browsername");
        if (browsername.equalsIgnoreCase("chrome")) {
             DesiredCapabilities dc = new DesiredCapabilities();
             dc.setBrowserName("chrome");
             driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browsername.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browsername.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if (browsername.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }

        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIME));   
        
        return driver;
    }

    public String excelFilePath(){
        String path=null;
        try{
            path=System.getProperty("user.dir")+prop.getProperty("path");
        }catch(Exception e){
            e.getMessage();
        }
        return path;
    }
}