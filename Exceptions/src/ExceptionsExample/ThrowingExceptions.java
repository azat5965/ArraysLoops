package ExceptionsExample;

import java.util.Scanner;

public class ThrowingExceptions {
	public static void main (String []args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your name, \n Note your name length shouldn't be shorter than 5 characters");
		String name=scanner.next();
		int count=1;
		for(int i=0; i<3; i++) {
		     if (name.length()<5)  { 
			     System.out.println("Enter again");
			     count++;
			     name=scanner.next();
			     if(count==3) {
			    	 throw new RuntimeException("You have tried 3 time, sorry");
			     }
			     
			     
		     }else {
		     	System.out.println("Welcome "+name);
			
			
			
		    }
		}
	}
		
	

}
