package examples88;

import java.util.Scanner;

public class myPracticeFromGoogle {
	public static void main(String[] args) {
		//write a program to get a number from the user and print whether it is positive or negative
		//test data
		//input number: 35
		//expected output: 
		//number is positive
		
		System.out.println("test data");
		Scanner scanner = new Scanner(System.in);
		int numInput= scanner.nextInt();
		if (numInput>0) {
			System.out.println("number is positive");
		}else if(numInput<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is 0");
		}
		
		
		
		
	}
	

}
