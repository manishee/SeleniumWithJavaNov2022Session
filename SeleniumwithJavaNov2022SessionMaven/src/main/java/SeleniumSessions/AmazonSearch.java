//Feb 9-2023-P1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.ca/");
		driver.findElement(By.name("field-keywords")).sendKeys("bottle");
		Thread.sleep(3000);
		List<WebElement> optionsList = driver.findElements(By.xpath(
				"//div[@class='left-pane-results-container']/div/div/div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		// optionsList.get(4).click();
		System.out.println(optionsList.size());
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("bottle drying rack"))
				e.click();
			break;
		}

	}

}
