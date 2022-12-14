//Dec 19 - 2022 - P1
package JavaSessions;
/**
 * 
 * @author mchugh
 * This program is about method overloading
 */
public class MethodOverloading 
{
	//Method Overloading : is part of Polymorphism
	
	//Within the same class, when you have different methods with -
	// 1.same name
	// 2.having different parameters
	// 3.the sequence of the parameters is different
	// 4.it is part of compile time polymorphism 
	
	
	public void test() 
	{
		System.out.println("test method ... ");
	}
	
	public void test(int i) 
	{
		System.out.println(i);
	}
	
	public void test(int i, int k) 
	{
		System.out.println(i+k);
	}
	
	public void test(String p, int k)
	{
		System.out.println(p+k);
	}
	
	public void test(int k, String p) 
	{
		System.out.println(k+p);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.test();
		obj.test(80);
		obj.test(10, 20);
		obj.test(100, "BMW");
	}
	
	

}
