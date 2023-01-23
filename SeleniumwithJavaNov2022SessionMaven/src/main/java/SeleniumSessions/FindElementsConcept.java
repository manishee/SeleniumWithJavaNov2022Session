//Jan 23-2023-P1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {

		// all links - a
		// multiple images -img
		// multiple text fields - input
		// multiple buttons - button

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");

		// get total number of links on the page
		// get the text of each link
		// ignore the blank text:

		// WebElement ele=driver.findElements(By.findElement("tagName"));

		List<WebElement> links_list = driver.findElements(By.tagName("a"));
		System.out.println("Total links are " + links_list.size());

		for (int i = 0; i < links_list.size(); i++) {
			String text = links_list.get(i).getText();

			if (!text.isEmpty()) {
				System.out.println(i + "--->" + text);
			}
		}

	}

}
