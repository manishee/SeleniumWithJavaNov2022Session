//Jan3-2023-P2
package ThisKeyword;

public class Shopping {

	public static void main(String[] args) {

		EComm e1=new EComm();
		
		e1
		.login("anu@gmail.com", "anu1234")
		.search("Apple Macbook")
		.addToCart("Apple Macbook")
		.checkOut("Apple Macbook")
		.doPayment("1223 1233 1231 1233", 123)
		.generateOrder("Apple Macbook");
	
		System.out.println("--------");
		
		e1
		.search("Nike")
		.addToCart("Nike")
		.checkOut("Nike")
		.doPayment("1223 1233 1231 1233", 123)
		.generateOrder("Nike");
		
		
		System.out.println("--------");
		
		e1
		
		.addToCart("Nike")
		.doPayment("1223 1233 1231 1233", 123)
		.generateOrder("Nike");
		
	}

}
