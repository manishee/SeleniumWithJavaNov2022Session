package com.qa.tutorialsninja.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.tuturialsninja.base.BasePage;

public class HomePage extends BasePage {

	private WebDriver driver;

	// 1. By Locators
	private By header = By.linkText("Qafox.com");
	// private By searchText=By.xpath("//input[@name='search' and @type='text']");
	private By accountSectionHeaders = By.cssSelector("div#content h2");
	private By searchText = By.cssSelector("div#search input[name='search']");
	private By searchButton = By.cssSelector("div#search button[type='button']");

	// 2. Constructor of the page class
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Page actions: features(Behaviour) of the page in form of methods

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public String getHeaderValue() {
		if (driver.findElement(header).isDisplayed()) {
			return driver.findElement(header).getText();
		}
		return null;
	}

	public int getAccountSectionHeaderListCount() {
		return driver.findElements(accountSectionHeaders).size();
	}

	public List<String> getAccountSectionHeaderList() {
		List<String> accountsList = new ArrayList<>();
		List<WebElement> accSectionList = driver.findElements(accountSectionHeaders);

		for (WebElement e : accSectionList) {
			accountsList.add(e.getText());
		}

		return accountsList;
	}

}
