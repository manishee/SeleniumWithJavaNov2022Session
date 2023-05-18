//p2-May 15, 2023
package com.my.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	public static String TITLE = "Google";

	@Test
	public void googleTitleTest() {
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("the title is" + title);
		Assert.assertEquals(title, GoogleTest.TITLE);

	}

	@Test
	public void googleURLTest() {
		driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println("the url is " + url);
		Assert.assertTrue(url.contains("google"));

	}

}
