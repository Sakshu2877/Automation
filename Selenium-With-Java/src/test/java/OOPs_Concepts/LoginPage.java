package OOPs_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // Locators
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // POLYMORPHISM - METHOD OVERRIDING
    @Override
    public void openPage() {
        getDriver().get("https://www.saucedemo.com/");
    }

    public void enterUsername(String user) {
        getDriver().findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        getDriver().findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        getDriver().findElement(loginButton).click();
    }

    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }
}