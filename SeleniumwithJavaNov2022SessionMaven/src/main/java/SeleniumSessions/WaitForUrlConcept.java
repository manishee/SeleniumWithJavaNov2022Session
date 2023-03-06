//Mar 6-2022-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrlConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("About Us")).click();

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		boolean b = wait.until(ExpectedConditions.urlContains("aboutamazon"));
		// System.out.println(b);
		// System.out.println(driver.getCurrentUrl());

		if (waitForUrl("aboutamazon", 10)) {
			System.out.println(driver.getCurrentUrl());
		}
	}

	public static boolean waitForUrl(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(urlValue));

	}

}
