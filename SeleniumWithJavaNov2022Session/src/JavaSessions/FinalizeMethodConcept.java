//Jan 5-2023-P4
package JavaSessions;

public class FinalizeMethodConcept {

	public static void main(String[] args) {

		FinalizeMethodConcept obj= new FinalizeMethodConcept();
		obj=null;
		
		System.gc();
		System.out.println("Done!!!!");
		
	}
	
	
	public void finalize() {
		System.out.println("this is my finalize method");
	}

}
