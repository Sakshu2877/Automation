package OOPs_Concepts;


import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    // ENCAPSULATION
    private WebDriver driver;

    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Getter
    public WebDriver getDriver() {
        return driver;
    }

    // ABSTRACTION
    public abstract void openPage();

    public void closeBrowser() {
        driver.quit();
    }
}