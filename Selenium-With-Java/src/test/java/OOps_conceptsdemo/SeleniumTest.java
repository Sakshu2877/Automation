package OOps_conceptsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // Create WebDriver object
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        // Create child class object
        SearchPage amazon = new SearchPage(driver);

        // Open Amazon
        amazon.openPage();

        Thread.sleep(2000);

        // Search product
        amazon.searchProduct("Laptop", "Searching for laptop");

        Thread.sleep(3000);

        // Close browser
        amazon.closeBrowser();
    }
}
