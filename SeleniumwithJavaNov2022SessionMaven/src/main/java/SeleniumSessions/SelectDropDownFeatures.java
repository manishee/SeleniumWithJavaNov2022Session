//Jan 31-2023-P1
package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownFeatures {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");

		By country = By.id("Form_getForm_Country");
		By Employees = By.id("Form_getForm_NoOfEmployees");

		List<String> countryList = doGetDropDownOptions(country);
		System.out.println("Total values in country dropdown is " + countryList.size());
		System.out.println(countryList);

		List<String> empList = doGetDropDownOptions(Employees);
		System.out.println("Total values in Employee dropdown is " + empList.size());
		System.out.println(empList);

//		Select select_country = new Select(driver.findElement(country));
//		List<WebElement> countryOptionsList = select_country.getOptions();// All options belonging to this select tag
//		System.out.println(countryOptionsList.size());
//
//
//			for (int i = 0; i < countryOptionsList.size(); i++)
//			{
//			String text = countryOptionsList.get(i).getText();
//			System.out.println(text);
//
//	}
//
//		for(WebElement e : countryOptionsList) {
//			System.out.println(e.getText());
//		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> doGetDropDownOptions(By locator) {

		List<String> optionsvalueList = new ArrayList<String>();

		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			optionsvalueList.add(e.getText());
		}

		return optionsvalueList;
	}

}
