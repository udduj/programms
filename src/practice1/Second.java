8package practice1;

import java.util.Scanner;

public class Second {
	
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter a number");
		 
		int number = scan.nextInt();
		
		if ( number % 2 == 0 ) {
			
			System.out.println("Even number");
		}
		
		else {
			System.out.println("Odd number");
		}
		
		
		
		
	}
	
	
	

}
