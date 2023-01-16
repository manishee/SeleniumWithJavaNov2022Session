//Jan 13-2023-P2
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();//launch the broswer
		
		driver.get(("https://www.orangehrm.com/contact-sales/"));// launch URL
		
		WebElement url_ele=driver.findElement(By.id("Form_getForm_FullName"));//v1-e1
		url_ele.sendKeys("manish");//send keys -> type in a text box/field
		
		driver.navigate().refresh();
		
		url_ele=driver.findElement(By.id("Form_getForm_FullName"));//v2-e1
		url_ele.sendKeys("manish");
		//StaleElementReferenceException: stale element reference: element is not attached to the page document
		
	
	
	}

}
