//Dec 22-2022_p3
package OOP_Encapsulation;

/**
 * 
 * @author mchugh
 * This Program is about Encapsulation and data hiding.
 */

//class members : (non-static) class variables + class methods
public class Employee {

	private String name;
	private int id;
	private int age;
	private double salary;

	//getter and setter methods: (public methods)
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
