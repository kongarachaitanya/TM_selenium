package javabasics;

public class StringMethods2 {

	public static void main(String[] args) {
		
		/*
		String str = "  Testing Masters Technologies";	
		str =str.replace(" ", "");		
		System.out.println(str);				
	
		
		String str1 = "Testing Masters Technologies";
		String[] arr = str1.split(" ");
		System.out.println(arr.length);
		
		for(String s : arr)
		{
			System.out.println(s);
		}
		
		
		
		//System.out.println("Word count is : " + arr.length);
		
	
		String str1 = "Testing Masters Technologies";
		String str2 = "Masters";
		if (str1.contains(str2))
		{
			System.out.println("Masters exist");
		}
		else
		{
			System.out.println("Masters not exist");
		}
		
		
		
		String str1 = "Sunny";
		String str2 = "sunny";
	//	if (str1.contentEquals(str2))
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("both are Equal");
		}
		else
		{
			System.out.println("both are not Equal");
		}
		
		
		
		String appEnv = "UAT";
		appEnv = appEnv.toLowerCase();
		System.out.println(appEnv);
		
		appEnv = appEnv.toUpperCase();
		System.out.println(appEnv);
		*/	
		
		String str1 = " Testing Masters Technologies ";
		System.out.println(str1.length());
		str1 = str1.trim();
		System.out.println(str1.length());		
		
	}

}
