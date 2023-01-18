//Jan 18-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	/**
	 * 
	 * @param value
	 * @return this methods returns a By locator
	 */
	public By getLocator(String value) {
		return By.id(value);
	}
	/**
	 * 
	 * @param locator
	 * @return an element
	 */
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	/**
	 * This method types in the locator mentioned here
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	/**
	 * This method clicks an element at a specified locator
	 * @param locator
	 */
	public void doClick(By locator) {
		getElement(locator).click();
	}

}
