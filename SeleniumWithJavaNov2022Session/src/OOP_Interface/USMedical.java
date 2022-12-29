//Dec 27-2022-P5 
package OOP_Interface;

public interface USMedical extends WHO{

	int admission_fee=50;
	//interface variables are static and final by default
	
	//No method body
	//only method declaration
	//cant create object of an interface or cant instantiate
	public void orthoServices();//abstract methods
	public void physioServices();
	public void emergencyServices();
	
	//After JDK1.8
	
	//1. we can have static methods with method body
	
	public static void minFee() {
		System.out.println("min fee is 10 USD");
	}
	
	//2. we can have default method with body
	default void bloodBank() {
		System.out.println("US Medical--blood bank");
	}
	
}
