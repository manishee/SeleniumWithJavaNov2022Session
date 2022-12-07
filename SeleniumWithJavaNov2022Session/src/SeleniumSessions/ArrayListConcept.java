//Dec 7 - 2022
package SeleniumSessions;

import java.util.ArrayList;

/**
 * 
 * @author mchugh
 *This program is about ArrayList
 */
public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList is default class in java
		//dynamic array
		//order based/index based array/list/collection
		//li=0
		//hi=size-1
		
		ArrayList ar=new ArrayList();
		//System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		
		//System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		
		ar.add(300);//2
		ar.add(400);//3
		System.out.println(ar.get(3));
		//System.out.println(ar.size());
		ar.add(500);//4
		ar.add(600);//5
		
		System.out.println(ar.get(5));
		//System.out.println(ar.get(7));//IndexOutOfBoundsException
		
		ar.add(700);//6
		ar.remove(6);
		//System.out.println(ar.get(6));//IndexOutOfBoundsException
		//System.out.println(ar.size());
		
		ar.add(800);//7
		System.out.println(ar.get(6));
		//System.out.println(ar.get(7));
		ar.add(900);//8
		ar.add(1000);//9
		//System.out.println(ar.size());
		
		
		ar.add(1100);
		//System.out.println(ar.size());
		ar.add(12.33);
		ar.add(true);
		ar.add('f');
		ar.add("Tom");
		
		//to print all the values from arrayList : for loop
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}
}
