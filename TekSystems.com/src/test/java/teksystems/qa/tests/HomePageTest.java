package teksystems.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import teksystems.qa.base.BaseTest;
import teksystems.qa.utils.Constants;

public class HomePageTest extends BaseTest {

	@Test
	public void homePageTitleTest() {
		String title = homePage.getHomePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE);
	}

	@Test
	public void locationIconDisplayedTest() {
		Assert.assertTrue(homePage.isLocationsIconExist());
	}

	@Test
	public void searchIconDisplayedTest() {
		Assert.assertTrue(homePage.isSearchIconExist());
	}

	@Test
	public void TeksystemsLogoDisplayedTest() {
		Assert.assertTrue(homePage.isTeksystemsLogoExist());
	}

	@Test
	public void WhatWeDoLinkDisplayedTest() {
		Assert.assertTrue(homePage.isWhatWeDoLinkExist());
	}

	@Test
	public void letsGoLinkForWhoWeAreTest() {
		Assert.assertTrue(homePage.isLetsGoLinkForWhoWeAreExist());
	}

	@Test
	public void keepReadingLinkForArticleExistTest() {
		Assert.assertTrue(homePage.isKeepReadingLinkForArticleExist());
	}

	@Test
	public void contactUsLinkTest() {
		Assert.assertTrue(homePage.isContactUsLinkExist());
	}
}
