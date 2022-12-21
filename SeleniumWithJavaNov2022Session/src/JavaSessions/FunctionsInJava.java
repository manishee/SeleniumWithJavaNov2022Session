//Dec 13 - 2022 P1
package JavaSessions;
/**
 * 
 * @author mchugh
 *This program is about methods/functions 
 */
public class FunctionsInJava 
{
	
	//Functions are parallel to each other.
	//Functions can't be created inside a function.
	
	public static void main(String[] args) 
	{
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		obj.total();
		int s=obj.add();
		System.out.println(s+100+20);
		
		String name=obj.getTrainerName();
		System.out.println(name);
		
		int s1=obj.getSum(20, 35);
		System.out.println(s1);
		
		int s2=obj.getSum(37, 48);
		System.out.println(s2+10+5);//100
		
		String capName=obj.getCapitalName("China");
		System.out.println(capName);
		
		int marks=obj.getStudentMarks("Anu");
		System.out.println(marks);
		
		//boolean isbrowserlaunched=obj.launchBrowser("ie");
		//System.out.println(isbrowserlaunched);
		
		if(obj.launchBrowser("chrome")) {
			System.out.println("Start my test cases");
		}
		else {
			System.out.println("sorry there is no browser");
		}
	}
	
	//1. no input and no return
	//void -> no return(cannot return any value)
	public void test() 
	{
		System.out.println("Test Method");
	}
	
	public void total() 
	{
		System.out.println("Total Method");
		int a=10;
		int b=40;
		int c=a+b;
		System.out.println(c);
	}
	
	//2.no input and some return
	
	public int add() 
	{
		System.out.println("Add Method");
		int x=100;
		int y=500;
		int z=x+y;
		
		return z;
	}
	
	public String getTrainerName() 
	{
		System.out.println("Get Trainer Name");
		String name="Manish";
		
		return name;
	}
	
	//3. some input and some return
	// cant have mulitple return statements inside a function.
	public int getSum(int a, int b) 
	{
		System.out.println("Get Sum Method");
		int sum=a+b;
		//int x=38;
		return sum;
		//return x;
	}
	
	//WAP where a country name is passed and it returns the capital
	
	public String getCapitalName(String countryName) {
		System.out.println("Getting Capital for " + countryName);
		
		if(countryName.equals("India")) 
		{
			return "New Delhi";
		}
		
		else if(countryName.equals("USA")) 
		{
			return "Washington DC";
		}
		
		else if(countryName.equals("UK")) 
		{
			return "London";
		}
		else 
		{
			System.out.println("The country is not found for " + countryName);
			return null;
		}
	}
	
	//WAP where a student name(String) is passed and it returns the marks(int)
	
	public int getStudentMarks(String name) {
		int marks=0;
		System.out.println("Getting marks for student " + name);
		
		if(name.equals("Mohan")) 
		{
			marks=90;
		}
		else if(name.equals("Kanika")) 
		{
			marks=80;
		}
		else if(name.equals("Sheetal")) 
		{
			marks=85;
		}
		else 
		{
			System.out.println("The student not found " + name);
			return -1;
		}
		return marks;
	}
	
	//WAP where a browserName(String) and it launches the browser and returns boolean.
	
	public boolean launchBrowser(String browserName) {
		
		System.out.println("launching browser " + browserName);
		boolean flag=false;
		
		switch (browserName) {
		
		case "chrome":
			System.out.println("launching chrome");
			flag=true;
			break;
		case "firefox":
			System.out.println("launching firefox");
			flag=true;
			break;
		case "safari":
			System.out.println("launching safari");
			flag=true;
			break;
		default:
			System.out.println("Browser is not found " + browserName);
			break;
		}
		return flag;
	}
}
