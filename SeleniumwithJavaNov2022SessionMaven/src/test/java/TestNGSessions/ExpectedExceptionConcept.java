//p3-May 3, 2023
package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;

	@Test(expectedExceptions = { ArithmeticException.class, NullPointerException.class })
	public void loginTest() {
		System.out.println("Login Test");
		// int i = 9 / 0;

		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		obj.name = "Testing";

	}
}
