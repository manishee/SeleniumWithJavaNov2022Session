//Dec 30-2022-P2
package ExceptionHandling;

public class TryCatchPart2 {
	String name="Tom";
	public static void main(String[] args) {

		System.out.println("Hello Testing");
		
		TryCatchPart2 obj=new TryCatchPart2();
		
		System.out.println(obj.name);
		obj=null;
		
		try {
		int i=9/3;	
		System.out.println(obj.name);
		}
//		catch(Exception e) {
//			
//		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("AME is coming");
			System.out.println(e.getMessage());
		}
		System.out.println("Bye");
	}

}
