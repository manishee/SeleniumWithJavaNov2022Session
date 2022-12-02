//Dec 1-2020
package SeleniumSessions;

/**
 * 
 * @author mchugh
 *This program is about Conditional Operators
 */
public class ConditionalOperatorsIfElse {

	public static void main(String[] args) {

		
		  int a=10; 
		  int b=20; 
		  System.out.println(a>b);
		  
		  if(a>b) { System.out.println("a is greater than b"); 
		  } else {
		  System.out.println("b is greater than a"); }
		 
		
		/*
		 * if(false) {//Dead code System.out.println("Hello World"); }
		 * 
		 * else {//Dead code System.out.println("bye"); }
		 */
		
		  String s="Hello";
		  String s1=" hello";
		  
		  if(s.equalsIgnoreCase(s1)) {
			  System.out.println("both are equal");
		  }
		  else {
			  System.out.println("both are not equal");
		  }
		  
		  int total=101;
		  int fee=100;
		  
		  if(total==fee) {
			  System.out.println("total is fee");
		  }
		  else {
			  System.out.println("total is not fee");
		  }
		
		  //> < >= <= == !=
		  
		  int c=2000;
		  int d=200;
		  if(d>=c) {
			  System.out.println("PASS");
		  }
		  else
			  System.out.println("FAIL");
		  
		  
		  int balance=101;
		  if(balance!=100) {
			  System.out.println("balance is not correct");
		  }
		  
		  //WAP to find greatest of three numbers
		  int x=100;
		  int y=20;
		  int z=30;
		  
		  if(x>y && x>z) {
			  System.out.println("x is the greatest");
		  }else if (y>z){
			  System.out.println("y is the greatest");
		  }else {
			  System.out.println("z is the greatest");
		  }
	}

}
