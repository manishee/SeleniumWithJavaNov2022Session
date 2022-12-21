//Dec 19-2022-P3
package JavaSessions;

public class MainMethodOverloading {

	public static void main(String []args)
	{
		System.out.println("Hello World");
		main(10);
		main(20,23);
		main(10,"Hello");
	}
	
	public static void main(int i) 
	{
		System.out.println(i);
	}
	
	public static void main(int i, int k) 
	{
		System.out.println(i+k);
	}
	public static void main(int i, String p) 
	{
		System.out.println(i+p);
	}

}
