package Programms;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str1 = "madam";
		
		StringBuilder str2 = new StringBuilder(str1);
		StringBuilder str3 = str2.reverse();
		String reverse = str3.toString();
		
		System.out.println(reverse);
		
		if (reverse.equals(str1))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Its not a palindrome");
		}
	}
}

//madam
//Palindrome
