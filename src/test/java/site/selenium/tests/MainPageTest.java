package site.selenium.tests;

import site.selenium.utils.WebDriverRunner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    public static WebDriver driver;
    private static ChromeOptions chromeOptions = new ChromeOptions();


    @BeforeEach
    public void openOnliner() {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac64/chromedriver");
        driver = WebDriverRunner.getDriver();
        driver.get("http://app.tca.deltixuat.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    @AfterAll
    public static void cleanUp() {
        driver = WebDriverRunner.getDriver();
        driver.close();
    }
}
