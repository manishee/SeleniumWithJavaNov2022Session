//Dec 20 -2022 -P1
package JavaSessions;

public class A {
	
	public static void main(String[] args) 
	{
		System.out.println("inside A main method");
		B.main(args);//StackOverflowError
		
	}

}
