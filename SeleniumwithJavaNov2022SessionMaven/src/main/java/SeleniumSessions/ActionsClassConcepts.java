//Feb 8-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcepts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		By email = By.id("username");
		By pwd = By.id("password");
		By login = By.id("loginBtn");

		Thread.sleep(2000);

//		driver.findElement((email)).sendKeys("manish");
		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(email), "manish@gmail.com").perform();
//		act.sendKeys(driver.findElement(pwd), "manish123").perform();
//		act.click(driver.findElement(login)).perform();

//		doActionsSendKeys(email, "manish@gmail.com");
//		doActionsSendKeys(pwd, "mansih123");
//		doActionsClick(login);

		// act.doubleClick();->Performs a double-click at the current mouse location.
		// act.doubleClick(null);->Performs a double-click at middle of the given
		// element.

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}

	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
}
