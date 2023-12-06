package teksystems.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import teksystems.qa.pages.HomePage;

public class BaseTest {

	public BasePage basePage;
	public HomePage homePage;
	public Properties prop;
	public WebDriver driver;

	@BeforeTest
	public void setUp() {

		basePage = new BasePage();
		prop = basePage.init_prop();
		String browser = prop.getProperty("browser");
		driver = basePage.init_driver(browser); // chrome or firefox
		homePage = new HomePage(driver);
		driver.get(prop.getProperty("url"));// home page url

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
