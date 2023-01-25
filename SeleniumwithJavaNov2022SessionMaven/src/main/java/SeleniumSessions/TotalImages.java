//Jan 24-2023-P1
package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {

		// images -> img
		// get values of the src attribute of all the images

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");

//		List<WebElement> images_list = driver.findElements(By.tagName("img"));
//		System.out.println("Total images are " + images_list.size());
//
//		for (WebElement e : images_list) {
//			String src = e.getAttribute("src");
//			System.out.println(src);
//		}

		System.out.println("total images are " + getElementsCount("img"));
		System.out.println("total links are " + getElementsCount("a"));

		List<String> srcList = getAttributesList("img", "src");
		for (String s : srcList) {
			System.out.println(s);
		}

		System.out.println("----------");

		List<String> hrefList = getAttributesList("a", "href");
		for (String h : hrefList) {
			System.out.println(h);
		}
	}

	public static int getElementsCount(String tagName) {
		return driver.findElements(By.tagName(tagName)).size();
	}

	public static List<String> getAttributesList(String tagName, String attributeName) {
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

}
