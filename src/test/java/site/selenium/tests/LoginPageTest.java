package site.selenium.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class LoginPageTest extends MainPageTest {

    @Test
    public void testLogin() throws InterruptedException {
        WebElement email = driver.findElement(By.xpath("//input[@formcontrolname ='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@formcontrolname ='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@role ='submit']"));

        email.clear();
        email.sendKeys("selenium_chrome");
        password.clear();
        password.sendKeys("Axa@Demo");

        loginButton.click();

        String profileName = driver.findElement(By.xpath("//span[contains(@class,'header__user-name')]")).getText();

        Assert.assertEquals(profileName,"SELENIUM_CHROME");
    }
}
