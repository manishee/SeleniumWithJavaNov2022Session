//Jan 5 -2023 -P1
package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {

		//associated with try-catch block
		//finally is a block -> it will be executed all the time doesn't matter
		//if an exception is coming or not.
		
		int p=10;
		try {
			System.out.println("this is before exception");
			System.out.println("DB Connection -- trying to establish");
			System.out.println("DB Connection -- DONE!");
			int z=p/0;
		}
		catch(ArithmeticException e) {
			System.out.println("some exception is coming");
		}
		finally {
			System.out.println("executing finally block");
			System.out.println("flush/Close the connection");
			
		}
	
		int m=getMarks("Ali");
		System.out.println(m);
		
	}
	public static int getMarks(String name) {
		try {
		if(name.equals("Neha")) {
			return 100;
		}
		else if(name.equals("Anu")) {
			return 90;
		}
		
		else if(name.equals("Ali")) {
			int i=9/0;
			return 95;
		}
		else {
			return -1;
		}
		}
		catch(Exception e) {
			return -2;
		}
		finally {
			System.out.println("Bye....");
			//return -3;
		}
		
	}
	
}
