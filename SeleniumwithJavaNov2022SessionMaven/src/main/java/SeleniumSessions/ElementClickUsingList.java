//Jan 25-2024-P1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementClickUsingList {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		Thread.sleep(3000);

		By footerLinks = By.xpath("//ul[@class='footer-nav']/li/a");
		doClickFromList(footerLinks, "GDPR");

//		List<WebElement> footerList = driver.findElements(By.xpath("//ul[@class='footer-nav']/li/a"));
//		for (int i = 0; i < footerList.size(); i++) {
//			String text = footerList.get(i).getText();
//			if (text.equals("Leadership")) {
//				footerList.get(i).click();
//				break;
//			}
//		}

	}

	public static void doClickFromList(By locator, String linkText) {
		List<WebElement> footerList = driver.findElements(locator);
		for (int i = 0; i < footerList.size(); i++) {
			String text = footerList.get(i).getText();
			if (text.equals(linkText)) {
				footerList.get(i).click();
				break;
			}
		}
	}

}
