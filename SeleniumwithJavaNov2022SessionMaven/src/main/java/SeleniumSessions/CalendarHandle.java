//Mar 21-2023-P1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ixigo.com/");

		driver.findElement(By.xpath("//input[@placeholder='Depart' and @type='text']")).click();
		Thread.sleep(2000);
		// start date
		List<WebElement> startDateList = driver
				.findElements(By.xpath("(//div[@class='rd-month'])[1]/table//div[contains(@class, 'day')]"));

		for (WebElement e : startDateList) {
			if (e.getText().equals("24")) {
				e.click();
				break;
			}
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Return' and @type='text']")).click();

		Thread.sleep(2000);

		// end date
		List<WebElement> endDateList = driver
				.findElements(By.xpath("(//div[@class='rd-month'])[4]/table//div[contains(@class, 'day')]"));

		for (WebElement e : endDateList) {
			if (e.getText().equals("26")) {
				e.click();
				break;
			}
		}

	}

}
