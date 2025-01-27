//Nov 30 - 2022
package JavaSessions;

/**
 * 
 * @author mchugh
 *This is about string concatenation
 */

public class StringConcatenation {

	public static void main(String[] args) {
		
		double c=12.33;
		double d=23.33;
		
		int a=300;
		int b=200;
		
		String x="Hello";
		String y="World";
		
		System.out.println(a+b);
		System.out.println(c+d);
		
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);//HelloWorld100200
		System.out.println(x+y+(a+b));//HelloWorld300
		
		System.out.println(x+y+c+d+a+b);
		System.out.println(c+d+x+y+(a+b));
		System.out.println(c+d+(x+y)+a+b);
		
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		System.out.println("The sum of a and b is " +(a+b));
		
		//int i=4/2;
		//double i=4/2; //internally its 4.0/2.0
		//int i=4/2.0; -> error ..this operation will give me a double and i am striing to store in int, change to double and it works fine
		
		//System.out.println(i);
		System.out.println(4/2);
		System.out.println(5/2);//.5 will be lost, output will be integer
		System.out.println(5/2.0);//2.5 when we have a a double value, output will be double
		System.out.println(5.0/2);//2.5
		System.out.println(5.0/2.0);//2.5
		
		double k=9/2.0;
		System.out.println(k);
		
		//float f=(float)(9/2.0);
		float f=9/2.0f;
		System.out.println(f);
		
		//int p=9/0;
		//System.out.println(p);
		
		int m=0/9;
		System.out.println(m);
		
		int m1=0/0;
		System.out.println(m1);

	}

}
