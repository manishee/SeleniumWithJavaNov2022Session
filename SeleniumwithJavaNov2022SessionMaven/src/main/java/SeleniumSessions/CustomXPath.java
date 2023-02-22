//Feb 17-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// xpath: is not an attribute, its a locator
		// address of an element in the DOM

		// 1. Absolute Xpath: html/body/div/div[2]/div[3]/form/div/div[2]/input
		// 2. Relative Xpath:

		// Formula = //tag[@attr='value']
		// input[@id='username']

		// Formula = //tag[@attr='value' and @attr2='value']
		// input[@id='username' and @type='email']

		// button - 3
		// button[@id] - 2
		// button[@id='loginBtn'] -1
		// button[@id='loginBtn' and @type='submit']

		// input[@class='form-control private-form__control login-email']
		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"));
		// driver.findElement(By.className("form-control private-form__control
		// login-email"));// Wont work

		// a[@href='https://legal.hubspot.com/privacy-policy']
		// a[@target='_blank']

		// text():
		// Formula = //tag[text()='textvalue']
		// a[text()='Freshdesk']
		// h2[text(='Trusted by 50,000+ businesses']

		// contains():
		// Formula= //tag[contains(@attr, 'value')]
		// input[contains(@id, 'username')]
		// input[contains(@id, 'name')]
		// input[contains(@id, 'user')]

		// dynamic ID: //input[@id=test_123]
//		<input id = test_123>
//		<input id = test_456>
//		<input id = test_789>

		// input[contains(@id, 'test')]
		// input[contains(@id, 'test_')]

		// contains() with text();
		// tag[contains(text(), 'textvalue')]

		// h2[contains(text(), 'Trusted by 50,000+ businesses')]
		// h2[contains(text(), 'Trusted by 50,000+')]
		// h2[contains(text(), 'by 50,000+')]
		// a[contains(text(), 'Sign Up')]
		// a[contains(text(), 'Up')]
		// a[contains(text(), ' Up')]

		// input[contains(@type, 'text') and @name='username']
		// input[contains(@type, 'submit') and contains(@value, 'Login')]

		// * -- total nodes/elements in HTML DOM - 309 elements
		// input - 3 elements
		// *[@name='username']
		// input[@name='username']

		// parent to child:
		// div[@class='input-group']/input[@name='username']
		// div[@class='input-group']//input[@name='username']

		// div//div -->509 (direct + indirect child)
		// div/div -->458 direct child

		// child to parent:
		// backward tranversing in xpath
		// input[@name='username']/..
		// input[@name='username']/../../../../../../..

		// input[@name='username']//parent::div

	}

}
