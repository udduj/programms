package apnacollage;

import java.util.Scanner;

public class IfelseSwitch {
	
	// static int age = 19;
	public static void main(String[] args) {
		
//		
//		
//		int age = 19;
//		
//		if (age>18) {
//			
//			System.out.println("adult");
//		}
//		else {
//			System.out.println("Minor");
//		}
		
		// even or odd
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
		
		
		if(15%2==0)
		{
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		// we can say if,elseif elseif ....., at the end else
	
	
	int n = 4;
	switch(n) {
	   case 1 :
	       System.out.println("Monday");
	       break;
	   case 2 :
	       System.out.println("Tuesday");
	       break;
	   case 3 :
	       System.out.println("Wednesday");
	       break;
	   case 4 :
	       System.out.println("Thursday");
	       break;
	   case 5:
	       System.out.println("Friday");
	       break;
	   case 6 :
	       System.out.println("Saturday");
	       break;
	   default :
	       System.out.println("Sunday");
	}
	}

}
