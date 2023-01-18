//Jan 16-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();//launch browser
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(3000);//3000 milliseconds = 3 seconds
		
		//create the webelement + action (click, sendkeys, get text)
		
		//1. id: unique locator
		//1st
//		driver.findElement(By.id("username")).sendKeys("manish@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("chugh123");
//		driver.findElement(By.id("loginBtn")).click();
		
		//2nd
//		WebElement email= driver.findElement(By.id("username"));
//		WebElement pwd= driver.findElement(By.id("password"));
//		WebElement loginButton=driver.findElement(By.id("loginBtn"));
//		
//		email.sendKeys("manish@gmail.com");
//		pwd.sendKeys("chugh123");
//		loginButton.click();
		
		//3rd: By locators
		By email=By.id("username");
		By pwd=By.id("password");
		By loginButton=By.id("loginBtn");
		
//		WebElement email_ele=driver.findElement(email);
//		WebElement pwd_ele=driver.findElement(pwd);
//		WebElement loginBtn_ele=driver.findElement(loginButton);
//		
//		email_ele.sendKeys("manish@gmail.com");
//		pwd_ele.sendKeys("chugh123");
//		loginBtn_ele.click();
	
		//4th:
//		getElement(email).sendKeys("manish@gmail.com");
//		getElement(pwd).sendKeys("chugh123");
//		getElement(loginButton).click();
		
		//5th:
		doSendKeys(email, "manish@gmail.com");
		doSendKeys(pwd, "chugh123");
		doClick(loginButton);
//		
		//6th:
//		String email_id="username";
//		String pwd_id="password";
//		String loginButton_id="loginBtn";
//		
//		doSendKeys(getLocator(email_id), "manish@gmail.com");
//		doSendKeys(getLocator(pwd_id), "chugh123");
//		doClick(getLocator(loginButton_id));
		
	}
	
	public static By getLocator(String value) {
		return By.id(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}
}
