//Feb 28-2023-P3
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		// Explicit Wait:
		// 1. WebDriverWait extends FluentWait
		// 2. FluentWait
		// both are implementing wait interface

		// WebDriverWait : is a class
		// its a dynamic wait
		// its a custom wait for a specific web element
		// not a global wait
		// can be applied for non web elements

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		// Thread.sleep(10000);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// WebDriverWait wait = new WebDriverWait(driver, 10);
		WebDriverWait wait = new WebDriverWait(driver, 10, 200);
		// wait.until(ExpectedConditions.titleContains("Login"));
		wait.until(ExpectedConditions.titleIs("HubSpot Login"));
		// Expected condition failed: waiting for title to be "Hubspot Login". Current
		// title:
		// "HubSpot Login" (tried for 10 second(s) with 500 milliseconds
		// interval)-->polling

		System.out.println(driver.getTitle());

	}

}
