//Jan 12 - 2033 - P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowser {

	public static void main(String[] args) {
		//Selenium api-4.7.2 -> no need for System.setProperty or WebDriverManager
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();//launch firefox
		driver.get("https://www.google.com");
		
		
		
	}

}
