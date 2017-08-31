package javaadvanced;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<String>();
		Class1 obj1 = new Class1();
		int a = obj1.add(17, 2);
		System.out.println(a);
		listA.add("element 0");
		listA.add("element 1");
		listA.add("element 0");


		//access via Iterator
		Iterator iterator = listA.iterator();
		while(iterator.hasNext())
		{
		  String element = (String) iterator.next();
		  System.out.println(element);
		}

	}

}
