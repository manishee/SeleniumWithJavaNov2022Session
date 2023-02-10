//Feb 10-2023-P1
package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;
	static final String SELECT_ALL_OPTIONS = "all";

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		driver.findElement(By.id("justAnInputBox")).click();
		By choice_span = By.xpath("//span[@class='comboTreeItemTitle']");

		// Multiple selection
		selectChoiceFromDropDown(choice_span, "choice 6", "choice 6 2 3", "choice 2");

		// Single Selection
		// selectChoiceFromDropDown(choice_span, "choice 6");

		// All selection
		// selectChoiceFromDropDown(choice_span, SELECT_ALL_OPTIONS);

	}

	public static void selectChoiceFromDropDown(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);
		System.out.println(choiceList.size());

		if (!value[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}
				}
			}
			// select all the values:
		} else {
			try {

				for (WebElement e : choiceList) {
					e.click();
				}
			} catch (Exception e) {

			}
		}

	}
}
