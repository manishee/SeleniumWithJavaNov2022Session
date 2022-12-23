//Dec 23-2022-p5
package OOP_Encapsulation;

public class AmazonTest {

	public static void main(String[] args) {

		LoginPage lp=new LoginPage("cust@gmail.com","cust123");
		//lp.setUsername("cust@gmail.com");
		//lp.setPassword("cust123");
		
		lp.doLogin(lp.getUsername(),lp.getPassword());
		
//		lp.setUsername("seller@gmail.com");
//		lp.setPassword("seller123");
//		
//		lp.doLogin(lp.getUsername(), lp.getPassword());
//		
	}

}
