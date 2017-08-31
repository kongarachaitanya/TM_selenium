package javaadvanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) throws FileNotFoundException, IOException,ArrayIndexOutOfBoundsException {
		FileReader fr = null;
	    File file=new File("C:\\Users\\chaitanya\\Desktop\\UFT CODE.txt");
	     fr = new FileReader(file);  
	     char [] a = new char[50];
	     fr.read(a); // reads the content to the array
	     for(char c : a)
	      {
	        System.out.print(c); //prints the characters one by one
	      }
	       System.out.print("\n");
	       System.out.print(a[51]); 
	    }
}
