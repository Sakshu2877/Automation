package OOps_conceptsdemo;

import org.openqa.selenium.WebDriver;

public class SearchPage extends AmazonPage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    // Method overriding
    @Override
    public void openPage() {
        getDriver().get("https://www.amazon.in/");
        System.out.println("Amazon search page opened");
    }

    // Method overloading
    public void searchProduct(String product) {
        super.searchProduct(product);
    }

    public void searchProduct(String product, String message) {
        System.out.println(message);
        super.searchProduct(product);
    }
}
