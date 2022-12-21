//Nov 29 - 2022
package JavaSessions;
/**
 * 
 * @author mchugh
 * This program is about data types in Java
 */
public class DataTypes {

	public static void main(String[] args) {
		
		//data types
		//Integer Family : byte, short, int, long
		//Floating Family : float, double
		//character : char
		//boolean : true or false
		//String:
		
		//1. byte
		//size : 1 byte = 8 bits
		//range : -128 to 127
		byte b=10;
		byte b1=20;
		byte b2=0;
		byte b3=-30;
		
		System.out.println(b);
		System.out.println(b3);
		System.out.println(b2);
		System.out.println(b+b1+b3);
		
		//2. short
		//size : 2 bytes = 16 bits
		//range : -32786 to 32767
		short s1=10;
		short s2=-1000;
		
		System.out.println(s1);
		System.out.println(s2);
		
		//3. int
		//size : 4 bytes = 32 bits
		//range : -2147483648 to 2147483647
		
		int i=10;
		int total = 20000;
		
		System.out.println(i);
		System.out.println(total);
		
		//4. long
		//size : 8 bytes = 64 bits
		//range = check it!
		long l=342342442;
		System.out.println(l);
		
		//5. float
		//size : 4 bytes = 32 bits
		//range : around 7 digits after .
		float f=12.33f;
		float f1=(float)23.44;
		float f3=100;//100.0
		
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f3);
		
		//6. double 
		//size : 8 bytes = 64 bits
		//range : around 15 digits after .
		
		double d=12.33;
		double d1=34.564564;
		
		System.out.println(d);
		System.out.println(d1);
		
		//7. char 
		//size : 2 bytes
		char c='a';
		char c1='1';
		char c2='$';
		System.out.println(c);
		System.out.println(c2+c1);//arithmetic operation on char (97+49=146)
		// ascii values
		//a-z --> 97-122
		//A-Z --> 65-90
		//0-9 --> 48-57
		
		//8. boolean
		//size : 1 bit
		boolean flag=true;
		boolean manish=false;
		
		System.out.println(flag);
		System.out.println(manish);
		
		//9. String -> Is not a data type, its a class in java.
		
		String st1="Hello World";
		System.out.println(st1);
		
		String st2="100";
		System.out.println(st2);
		
		System.out.println(st1+st2);
		System.out.println(1000);
		System.out.println("hello Selenium");
		System.out.println(10+20);
		System.out.println("testing" +100);
		System.out.println("hello" +" "+"world");
		
		System.out.print(80+"\n");
		System.out.println(60);
		
		//System.err.println("some error is coming");
		
		System.out.println(4/2);
		System.out.println(20%3);
		
		
	}

}
