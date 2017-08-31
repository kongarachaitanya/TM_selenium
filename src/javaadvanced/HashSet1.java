package javaadvanced;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> SetA = new HashSet<String>();

		SetA.add("element 0");
		SetA.add("element 1");
		SetA.add("element 0");

		//access via Iterator
		Iterator iterator = SetA.iterator();
		while(iterator.hasNext())
		{
		  String element = (String) iterator.next();
		  System.out.println(element);
		}

	}

}
