package practice1;

import java.util.Scanner;

public class Sumofalldigitfromnumber {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
     
       int sum = 0;

        while (num != 0) {
            sum = sum+ num % 10; // Extract last digit and add to sum
            num = num/10; // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);
    }

}
