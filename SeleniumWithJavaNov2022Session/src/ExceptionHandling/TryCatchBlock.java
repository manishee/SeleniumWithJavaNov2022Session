//Dec 30-2022-P1
package ExceptionHandling;

/**
 * 
 * @author mchugh
 * This program is about exception handling
 */
public class TryCatchBlock {
	//Exception is a problem that arises at run time.
	//When an exception occurs the normal flow of the program terminates
	//To continue executing rest of the program, exception needs to be handled
	public static void main(String[] args) {

		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		int k=10/0;
		
		try 
		{
		System.out.println("Hello");	
		int i=9/3;
		System.out.println("testing");
		System.out.println("testing");
		System.out.println("testing");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Some exception is coming");
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			
		}
		System.out.println("Hi");
		System.out.println("Hi");

	}

}
