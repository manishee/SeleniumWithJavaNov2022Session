//Dec 29-2022_p3
package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp=new LoginPage();
		
		lp.title();
		lp.url();
		lp.timeOut();
		Page.logo();
		lp.forgotPwd();
		System.out.println("--------");
		//Top Casting
		Page p=new LoginPage();//child class object referred by parent class ref. variables
		p.title();
		p.url();
		p.timeOut();
		//p.forgotPwd();ref type check will fail
		
		
	}

}
