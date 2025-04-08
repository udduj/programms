package Programms;

public class Factorial {
	
	public static void main(String[] args) {
		
		int a = 6;
		int fact = 1;
		
		for (int i=1; i<=a; i++)
		{
			fact =fact *i;
		}	
	System.out.println("Number "+ a + " factorial is "+ fact);
	}
}

//Number 6 factorial is 720
//Number 6 factorial is 720