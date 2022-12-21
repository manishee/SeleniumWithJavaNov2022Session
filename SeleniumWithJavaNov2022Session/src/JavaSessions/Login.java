//Dec20-2022-P3
package JavaSessions;

public class Login {

	public static void main(String[] args)
	{
		Login l=new Login();
		l.addToCart();
		l.login();
		test();
		Login.test();
	}

	public void login() 
	{
		search();
	}
	public void search() 
	{
		addToCart();
	}
	public void addToCart() 
	{
		payment();
		getOrder();
		profile();
	}
	public void payment() 
	{
		addToCart();
	}
	public void getOrder() 
	{
		search();
		test();
		
	}
	public void profile() 
	{
		payment();
		getOrder();
		profile();
	}
	public static void test()
	{
		//search();
	}
	public static void price()
	{
		price();
	}
}

