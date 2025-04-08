package practice1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {

		String a = "listen";
		String b = "silent";

		// For conversion use tochararray method
		// str1 = "listen" becomes str1Arr = ['l', 'i', 's', 't', 'e', 'n']
		char[] aa = a.toCharArray();
		char[] bb = b.toCharArray();

		// Use sort method for sorting alphabetically
		//= ['e', 'i', 'l', 'n', 's', 't']
		Arrays.sort(aa);
		Arrays.sort(bb);

		if (Arrays.equals(aa, bb)) {

			System.out.println("Its a Anagram");

		} else {
			System.out.println("Its not a Anagram");

		}

	}

}
//Its a Anagram
