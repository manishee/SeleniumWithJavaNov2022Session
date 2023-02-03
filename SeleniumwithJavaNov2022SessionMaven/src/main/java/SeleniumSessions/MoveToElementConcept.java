//Feb 3-2023-P3
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");

		Thread.sleep(3000);

		Actions action = new Actions(driver);// -> driver is passed in the constructor
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();

		Thread.sleep(3000);
		driver.findElement(By.linkText("COURSES")).click();

	}

}
