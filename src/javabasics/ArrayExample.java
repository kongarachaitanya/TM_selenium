package javabasics;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
		/*
		int[] a = new int[2];
		a[0] = 10;
		a[1] = 20;
		
		System.out.println(a[1]);
	*/
		
		//=========================
		//int[] b = {10,20,30};
		
		//System.out.println(b[1]);
		
//*/
		
	
		
		String[] a = new String[5];
		
 		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values for array");
		
		for(int i = 0; i<a.length; i++)
		{
			a[i] = sc.nextLine();
		}		
		
		System.out.println("Displaying array values: ");
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	
		
	
		
	/*	String[] cities = {"hyd","chennai","Pune","Delhi"};
				
		for(String c : cities)
		{
			System.out.println(c);
		}
		*/
		
	}

}
