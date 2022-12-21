//Dec 12 - 2022 - P1
package JavaSessions;

/**
 * 
 * @author mchugh
 *This program is about classes and objects.
 */

public class Car {
	
	//class variable or global variables
	String name;
	String color;
	int price;
	String model;
	
	
	public static void main(String[] args) {
		int i=10;//local variable
		//create an object : using new keyword
		
		Car c1=new Car();
		c1.name="BMW";
		c1.color="Blue";
		c1.price=80;
		c1.model="520d";
		
		Car c2=new Car();
		c2.name="Audi";
		c2.color="White";
		c2.price=60;
		c2.model="Q5";
		
		
		System.out.println(c1.name +" "+c1.color +" "+c1.price +" "+c1.model);
		System.out.println(c2.name +" "+c2.color +" "+c2.price +" "+c2.model);
		
//		No reference Objects
//		new Car().name="Honda";
//		new Car().color="Black";
//		new Car().model="Civic";
//		new Car().price=78;
//		
//		System.gc();
		
//		Null reference Object:	
		Car c3=new Car();
		c3=null;
		
		
		
		
		
		
	}

}
