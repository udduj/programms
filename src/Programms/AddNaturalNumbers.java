package Programms;

import java.util.Scanner;

public class AddNaturalNumbers {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int a = sc.nextInt();
		
		int a = 5;
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}

// 1+2+3+4+5 
//15