package javaadvanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling1 {
	

	public static void main(String[] args) {
		FileReader fr=null;		
	      try{
	         File file=new File("C:\\Users\\chaitanya\\Desktop\\accountant desktop support.xlsx");
	         fr = new FileReader(file);  
	         char [] a = new char[1400];
	         fr.read(a); // reads the content to the array
	         for(char c : a)
	         {
	        	 System.out.print(c); //prints the characters one by one
	         }
	         System.out.print("\n");
	         System.out.print(a[51]);
	      }	          
	      
	      catch(FileNotFoundException e){
	    	  System.out.print("File not found");
	       }	      

	      catch(IOException ex){
			 System.out.print("IO exception");			
			}
	      
	      catch(ArrayIndexOutOfBoundsException ex1){
	    	  System.out.print("Array out of bound");
			}
	}

}
