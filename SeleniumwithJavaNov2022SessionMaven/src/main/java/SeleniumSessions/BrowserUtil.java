//Jan 17-2023-P1
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	WebDriver driver;

	/**
	 *
	 * @param browserName
	 * @return this returns driver
	 */
	public WebDriver init_driver(String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();// launch chrome browser
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("please pass the correct browser" + browserName);
		}
		return driver;
	}

	/**
	 *
	 * @param url This program is used to launch a URL
	 */
	public void launchURL(String url) {
		System.out.println("url = " + url);
		driver.get(url);
	}

	/**
	 *
	 * @param url This method is used to navigate to a URL
	 */
	public void navigateToURL(String url) {
		System.out.println("url = " + url);
		driver.navigate().to(url);
	}

	/**
	 * This method is used to get the title of a page
	 *
	 * @return this return page title
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 *
	 * This method is used to quit the browser
	 */
	public void quitBrowser() {
		driver.quit();
	}

	/**
	 *
	 * This method is used to close the browser
	 */
	public void closeBrowser() {
		driver.close();
	}
}
