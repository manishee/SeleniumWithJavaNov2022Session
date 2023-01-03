//Jan2-2023-P1
package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		String str="This is my first java code and I am so happy";
		System.out.println(str.length());//44
		System.out.println("Li=" +0 );
		System.out.println("Hi="+ (str.length()-1));//43
		
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(43));
		//System.out.println(str.charAt(44));StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("i"));//1st occurrence of i
		
		System.out.println(str.indexOf("i", str.indexOf("i")+1));
		
		System.out.println(str.indexOf("java"));//17
		System.out.println(str.indexOf("Anu"));//-1
		
		String messg="welcome here Anu";
		if(messg.indexOf("Anu")>0) {
			System.out.println("correct welcome msg");
		}
		else {
			System.out.println("Incorrect welcome message");
		}
		
		//trim
		String s="    hello World    ";
		System.out.println(s);
		System.out.println(s.trim());
		
		//replace
		System.out.println(s.trim().replace(" ", ""));
		
		String dob="01-01-1980";//01/01/1980
		System.out.println(dob.replace("-", "/"));
		
		//upper/lower cases:
		String s1="this is my java code";
		System.out.println(s1.toUpperCase().toLowerCase());
		
		String s2="HELLO WELCOME TO TESTING WORLD";
		System.out.println(s2.toLowerCase());
		
		//contains
		String s3="Your browser is chrome";
		System.out.println(s3.contains("chrome"));//true
		
		String browser="Chrome";
		if(browser.contains("chrome")){
			System.out.println("launch chrome browser");
		}
		
		//String Comparisons:
		//.equals
		
		System.out.println(browser.equals("chrome"));
		System.out.println(browser.equalsIgnoreCase("chrome"));
		
		System.out.println("-------");
		
		String f1="Hello World";
		String f2="Hello World ";
		System.out.println(f1.equals(f2));
		System.out.println(f1.equalsIgnoreCase(f2));
		System.out.println(f1.equalsIgnoreCase(f2.trim()));
		
		System.out.println(f1.concat(f2));
		System.out.println(f1+f2);
		
		//split
		String lang="Java;Python;JavaScript;Ruby";
		String lanugauge[]=lang.split(";");
		
		System.out.println("-------");
		System.out.println(lanugauge.length);
		System.out.println(lanugauge[0]);
		System.out.println(lanugauge[2]);
		
		System.out.println("-------");
		for(String ele : lanugauge) {
			System.out.println(ele);
		
		System.out.println("-------");
		String empData="Neha;Kashyap;25;London;UK;42342;IBM";	
		String emp[]=empData.split(";");
		System.out.println(emp.length);
		System.out.println(emp[0]);
		System.out.println(emp[3]);
		
		System.out.println("-------");
		for(String element : emp) {
			System.out.println(element);
		}
		System.out.println("-------");
		String test="xXtestingxXXSeleniumXxXCucumber";
		String tester[]=test.split("xX");
		
		System.out.println("0th---->" + tester[0]);
		System.out.println("1st---->" + tester[1]);
		System.out.println("2nd---->" + tester[2]);
		System.out.println("3rd---->" + tester[3]);
		}
		
		//Substring:
		String main="Your total amount is 3000";
		System.out.println(main.substring(5));
		System.out.println(main.substring(5, 11));//endIndex-1
		
		System.out.println(main.substring(main.indexOf("is"), main.length()));
		System.out.println(main.substring(main.indexOf("is")+3, main.length()));
		String amount=main.substring(main.indexOf("is")+3);
		
		System.out.println(amount+50+10);//30005010
		System.out.println(amount+(50+10));//300060
		
		//String to int: using ParseInt from Integer class
		int amountVal=Integer.parseInt(amount);
		System.out.println(amountVal+50+10);
		
		StringManipulation sm=new StringManipulation();;
		sm.stringT().stringY().stringZ();
		
		
	}
	
		public StringManipulation stringT() {
			System.out.println("inside stringT");
			return this;//returns the object of the current class
		}
		
		public StringManipulation stringY() {
			System.out.println("inside stringY");
			return this;
		}
	
		public void stringZ() {
			System.out.println("inside stringZ");
		}
	
	
}

