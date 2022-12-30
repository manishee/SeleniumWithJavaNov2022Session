//Dec 30-2022-P4
package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args)  {

		
		System.out.println("Hello Testing");
		//Thread.sleep(3000);
		try {
		throw new Exception("Some Exception is coming");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
