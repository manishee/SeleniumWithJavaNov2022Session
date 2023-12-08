package com.qa.tutorialsninja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	// 1. By Locators - OR (Object Repository)

	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginButton = By.xpath("//input[@value='Login' and @type='submit']");
	private By forgotPwdLink = By.linkText("Forgotten Password");

	// 2. Constructor of the page class

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Page actions: features(Behaviour) of the page in form of methods

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public HomePage doLogin(String un, String pwd) {
		System.out.println("Login with : " + un + " and " + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();

		return new HomePage(driver);

	}

}
