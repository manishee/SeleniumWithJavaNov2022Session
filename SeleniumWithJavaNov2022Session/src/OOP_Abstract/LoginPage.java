//Dec 29-2022-P2
package OOP_Abstract;

public class LoginPage extends Page{

	public LoginPage() {
		System.out.println("LoginPage const...");
	}
	@Override
	public void title() {
		System.out.println("LP-Title");
	}

	@Override
	public void url() {
		System.out.println("LP-url");
	}

	public void forgotPwd() {
		System.out.println("LP-forgot pwd");
	}
}
