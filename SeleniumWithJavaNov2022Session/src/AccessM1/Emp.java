//Jan 5-2023-P1
package AccessM1;

public class Emp {

	public String name="Tom";
	private int age=25;
	protected double salary=34.35;
	char c='m';//default
	
	public static void main(String[] args) {
		Emp e=new Emp();
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);
		System.out.println(e.c);
		
	}

}
