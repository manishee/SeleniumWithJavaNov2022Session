//Jan 12-2023-P2
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mchugh/Downloads/chromedriver");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();//launch the browser
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.quit();
		
		
	}

}
