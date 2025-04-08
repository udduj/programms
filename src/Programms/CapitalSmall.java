package Programms;

public class CapitalSmall {

	public static void main(String[] args) {

		String str1 = "Uddesh@";
		char[] str2 = str1.toCharArray();

		for (int i = 0; i < str2.length; i++) {
			if (str2[i] >= 65 && str2[i] <= 90) {
				// ASCII code: 97 to 122: Small letters, 65 to 90: Capital letters
				System.out.println("Capital letter: " + str2[i]);
			} else if (str2[i] >= 97 && str2[i] <= 122) {
				System.out.println("Small letter: " + str2[i]);
			} else {
				System.out.println("Special char : " + str2[i]);
			}
		}
	}
}

//Capital letter: U
//Small letter: d
//Small letter: d
//Small letter: e
//Small letter: s
//Small letter: h
//Special char : @





