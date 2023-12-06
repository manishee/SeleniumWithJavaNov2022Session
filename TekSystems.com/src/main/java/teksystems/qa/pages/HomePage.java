package teksystems.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import teksystems.qa.base.BasePage;

public class HomePage extends BasePage {

	private WebDriver driver;

	// 1. By Locators
	private By searchIcon = By.xpath("//a[@href='#2b700b9e-8742-4265-bbd0-253523d59fd4']");
	private By locationsIcon = By.xpath("//a[@href='/en/locations']");
	private By tekSystemsLogo = By.xpath(
			"//img[@src='https://www.teksystems.com/cdn-cgi/image/quality=95,format=webp/https://www.teksystems.com/-/media/teksystems/images/logos/teksystems-logo.svg?iar=0&rev=7059329eede9499a9965f7b1d91cc97f&hash=E3F0CB1116292ECC3DF7DF3583B13FCA']");
	private By WhatWeDoLink = By.linkText("What We Do");
	private By letsGoLinkForWhoWeAre = By.cssSelector(".score-button.pull-right.btn-primary.btn-md");
	private By keepReadingLinkForArticle = By.cssSelector(
			"a[class='score-button btn-primary btn-md'][href='/en/insights/article/dei-equitable-retention']");
	private By contactUsLink = By.linkText("Contact Us");

	// 2. Constructor of the page class
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Page actions: features(Behaviour) of the page in form of methods

	public String getHomePageTitle() {
		return driver.getTitle();
	}

//	public String getHeaderValue() {
//		if (driver.findElement(header).isDisplayed()) {
//			return driver.findElement(header).getText();
//		}
//		return null;
//	}
//
	public boolean isLocationsIconExist() {
		if (driver.findElements(locationsIcon).size() > 0) {
			return true;
		}
		return false;
	}

	public boolean isSearchIconExist() {
		if (driver.findElements(searchIcon).size() > 0) {
			return true;
		}
		return false;
	}

	public boolean isTeksystemsLogoExist() {
		if (driver.findElements(tekSystemsLogo).size() > 0) {
			return true;
		}
		return false;
	}

	public boolean isWhatWeDoLinkExist() {
		if (driver.findElements(WhatWeDoLink).size() > 0) {
			return true;
		}
		return false;
	}

	public boolean isLetsGoLinkForWhoWeAreExist() {
		if (driver.findElements(letsGoLinkForWhoWeAre).size() > 0) {
			return true;
		}
		return false;
	}

	public boolean isKeepReadingLinkForArticleExist() {
		if (driver.findElements(keepReadingLinkForArticle).size() > 0) {
			return true;
		}
		return false;
	}

	public boolean isContactUsLinkExist() {
		if (driver.findElements(contactUsLink).size() > 0) {
			return true;
		}
		return false;
	}

}
