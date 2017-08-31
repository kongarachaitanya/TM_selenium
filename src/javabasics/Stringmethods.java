package javabasics;

public class Stringmethods {

	public static void main(String[] args) {
		
		String str="SwapnafsdfsadaA.kumar85@gmail.com";		
		int counter = 0;
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(c=='a' || c == 'A')
			{
				counter = counter + 1;
			}
		}
		
		System.out.println("count is: " + counter);
	}
}
