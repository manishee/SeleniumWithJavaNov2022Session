//Feb 1-2023-P1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValueWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");

		By country = By.xpath("//select[@id='Form_getForm_Country']/option");
		// By employee=By.xpath("");

		// Dropdown html tag is : Select
		// but do not use Select class from Selenium
		// and select the value from the drop down

//		List<WebElement> countryList = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
//		System.out.println(countryList.size());
//
//		for (WebElement e : countryList) {
//			// System.out.println(e.getText());
//			String text = e.getText();
//			if (text.equals("Argentina")) {
//				e.click();
//				break;
//			}
//		}
//
		selectDropDownValueWithoutSelectClass(country, "Zaire");
		// selectDropDownValueWithoutSelectClass(employee, "11-15");
	}

	public static void selectDropDownValueWithoutSelectClass(By locator, String value) {

		List<WebElement> countryList = driver.findElements(locator);
		System.out.println(countryList.size());

		for (WebElement e : countryList) {

			String text = e.getText();

			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}
}
