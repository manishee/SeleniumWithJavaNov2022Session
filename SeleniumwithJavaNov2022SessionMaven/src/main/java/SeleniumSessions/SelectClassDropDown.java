//Jan 28-2023-p1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDropDown {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		By country = By.id("Form_getForm_Country");

//		drop down -> HTML TAG Select
//		We have to use Select class in Selenium.
//		WebElement country_ele = driver.findElement(By.id("Form_getForm_Country"));
//		Select select = new Select(country_ele);
//		select.selectByVisibleText("Zaire");
//		select.selectByIndex(15);
//		select.selectByValue("Australia");

		doSelectDropDownByVisibleText(country, "India");
		doSelectDropDownByIndex(country, 1);
		doSelectDropDownByValue(country, "Zaire");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByVisibleText(By locator, String text) {
		WebElement ele = getElement(locator);
		Select select = new Select(ele);
		select.selectByVisibleText(text);
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		WebElement ele = getElement(locator);
		Select select = new Select(ele);
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByValue(By locator, String value) {
		WebElement ele = getElement(locator);
		Select select = new Select(ele);
		select.selectByValue(value);
	}

}
