package PlaywrightTask;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightDemo {

	public static void main(String[] args) {

		// Create Playwright
		Playwright playwright = Playwright.create();

		// Open Chrome browser
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		// Create new page
		Page page = browser.newPage();

		// Open SauceDemo website
		page.navigate("https://www.saucedemo.com/");

		System.out.println("Website opened successfully");

		// Enter Username
		page.locator("#user-name").fill("standard_user");

		// Enter Password
		page.locator("#password").fill("secret_sauce");

		System.out.println("Username and password entered");

		// Click Login button
		page.locator("#login-button").click();

		System.out.println("Login  successfully");

		// Verify Products page
		System.out.println("Page Title: " + page.title());
		System.out.println("Current URL: " + page.url());

		// Close browser
		browser.close();

		// Close Playwright
		playwright.close();
	}
}