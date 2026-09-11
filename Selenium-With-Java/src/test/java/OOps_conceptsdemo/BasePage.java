package OOps_conceptsdemo;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    // Encapsulation
    private WebDriver driver;

    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Getter
    public WebDriver getDriver() {
        return driver;
    }

    // Abstract method
    public abstract void openPage();

    // Common method
    public void closeBrowser() {
        driver.quit();
    }
}
