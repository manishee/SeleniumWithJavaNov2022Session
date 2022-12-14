//Dec 21-2022-P1

package ConstructorConcept;

/**
 *  
 * @author mchugh
 * this program is about global variables initialization using constructors
 */

	public class Person {
		//class variables or global variables
		String name;
		int age;
		double salary;
		boolean isPermanent;
		char gender;
	
	public Person() 
	{
	System.out.println("Hello");
	}
	
	public Person(String name, int age) 
	{
		this.name=name;
		this.age=age;
	}
	
	
	public Person(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Person(String name, int age, double salary, boolean isPermanent, char gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPermanent = isPermanent;
		this.gender = gender;
	}

	public static void main(String[] args)
	{
		Person p1=new Person("Anu",22);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2=new Person("Supriya", 24, 45.55);
		System.out.println(p2.name +" "+p2.age+ " "+p2.salary);
		
//		System.out.println(p1.name);//default value - null
//		System.out.println(p1.age);//default value - 0
//		System.out.println(p1.salary);//default value - 0.0
//		System.out.println(p1.isPermanent);//default value - false
//		System.out.println(p1.gender);//default value - blank
		
		Person p3=new Person("Priya", 22, 34.44, true, 'f');
		System.out.println(p3.name +" "+p3.age+ " "+p3.salary+ " "+p3.isPermanent+" "+p3.gender);
		
		
	}

}
