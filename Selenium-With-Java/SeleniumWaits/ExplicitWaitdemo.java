package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitdemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open website
        driver.get("https://www.saucedemo.com/");

        System.out.println("Website opened successfully");

        // Create Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for username field
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("user-name")
                )
        );

        username.sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        // Wait for Login button to be clickable
        WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("login-button")
                )
        );

        loginButton.click();

        System.out.println("Login successful");

        // Close browser
        driver.quit();
    }
}
