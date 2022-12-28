//Dec 26-2022-P1
package OOP_Inheritance;

public class Car extends Vehicle{
	//final class classname => this class can't be inherited
	//final methodname()-> this method can't be overridden
	//final int i=7; -> the value of int i cant be changed

	public String price() {
		System.out.println("Car--price");
		return "Car price is 10L";
	}
	public void start() {
		System.out.println("Car---starts");
	}
	
	public void stop() {
		System.out.println("Car--stops");
	}
	
	public void refuel() {
		System.out.println("Car--refuels");
	}
	
	public static void wheels() {
		System.out.println("Car--wheels");
	}
}
