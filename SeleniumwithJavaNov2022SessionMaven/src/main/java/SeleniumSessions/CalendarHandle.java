//Mar 21-2023-P1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ixigo.com/");

		driver.findElement(By.xpath("//input[@placeholder='Depart' and @type='text']")).click();
		Thread.sleep(2000);

		// start date
		List<WebElement> startDateList = driver
				.findElements(By.xpath("(//div[@class='rd-month'])[1]/table//div[contains(@class, 'day')]"));

		for (WebElement e : startDateList) {
			if (e.getText().equals("28")) {
				e.click();
				break;
			}
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Return' and @type='text']")).click();

		Thread.sleep(2000);

		String monthValue = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();

		while (!monthValue.contains("November 2023")) {
			driver.findElement(By.xpath("(//button[@class='ixi-icon-arrow rd-next'])[2]")).click();
			monthValue = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();
		}

		// end date
		List<WebElement> endDateList = driver
				.findElements(By.xpath("(//div[@class='rd-month'])[4]/table//div[contains(@class, 'day')]"));

		for (WebElement e : endDateList) {
			if (e.getText().equals("10")) {
				e.click();
				break;
			}
		}

	}

}
