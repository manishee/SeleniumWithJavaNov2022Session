//Mar 7-2023-p1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementsToBeVisibleConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		By footerLinks = By.cssSelector("ul.sc-ace17a57-0.sc-4ae80653-0.kTjuIu.eQNriT li a");

//		WebDriverWait  wait=new WebDriverWait(driver, 10);
//		List<WebElement> footerLinksList=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerLinks));

		List<WebElement> footerLinksList = visibilityOfAllElement(footerLinks, 10);

		System.out.println(footerLinksList.size());

		for (WebElement e : footerLinksList) {
			System.out.println(e.getText());
		}

		// footerLinksList.stream().forEach(ele -> System.out.println(ele.getText()));

	}

	public static List<WebElement> visibilityOfAllElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public static void getPageLinksText(By locator, int timeOut) {
		// visibilityOfAllElement(locator, timeOut).stream().forEach(ele ->
		// System.out.println(ele.getText()));
	}

}
