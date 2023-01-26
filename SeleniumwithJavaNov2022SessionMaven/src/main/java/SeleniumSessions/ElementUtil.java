//Jan 18-2023-P1
package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
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
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * This method types in the locator mentioned here
	 *
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	/**
	 * This method clicks an element at a specified locator
	 *
	 * @param locator
	 */
	public void doClick(By locator) {
		getElement(locator).click();
	}

	/**
	 *
	 * @param locator
	 * @return this returns the text of an element
	 */
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	/**
	 * @param locator
	 * @return returns true/false if an element is present or not
	 */
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	/**
	 *
	 * @param tagName
	 * @return - this returns the size of an element identified with a particular
	 *         tag.
	 */
	public int getElementsCount(String tagName) {
		return driver.findElements(By.tagName(tagName)).size();
	}

	/**
	 *
	 * @param tagName
	 * @param attributeName
	 * @return this method returns the list of a particular attribute based on the
	 *         tagName
	 */
	public List<String> getAttributesList(String tagName, String attributeName) {
		// List is super interface of ArrayList class.
		// top casting
		List<String> attrList = new ArrayList<String>();

		List<WebElement> elementList = driver.findElements(By.tagName(tagName));
		for (WebElement e : elementList) {
			String text = e.getAttribute(attributeName);// 170
			attrList.add(text);
		}
		return attrList;

	}

	/**
	 * This method is to click any element from a list.
	 * @param locator
	 * @param linkText
	 */
	public void doClickFromList(By locator, String linkText) {
		List<WebElement> footerList = driver.findElements(locator);
		for (int i = 0; i < footerList.size(); i++) {
			String text = footerList.get(i).getText();
			if (text.equals(linkText)) {
				footerList.get(i).click();
				break;
			}
		}

}
