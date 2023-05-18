//p1-May 15, 2023
package com.my.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestWithBeforeMethod extends BaseTest {

	public static String TITLE = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

	@Test
	public void amazonTitleTest() {
		driver.get("https://www.amazon.in");
		String title = driver.getTitle();
		System.out.println("the title is" + title);
		Assert.assertEquals(title, AmazonTest.TITLE);

	}

	@Test
	public void amazonURLTest() {
		driver.get("https://www.amazon.in");
		String url = driver.getCurrentUrl();
		System.out.println("the url is " + url);
		Assert.assertTrue(url.contains("amazon"));

	}

	@Test
	public void mobilesLinkPresentTest() {
		driver.get("https://www.amazon.in");
//		boolean b=driver.findElement(By.linkText("Mobiles")).isDisplayed();
//		Assert.assertTrue(b);
		Assert.assertTrue(driver.findElement(By.linkText("Mobiles")).isDisplayed());
	}

}
