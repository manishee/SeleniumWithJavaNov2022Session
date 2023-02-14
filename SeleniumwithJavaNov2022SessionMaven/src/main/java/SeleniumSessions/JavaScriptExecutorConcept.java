//Feb 14-2023-P2
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

		// driver.getTitle();
		// String text = jsUtil.getTitleByJS();
		// System.out.println(text);

		Thread.sleep(2000);

		// driver.navigate().refresh();
		// jsUtil.refreshBrowserByJS();

		// jsUtil.generateAlert("Testing by JS Executor");
		// System.out.println(driver.getPageSource());
//		String pageInnerText = jsUtil.getPageInnerText();
//		System.out.println(pageInnerText);
//

		WebElement signUpLink = driver.findElement(By.linkText("Sign up"));
//		jsUtil.clickElementByJS(signUpLink);

		// jsUtil.sendKeysUsingWithId("username", "manish@gmail.com");

		// jsUtil.drawBorder(signUpLink);

		WebElement loginForm = driver.findElement(By.id("hs-login"));
		jsUtil.drawBorder(loginForm);
	}

}