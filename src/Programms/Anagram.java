package Programms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a 1word");
//		String str1 = sc.next();
//		System.out.println("Enter a 2word");
//		String str2 = sc.next();

		String str1 = "listen";
		String str2 = "silent";

		char[] chararr1 = str1.toCharArray();
		char[] chararr2 = str2.toCharArray();

		Arrays.sort(chararr1);
		Arrays.sort(chararr2);

		if (Arrays.equals(chararr1, chararr2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Its not a anagram");
		}
	}
}

//Anagram
