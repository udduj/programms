package practice1;

import java.util.Scanner;

public class Palindrome {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter string");
		
	String str = scan.nextLine();
	
	String reverse = new StringBuilder(str).reverse().toString();	
	if ( str.equals(reverse)) {
		
		System.out.println("  A Palindrome");
	}
	else 
		
		System.out.println(" Not a palindrome");
	}

}
