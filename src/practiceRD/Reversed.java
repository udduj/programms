package practiceRD;

import java.util.Scanner;

public class Reversed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter String value: ");

		String originalString = scan.nextLine();

		// String[] strArr= originalString.split("");

		// char [] strArr = originalString.toCharArray();

		StringBuilder str = new StringBuilder(originalString);
		StringBuilder reversed = str.reverse();

		String rev = reversed.toString();
		System.out.println(rev);

//		for(int i=strArr.length-1; i>=0; i--)
//		{
//			System.out.print(strArr[i]);
//		}

	}

}
