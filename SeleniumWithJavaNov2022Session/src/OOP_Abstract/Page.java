//Dec 29-2022-p1
package OOP_Abstract;

/**
 * 
 * @author mchugh
 * This program is about Abstract Classes
 */
public abstract class Page {

	//Like Interfaces, we can't create an object of Abstract classes
	//may have some abstract methods
	//Can I create the constructor of Abstract class(Page class)-YES
	
	public Page() {
		System.out.println("Page Const.....");
	}
	public abstract void title();//abstract method
	public abstract void url();
	
	//can have non-abstract method
	public void timeOut() {
		System.out.println("Page -- Time Out");
	}
	
	public static void logo() {
		System.out.println("Page -- Logo");
	}
}
