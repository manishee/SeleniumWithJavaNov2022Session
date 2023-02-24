//Feb 24-2023-P1
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSSeleector {

	public static void main(String args[]) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// id --> #{id vaue}
		// class --> .classname

		// #username
		// .c1.c2.c3...

		// .form-control.private-form__control.login-email
		// .form-control.private-form__control.login-password.m-bottom-3
		// .login-email
		// .login-email#username
		// #username.login-email
		// .form-control.private-form__control.login-email#username
		// #username.form-control.private-form__control.login-email
		// input#username
		// input.form-control.private-form__control.login-email
		// input.login-email
		// input.login-email#username

		// By.cssSelector(".form-control.private-form__control.login-email");
		// By.className("form-control private-form__control login-email");---> wrong
		// By.xPath("//input[@class='form-control private-form__control login-email']");

		// input[@id='username']->xpath

		// tag[attr='value']
		// input[id='username']

		// By.cssSelector("input[id='username']");
		// input[type='email']
		// input[id='username'][type='email']

		// parent to child
		// div.private-form__input-wrapper input[id='username']
		// div.private-form__input-wrapper>input[id='username']

		// .private-form__input-wrapper>input[id='username']
		// .private-form__input-wrapper>input#username
		// .private-form__input-wrapper>#username

		// id="test_1234"
		// id="test_2345"

		// input[id*=test_]
		// input[id*=test]

		// input[id*=test_]->contains
		// input[id^='user'] -> starts with
		// input[id$='name']-> ends with
		// input[id$='sername']

		// child to parent : not possible
		// child to ancestor : not possible
		// backward traversing is not possible

		// comma in css:
		// input#username, input#password, button#loginBtn
		int loginPageMandatoryItems = driver
				.findElements(By.cssSelector("input#username, input#password, button#loginBtn")).size();
		if (loginPageMandatoryItems == 3) {
			System.out.println("all mandatory elements are present");

			// nth-of-type
			// ul.footer-nav li:nth-of-type(3) --specific index
			// ul.footer-nav li:nth-of-type(n)

		}

	}

}
