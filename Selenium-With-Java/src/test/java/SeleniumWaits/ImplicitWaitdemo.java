package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitdemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open website
        driver.get("https://www.saucedemo.com/");

        System.out.println("Website opened successfully");

        // Enter username
        driver.findElement(By.id("user-name"))
               .sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password"))
               .sendKeys("secret_sauce");

        // Click Login
        driver.findElement(By.id("login-button"))
               .click();

        System.out.println("Login successful");

        // Close browser
        driver.quit();
    }
}
