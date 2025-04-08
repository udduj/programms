package Programms;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		int num = 123456;
		int reverse = 0;
		 while (num!=0) {
			 int digit = num%10;
			 reverse = reverse *10 +digit;
			 num= num/10;
		 }
		 System.out.println(reverse);
		 
		 if (num==reverse) {
			 System.out.println("palindrome number");
		 }
		 else 
		 {
			 System.out.println("Not a palindrome");
		 }
	}
}

//654321
//Not a palindrome
