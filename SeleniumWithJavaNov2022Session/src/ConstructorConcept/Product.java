//De 22-2022-p1
package ConstructorConcept;

import java.util.ArrayList;

public class Product {

	String name;
	double price;
	String color;
	ArrayList<String> sellerList;
	
	public Product(String name, int price) 
	{
		this.name=name;
		this.price=price;
	}
	
	public Product(String name, double price, String color)
	{
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public Product(String name, double price, String color, ArrayList<String> sellerList) 
	{
	
		this.name = name;
		this.price = price;
		this.color = color;
		this.sellerList = sellerList;
	}
}
