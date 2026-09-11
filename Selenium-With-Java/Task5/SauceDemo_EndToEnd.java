package Task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo_EndToEnd {

	public static void main(String[] args) {

		// Launch Chrome
		WebDriver driver = new ChromeDriver();

		try {

			// Maximize browser
			driver.manage().window().maximize();

			// Open SauceDemo
			driver.get("https://www.saucedemo.com/");

			System.out.println("Website opened successfully");

			// LOGIN

			// Enter Username
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

			// Enter Password
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

			// Click Login
			driver.findElement(By.xpath("//input[@id='login-button']")).click();

			System.out.println("Login successful");

			// Verify Products page
			WebElement productsTitle = driver.findElement(By.xpath("//span[@class='title']"));

			if (productsTitle.isDisplayed()) {
				System.out.println("Products page opened successfully");
			}

			// ADD PRODUCT TO CART

			// Add Sauce Labs Backpack
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();

			System.out.println("Product added to cart successfully");

			// VERIFY CART COUNT

			// Verify cart badge
			WebElement cartBadge = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));

			String cartCount = cartBadge.getText();

			if (cartCount.equals("1")) {
				System.out.println("Cart count verified: 1");
			}

			// OPEN CAR
			// Click cart icon
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

			System.out.println("Cart page opened successfully");

			// VERIFY PRODUCT

			// Verify product name
			WebElement productName = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));

			String actualProductName = productName.getText();

			if (actualProductName.equals("Sauce Labs Backpack")) {
				System.out.println("Product verified: " + actualProductName);
			}

			// Verify product price
			WebElement productPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));

			String actualPrice = productPrice.getText();

			if (actualPrice.equals("$29.99")) {
				System.out.println("Product price verified: " + actualPrice);
			}

			// CHECKOUT

			// Click Checkout
			driver.findElement(By.xpath("//button[@id='checkout']")).click();

			System.out.println("Checkout page opened successfully");

			// Enter First Name
			driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Sakshi");

			// Enter Last Name
			driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Patil");

			// Enter Postal Code
			driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("411035");

			// Click Continue
			driver.findElement(By.xpath("//input[@id='continue']")).click();

			System.out.println("Checkout information entered successfully");

			// VERIFY ORDER SUMMARY

			WebElement summaryTitle = driver.findElement(By.xpath("//span[@class='title']"));

			if (summaryTitle.isDisplayed()) {
				System.out.println("Order summary page opened successfully");
			}

			// FINISH ORDER

			// Click Finish
			driver.findElement(By.xpath("//button[@id='finish']")).click();

			System.out.println("Order completed successfully");

			// VERIFY SUCCESS MESSAGE

			WebElement successMessage = driver.findElement(By.xpath("//h2[@class='complete-header']"));

			String message = successMessage.getText();

			if (message.equals("Thank you for your order!")) {
				System.out.println("Order confirmation verified successfully");
			}

			// LOGOUT

			// Click menu
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();

			System.out.println("Menu opened successfully");

			// Click Logout
			driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

			System.out.println("Logout successful");

			System.out.println("END TO END TEST COMPLETED SUCCESSFULLY");

		} catch (Exception e) {

			System.out.println("Test failed: " + e.getMessage());

		} finally {

			// Close browser
			driver.quit();
		}
	}
}