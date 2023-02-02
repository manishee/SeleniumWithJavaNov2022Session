//Feb 2- 2023-P1
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {

		// HeadLess : No UI
		// testing is happening behind the scene
		// faster than normal UI mode

//		WebDriverManager.chromedriver().setup();// set system property
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(co);// launches blank browser

		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(fo);

		driver.get("https://www.google.com");// launch google
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
