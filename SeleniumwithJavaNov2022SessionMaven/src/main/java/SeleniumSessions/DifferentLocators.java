//Jan 19-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();// set system property
		WebDriver driver=new ChromeDriver();// launch blank browser
		//driver.get("https://www.orangehrm.com/contact-sales/");// launch a particular URL
		driver.get("https://app.hubspot.com/login");
		//driver.get("https://www.freshworks.com/");
		Thread.sleep(3000);
		
		//1. id: unique
		//driver.findElement(By.id("Form_getForm_FullName")).sendKeys("manish@gmail.com");
		
		//2. name : not unique
		//driver.findElement(By.name("FullName")).sendKeys("manish@gmail.com");
		
		//3. classname : not unique
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		driver.findElement(By.className("login-email")).sendKeys("manish@gmail.com");
		
		//4. xpath : is not an attribute. its a locator(address of an element in DOM)
		//driver.findElement(By.xpath("//*[@id=\"Form_getForm_FullName\"]")).sendKeys("manish@gmail.com");
		
		//5. CSS Selector: is not an attribute, its a locator
		//driver.findElement(By.cssSelector("#Form_getForm_FullName")).sendKeys("manish@gmail.com");
		
		//6. linkText: is only for links: having <a> html tag.
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. partialLinkText: only for links: for long link text
		//driver.findElement(By.partialLinkText("Sign")).click(); 
		//Sign Up
		//Sign In
		
		//8. tagName
//		String h1_text=driver.findElement(By.tagName("h1")).getText();
//		System.out.println(h1_text);
		
	}

}
