//Jan 18-2023-P3
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubSpotLogingTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.init_driver("chrome");
		br.launchURL("https://app.hubspot.com/login");
		Thread.sleep(3000);
		
		By email=By.id("username");
		By pwd=By.id("password");
		By loginButton=By.id("loginBtn");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(email, "manish@gmail.com");
		eleUtil.doSendKeys(pwd, "chugh123");
		eleUtil.doClick(loginButton);
		
		br.closeBrowser();
		
	}

}
