package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled =true;
        //Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
    }

    @BeforeTest
    public void init(){
        setUp();
    }

    @AfterTest
    public void quit(){
        Selenide.closeWebDriver();
    }
}
