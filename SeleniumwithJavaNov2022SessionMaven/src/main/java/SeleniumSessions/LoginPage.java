//Jan 18 -2023-P1
package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) {

		BrowserUtil br=new BrowserUtil();
		br.init_driver("firefox");
		
		br.launchURL("https://www.amazon.ca");
		String title=br.getPageTitle();
		System.out.println("Page title is " +title);
		
		if(title.equals("Google")) {
			System.out.println("Incorrect title");
		}else
			System.out.println("incorrect title");
		br.closeBrowser();
		
	}

}
