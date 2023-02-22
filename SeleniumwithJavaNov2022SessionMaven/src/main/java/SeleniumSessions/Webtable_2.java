//Feb 22-2023-P2
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable_2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

//		String checkbox_xpath = "//*[text()='Selenium']//parent::td//parent::tr//input[@type='checkbox']";
//		driver.findElement(By.xpath(checkbox_xpath)).click();

		selectCheckbox("Selenium");
		selectCheckbox("QTP");
		selectCheckbox("Coded UI");

	}

	public static void selectCheckbox(String courseName) {
		String checkbox_xpath = "//*[text()='" + courseName + "']//parent::td//parent::tr//input[@type='checkbox']";
		driver.findElement(By.xpath(checkbox_xpath)).click();
	}

}
