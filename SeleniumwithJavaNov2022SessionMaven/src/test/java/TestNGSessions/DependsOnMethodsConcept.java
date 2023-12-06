//p2-May 3, 2023
package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	@Test
	public void loginTest() {
		System.out.println("login Test");
		int i = 9 / 0;
		System.out.println("Bye");
	}

	@Test(dependsOnMethods = "loginTest")
	public void homePageSearchTest() {
		System.out.println("login Test");
	}

	@Test(dependsOnMethods = "loginTest")
	public void homePageUserInfoTest() {
		System.out.println("login Test");
	}
}
