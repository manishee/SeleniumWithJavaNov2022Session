//Dec 26-2022-P4
package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {

		BMW b=new BMW();
		b.refuel();//Inherited from Car
		b.stop();//Inherited from Car
		b.start();//Overridden methods
		b.autoParking();//Independent method of BMW
		BMW.wheels();
		
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.wheels();
	
		
		
		
	}

}
