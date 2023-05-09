//p1-May 8, 2023
package TestNGSessions;

import org.testng.annotations.Test;

public class InnvocationCount {

	@Test(invocationCount = 10)
	public void createUserTest() {
		System.out.println("create user test");
	}

}
