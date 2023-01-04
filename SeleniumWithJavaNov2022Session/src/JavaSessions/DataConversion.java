//Jan 4-2023-P1
package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {

		//String to int
		String x="100";
		System.out.println(x);//100
		System.out.println(x+20);//10020
		int i=Integer.parseInt(x);//convert to int
		System.out.println(i+20);//120
		
		//String to double
		String y="34.55";
		System.out.println(y+20);
		double d=Double.parseDouble(y);//convert to double
		System.out.println(d+20);//54.55
		
		String h="100A";
//		int p=Integer.parseInt(h);//NumberFormatException
//		System.out.println(p+20);//120
		
		//int to String
		int k=100;
		System.out.println(k+20);//120 
		String k1=String.valueOf(k);
		System.out.println(k1+20);//10020
		
		
	}

}
