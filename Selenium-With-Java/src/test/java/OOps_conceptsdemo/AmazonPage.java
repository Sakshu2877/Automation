package OOps_conceptsdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPage extends BasePage {

    // Constructor
    public AmazonPage(WebDriver driver) {
        super(driver);
    }

    // Implementing abstract method
    @Override
    public void openPage() {
        getDriver().get("https://www.amazon.in/");
    }

    // Search method
    public void searchProduct(String product) {

        getDriver().findElement(
                By.id("twotabsearchtextbox")
        ).sendKeys(product);

        getDriver().findElement(
                By.id("nav-search-submit-button")
        ).click();
    }
}
