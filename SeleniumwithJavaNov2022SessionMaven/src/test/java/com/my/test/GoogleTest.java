//p2-May 15, 2023
package com.my.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

	WebDriver driver;
	public static String TITLE = "Google";

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}

	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("the title is" + title);
		Assert.assertEquals(title, GoogleTest.TITLE);

	}

	@Test
	public void googleURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("the url is " + url);
		Assert.assertTrue(url.contains("google"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
