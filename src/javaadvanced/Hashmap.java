package javaadvanced;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> MapA = new HashMap<String,Integer>();

		MapA.put("element 0",5);
		MapA.put("element 1",6);
		MapA.put("element 2",7);
		MapA.put("element 3",9);
		MapA.put("element 1",8);		

		Set<String> allkeys = MapA.keySet();
		for(String ele : allkeys)
		{
			System.out.println("the value of key '" + ele + "' is : " + MapA.get(ele));
		}

	}

}
