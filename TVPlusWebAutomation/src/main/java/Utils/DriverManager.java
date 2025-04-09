package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DriverManager {

    private static WebDriver driver;

    @BeforeClass
    public static WebDriver getDriver() {

        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://tvplus.com.tr");
        }
        return driver;

    }

    @AfterClass
    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}

