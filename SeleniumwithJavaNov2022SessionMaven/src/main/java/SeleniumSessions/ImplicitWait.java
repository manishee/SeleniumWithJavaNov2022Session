//Feb 28-2023-P1
package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		// Thread.sleep(10000);//static wait

		// Implicitly wait -
		// it is only for web elements
		// it's a global wait - it will be applied to all the web elements by default
		// it is not applicable for non web elements - title, alert, url

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("Manish@gmail.com");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("Manish123");
		driver.findElement(By.id("loginBtn")).click();

		// e4
		// e5
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// e6
		// e7

	}

}
