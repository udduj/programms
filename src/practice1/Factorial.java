package practice1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)

	{

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter Number");

		int number = scan.nextInt();

		int factorial = 1;

		for (int i = 1; i <= number; i++) {

			factorial = factorial * i;
		}

		System.out.println(" Factorial of " + number + " is " + factorial);

	}

}
