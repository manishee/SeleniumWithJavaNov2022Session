//Feb 8-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		driver.get("https://www.orangehrm.com/contact-sales/");
		By email = By.id("username");
		By pwd = By.id("password");
		By login = By.id("loginBtn");

		Thread.sleep(2000);

		Actions act = new Actions(driver);

		act.sendKeys(driver.findElement(email), "manish@gmail.com").perform();
		act.sendKeys(driver.findElement(pwd), "manish123").perform();
		act.sendKeys(Keys.ENTER).perform();

//		act.doubleClick();->Performs a double-click at the current mouse location.
//		act.doubleClick(null);->Performs a double-click at middle of the given element.

//		doActionsSendKeys(email, "manish@gmail.com");
//		doActionsSendKeys(pwd, "mansih123");
//		doActionsClick(login);

//		act.moveToElement(driver.findElement(email)).sendKeys("manish@gmail.com").build().perform();
//		act.moveToElement(driver.findElement(pwd)).sendKeys("manish123").build().perform();
//		act.moveToElement(driver.findElement(login)).click().build().perform();

//		doSendKeysWithMoveToElement(email, "manish@gmail.com");
//		doSendKeysWithMoveToElement(pwd, "manish123");
//		doClickWithMoveToElement(login);

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

	public static void doSendKeysWithMoveToElement(By locator, String value) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).sendKeys(value).build().perform();
	}

	public static void doClickWithMoveToElement(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).click().build().perform();
	}

}
