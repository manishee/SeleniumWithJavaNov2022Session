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
		b.engine();
		
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.wheels();
		c.engine();
		
		//Top casting
		Car c1=new BMW();//child class object can be referred by parent class ref variable
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.autoparking(); ==> ref type check
		
		//Down casting
		//BMW b1=(BMW) new Car();
		
		Vehicle v1=new Vehicle();
		v1.engine();
		
		
		
		
			
		
		
		
	}

}
