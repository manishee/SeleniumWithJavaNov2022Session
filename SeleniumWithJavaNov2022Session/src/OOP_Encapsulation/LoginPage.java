//Dec 23-2022-p4
package OOP_Encapsulation;

public class LoginPage {

	private String username;//null
	private String password;
	
	public LoginPage(String username,String password) {
		this.username=username;
		this.password=password;
	}
	
	public String getUsername() {
		return username;
	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
	public String getPassword() {
		return password;
	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("Login to app with " + un + " " + pwd);
	}
	
}
