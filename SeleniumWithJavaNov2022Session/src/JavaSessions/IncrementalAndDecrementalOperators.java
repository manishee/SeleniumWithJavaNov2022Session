//Dec 01 -2022
package JavaSessions;
/**
 * 
 * @author mchugh
 *This program is about Incremental And Decremental Operator
 */

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {

		//1. pre increment 
		int a=7;//a++; a+=2; a=a+1
		int b=++a;//increment and then assign
		
		//2. post increment
		int a1=9;
		int b1=a1++;//assign and then increment
		
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a1);
		System.out.println(b1);
		
		//3. post decrement
		int c=99;
		int d=c--;//assign and then decrement
		//c=98 ,d=99
		System.out.println(c);//98
		System.out.println(d);//99
		
		//4. pre decrement
		int m=13;
		int n=--m;//decrement and then assign
		//m=12 ,n=12
		System.out.println(m);
		System.out.println(n);
		
		int v=2;
		System.out.println(++v);
		System.out.println(v);
		
	}

}
