//Jan 10-2023-P1

package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WebDriverBasics {

	public static void main(String[] args) {
		
				//WebDriver Manager - to set the system property
				//Windows-->System.setProperty("webdriver.chrome.driver", "C:\\mchugh\\Downloads\\chromedriver.exe");
				//Mac-->System.setProperty("webdriver.chrome.driver", "/Users/mchugh/Downloads/chromedriver");
				
				//WebDriver is an interface
				
				//Top Casting
				
				WebDriver driver=new ChromeDriver();// launch the chrome browser		
				
				driver.get("https://google.com");// launch the URL
				
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
					System.out.println("Correct Title");
				}
				else {
					System.out.println("Incorrect Title");
				}
				
				//System.out.println(driver.getPageSource());
				
				driver.quit();//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
				//driver.close();//NoSuchSessionException: invalid session id
				
				driver=new ChromeDriver();
				driver.get("https://www.google.com");
				System.out.println("-----");
				String title1=driver.getTitle();
				System.out.println("title1");
		
	}

}
