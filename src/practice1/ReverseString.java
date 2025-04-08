package practice1;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		String ss = "Uddesh";
		
		//Create object of stringbuilder class and pass that string which we want to reverse
		
		StringBuilder reverse = new StringBuilder(ss).reverse();
		
		// lastly used tostring method to convert again in string
		
		String reverseString = reverse.toString();
		
		
		
		System.out.println("Reverse string: "+ reverseString);
		
		
	}

}

//Reverse string: hseddU
