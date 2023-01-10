//Jan9-2023-P1
package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		
		//WebDriver Manager - to set the system property
		//System.setProperty("webdriver.chrome.driver", "C:\\mchugh\\Downloads\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/Users/mchugh/Downloads/chromedriver");
		
		//WebDriver is an interface
		
		//Top Casting
		WebDriver driver=new ChromeDriver();// launch the chrome browser		
		
		driver.get("https://ndtv.com");// launch the URL
		
		String title=driver.getTitle(); //get page title
		System.out.println(title);
		
		//checkpoint/verification point
		
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		String currentURL=driver.getCurrentUrl();// to get the current URL
		System.out.println(currentURL);
		
		if(currentURL.contains("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in correct title");
		}
		
		//System.out.println(driver.getPageSource());
		
		//driver.quit();close the browser
		driver.close();
	}

}
