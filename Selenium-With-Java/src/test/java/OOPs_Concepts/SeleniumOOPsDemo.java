package OOPs_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

public class SeleniumOOPsDemo {

    public static void main(String[] args) {

        // Create Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        //Handle Alert pop-up
        try {
            Alert alert = driver.switchTo().alert();

            System.out.println("Alert message: " + alert.getText());

            alert.accept();   // Clicks OK

        } catch (NoAlertPresentException e) {
            System.out.println("No alert is present");
        }

        //LOGIN 

        LoginPage loginPage = new LoginPage(driver);

        loginPage.openPage();

        loginPage.login("standard_user", "secret_sauce");

        System.out.println("Login completed successfully");


        //PRODUCT PAGE 

        ProductPage productPage = new ProductPage(driver);

        // Add Backpack to cart
        productPage.addBackpackToCart();


        //OPEN CART

        productPage.openCart();


     // Keep browser open for 10 seconds
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Close browser
         driver.quit();
    }
}
