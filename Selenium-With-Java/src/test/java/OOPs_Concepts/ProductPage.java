package OOPs_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    // Product and cart locators
    private By backpack = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");

    // Constructor
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // Polymorphism - Method Overriding
    @Override
    public void openPage() {
        getDriver().get("https://www.saucedemo.com/inventory.html");
    }

    // Add Backpack to cart
    public void addBackpackToCart() {
        getDriver().findElement(backpack).click();
        System.out.println("Backpack added to cart");
    }

    // Open cart
    public void openCart() {
        getDriver().findElement(cartIcon).click();
        System.out.println("Cart opened successfully");
    }
}
