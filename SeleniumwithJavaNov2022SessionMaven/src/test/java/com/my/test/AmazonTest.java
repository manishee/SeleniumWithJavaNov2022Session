//p2-May 8, 2023
package com.my.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	WebDriver driver;
	public static String TITLE = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
	}

	@Test
	public void amazonTitleTest() {
		String title = driver.getTitle();
		System.out.println("the title is" + title);
		Assert.assertEquals(title, AmazonTest.TITLE);

	}

	@Test
	public void amazonURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("the url is " + url);
		Assert.assertTrue(url.contains("amazon"));

	}

	@Test
	public void mobilesLinkPresentTest() {
//		boolean b=driver.findElement(By.linkText("Mobiles")).isDisplayed();
//		Assert.assertTrue(b);
		Assert.assertTrue(driver.findElement(By.linkText("Mobiles")).isDisplayed());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
