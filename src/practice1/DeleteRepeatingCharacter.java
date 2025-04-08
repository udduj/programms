package practice1;

public class DeleteRepeatingCharacter {

	public static void main(String[] args) {
		String str = "aabbccddeeff"; // Input string
		StringBuilder result = new StringBuilder(); // To store the result string

		// Loop through each character in the string
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); // Get the character at index i
			if (result.indexOf(String.valueOf(c)) == -1) { // Check if character is not in the result yet

				result.append(c); // Add the character to result
			}
		}

		// Print the string after removing duplicates
		System.out.println("String after removing duplicates: " + result.toString());
	}
}
