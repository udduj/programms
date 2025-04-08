package practice1;

public class CapitalLetter {
	
	
	public static void main(String[] args)
	{
		String str= "Rupali Uddesh";
		char[] str2= str.toCharArray();
		
		
		for(int i=0; i<str2.length; i++)
		{
			//int asciiValue= (int) str2[i];
			if(str2[i]>= 65 && str2[i]<= 90)  // ASCII code: 97 to 122: Small letters, 65 to 90: Capital letters
			{
				System.out.println("Capital lettetr: "+ str2[i]);
				
			}
//			else if(str2[i]>= 97 && str2[i]<= 122)
//			{
//				System.out.println("Small lettetr: "+ str2[i]);
//			}
//			else {
//				System.out.println("Special char or spaces: "+ str2[i]);
//			}
		}
	}
 

}
