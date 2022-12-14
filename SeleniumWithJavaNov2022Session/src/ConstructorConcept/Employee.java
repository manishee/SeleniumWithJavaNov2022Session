//Dec 20-2022-P4
package ConstructorConcept;

/**
 * 
 * @author mchugh
 * This program is about constructors
 */


public class Employee {
	
	//Global vars:
	String name;
	int age;
	int empId;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor of the class
	//looks like a function, but its not a function
	//constructor name is same as class name
	//a function may or may not return a value, but a const. will never return a value
	//no return and void keywords in constructors
	
	public Employee() {// default const or 0 parameter const.
		System.out.println("default emp const.");
		System.out.println("Hello Employee!");
	}
	
	public Employee(int i) 
	{
		System.out.println("1 parameter constructor " +i);
	}
	
	public Employee(int i, String p) 
	{
		System.out.println("2 parameter constructor " +i+p);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("hello");
		//const. will be called when we create the object of the class.
		Employee e1=new Employee();
		Employee e2=new Employee(10);
		Employee e3=new Employee(20,"Test");
		
		
		
	}

	
}
