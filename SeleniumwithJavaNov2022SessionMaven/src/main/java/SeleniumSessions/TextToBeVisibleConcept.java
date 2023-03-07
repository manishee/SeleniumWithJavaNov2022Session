//Mar 7-2023-p2
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextToBeVisibleConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		By startBtn = By.cssSelector("div#start button");
		By helloWorldText = By.xpath("//div[@id='finish']/h4");

		driver.findElement(startBtn).click();

		// System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(helloWorldText, "Hello World!"));

		System.out.println(driver.findElement(helloWorldText).getText());

	}

}
