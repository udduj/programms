package Programms;

import javax.naming.spi.DirStateFactory.Result;

public class DeleteRepeatingChar {
	
	public static void main(String[] args) {
		
		String str1 = "Uddesh";
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i<str1.length(); i++)
		{
			char ch = str1.charAt(i);
			
			if (result.indexOf(String.valueOf(ch))== -1)//// Check if character is not in the result yet
				{
				result.append(ch); // Add the character to result
				}
		}
		// Print the string after removing duplicates
				System.out.println("String after removing duplicates: " + result.toString());
	}
}

//String after removing duplicates: Udesh
