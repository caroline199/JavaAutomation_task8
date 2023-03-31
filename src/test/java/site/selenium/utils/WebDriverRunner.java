package site.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRunner {

    private static WebDriver driver;

    public static void initDriver() {
        driver = new ChromeDriver();
    }
    public static WebDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    public static void close() {
        driver.quit();
        driver = null;
    }
}
