//p3-May 15, 2023
package com.my.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffTest extends BaseTest {

	public static String TITLE = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";

	@Test
	public void rediffTitleTest() {
		driver.get("https://www.rediff.com/");
		String title = driver.getTitle();
		System.out.println("the title is" + title);
		Assert.assertEquals(title, RediffTest.TITLE);

	}

	@Test
	public void rediffURLTest() {
		driver.get("https://www.rediff.com/");
		String url = driver.getCurrentUrl();
		System.out.println("the url is " + url);
		Assert.assertTrue(url.contains("rediff"));

	}

}
