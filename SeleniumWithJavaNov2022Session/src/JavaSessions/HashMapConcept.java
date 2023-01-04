//Jan4-2023-P2
package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//collection - dynamic
		//stores the value : key-value pair
		
		//Top Casting
		Map<String, String> EmpMap=new HashMap<String, String>();
		EmpMap.put("name", "Tom");
		EmpMap.put("ID", "101");
		EmpMap.put("city", "Bangalore");
		EmpMap.put("country", "India");
		EmpMap.put(null, "1000");
		EmpMap.put(null, "2000");
		EmpMap.put("age", null);
		EmpMap.put("phone", null);
		EmpMap.put("country", "UK");
		
		
		System.out.println(EmpMap.get("name"));
		System.out.println(EmpMap.get("ID"));
		System.out.println(EmpMap.get("city"));
		System.out.println(EmpMap.get("salary"));//null
		System.out.println(EmpMap.get(null));
		System.out.println(EmpMap.get("age"));
		System.out.println(EmpMap.get("country"));
		
		
		System.out.println("---------");
		
		//for each to print the key
		for(String x : EmpMap.keySet()) {
			System.out.println("key =" + x);
		}
		
		System.out.println("---------");
		
		//for each to print the value
		
		for(String y : EmpMap.values()) {
			System.out.println("value =" +y);
		}
		System.out.println("---------");
		//entrySet ->print all key-values
		for(Map.Entry<String, String> entry : EmpMap.entrySet()) {
			System.out.println("Key =" +entry.getKey() +" value =" +entry.getValue());
		}
		
		System.out.println("---------");
		
		//Lambda:after JDK1.8 ->
		EmpMap.forEach((k,v) -> System.out.println("key =" + k + "value " + v));
	}

}
