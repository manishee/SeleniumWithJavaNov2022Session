//Dec22-2022-P2
package ConstructorConcept;

import java.util.ArrayList;

public class ProductTest {
	
	public static void main(String[] args) 
	{
		Product p1=new Product("Iphone", 800);
		System.out.println(p1.name + " " +p1.price);
		
		ArrayList<String> appleSellerList=new ArrayList<String>();
		appleSellerList.add("Neon Enterprise Inc.");//0
		appleSellerList.add("Xeon Enterprise Inc.");//1
		appleSellerList.add("Hexa IT");//2
		
		Product p2=new Product("Apple Macbook", 2.3,"Grey",appleSellerList);
		System.out.println(p2.name + " " +p2.price+ " "+ p2.color+ " "+p2.sellerList);
		System.out.println(p2.sellerList.get(2));
		
		for(String ele : p2.sellerList) {
			System.out.println(ele);
		}
		
	}

}
