//Mar 2-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		By emailId = By.id("username");
		By signUpLink = By.linkText("Sign up");

		// cmd+shift+O -> import packages

		// An expectation for checking that an element is present on the DOM of a page.
		// This does not necessarily mean that the element is visible.
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//
//		email_ele.sendKeys("Manish123@gmail.com");

		waitForElementToBeLocated(emailId, 10).sendKeys("Manish123@gmail.com");

//		waitForElementToBeVisible(emailId, 5).sendKeys("manish@123");
		driver.findElement(By.id("password")).sendKeys("manish123");
		driver.findElement(By.id("loginBtn")).click();

//		waitForElementToBeLocated(signUpLink, 10).click();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement waitForElementToBeVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}

	public static WebElement waitForElementToBeLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

}
