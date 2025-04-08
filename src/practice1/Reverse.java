package practice1;

public class Reverse {
	
	
	public static void main(String[] args) {
		
		String str = "987654321";
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println(reverse);
		
	}

}
