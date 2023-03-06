//Jan 18-2023-P1
package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	 * This method returns a list of Web Elements
	 *
	 * @param locator
	 * @return
	 */
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
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
	 * This method used Actions class to write/type in a element
	 *
	 * @param locator
	 * @param value
	 */
	public void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}

	/**
	 * This method uses Actions class to click an element at a specified locator
	 *
	 * @param locator
	 */
	public void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}

	/**
	 * This method uses Actions class and Move to Element method to write/type in a
	 * element
	 *
	 * @param locator
	 * @param value
	 */
	public void doSendKeysWithMoveToElement(By locator, String value) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).sendKeys(value).build().perform();
	}

	/**
	 * This method uses Actions class and Move to Element method to click an element
	 * at a specified locator
	 *
	 * @param locator
	 */
	public void doClickWithMoveToElement(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).click().build().perform();
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
	 *
	 * @param locator
	 * @param linkText
	 */
	public void doClickFromList(By locator, String linkText) {
		List<WebElement> footerList = getElements(locator);
		for (int i = 0; i < footerList.size(); i++) {
			String text = footerList.get(i).getText();
			if (text.equals(linkText)) {
				footerList.get(i).click();
				break;
			}
		}

	}

	// **************************** Drop Down Utils *******************************
	/**
	 * This method selects an element from the drop down using visible text
	 *
	 * @param locator
	 * @param text
	 */
	public void doSelectDropDownByVisibleText(By locator, String text) {
		WebElement ele = getElement(locator);
		Select select = new Select(ele);
		select.selectByVisibleText(text);
	}

	/**
	 * This method selects an element from the drop down using index
	 *
	 * @param locator
	 * @param index
	 */
	public void doSelectDropDownByIndex(By locator, int index) {
		WebElement ele = getElement(locator);
		Select select = new Select(ele);
		select.selectByIndex(index);
	}

	/**
	 * This method selects an element from the drop down using value
	 *
	 * @param locator
	 * @param value
	 */
	public void doSelectDropDownByValue(By locator, String value) {
		WebElement ele = getElement(locator);
		Select select = new Select(ele);
		select.selectByValue(value);
	}

	/**
	 *
	 * @param locator
	 * @return This method returns all options belonging to this select tag
	 */

	public List<String> doGetDropDownOptions(By locator) {

		List<String> optionsvalueList = new ArrayList<String>();

		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			optionsvalueList.add(e.getText());
		}

		return optionsvalueList;
	}

	/**
	 *
	 * This method clicks on a value in a drop down without using select class.
	 *
	 * @param locator
	 * @param value
	 */
	public void selectDropDownValueWithoutSelectClass(By locator, String value) {

		List<WebElement> countryList = getElements(locator);

		for (WebElement e : countryList) {

			String text = e.getText();

			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}

	// **************************** Wait Utils *******************************

	public void waitForTitlePresent(String titleValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleIs(titleValue));
	}

	public void waitForTitlePresent(String titleValue, int timeOut, int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut, intervalTime);
		wait.until(ExpectedConditions.titleIs(titleValue));
	}

	public Alert WaitForAlertToBePresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public boolean waitForUrl(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(urlValue));

	}

	public WebElement waitForElementToBeLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

}
