//Feb 3-2023-p2
package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		String username = "admin";
		String password = "admin";
		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");

	}

}
