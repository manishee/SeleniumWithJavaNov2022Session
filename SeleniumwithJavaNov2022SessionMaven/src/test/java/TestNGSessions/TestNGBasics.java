//p1-May 1, 2023
package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//BS -- connect with DB
//BT -- create user in DB
//BC -- launch browser

//BM -- login to App
//check User Is Active Test
//AM -- user is logged out

//BM -- login to App
//check User profile Test
//AM -- user is logged out

//BM -- login to App
//Get user info test
//AM -- user is logged out

//AC -- close browser
//AT -- deleet user in DB
//AS -- disconnect from DB

public class TestNGBasics {

	// testNG - Test Next Generation
	// testNG is a unit testing framework
	// is used to design, maintain and run the test cases
	// In testNG, we have Annotations to write the test steps and test cases

	// Precondition -> test cases steps (actual vs expected) - post steps
	// launch chrome->enter the url(Google vs Google)->close the browser

	@BeforeSuite
	public void connectDB() {
		System.out.println("BS -- connect with DB");
	}

	@BeforeTest
	public void createUserInDB() {
		System.out.println("BT -- create user in DB");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch browser");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- login to App");
	}

	@Test
	public void getUserInfoTest() {
		System.out.println("Get user info test");
	}

	@Test
	public void checkUserIsActiveTest() {
		System.out.println("check User Is Active Test");
	}

	@Test
	public void checkUserProfileTest() {
		System.out.println("check User profile Test");
	}

	@AfterMethod
	public void logOut() {
		System.out.println("AM -- user is logged out");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close browser");
	}

	@AfterTest
	public void deleteUserInDB() {
		System.out.println("AT -- delete user in DB");
	}

	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS -- disconnect from DB");
	}

}
