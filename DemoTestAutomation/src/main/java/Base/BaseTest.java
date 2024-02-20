package Pages;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest extends BaseLibrary {
    public static WebDriver webDriver;

    @BeforeSuite
    public void setUp(){

        System.setProperty("webdriver.geck.driver","drivers/geckdrive");
        webDriver = new FirefoxDriver();
        webDriver.get("https://www.amazon.com.tr/");
        webDriver.manage().window().maximize();
    }

}

