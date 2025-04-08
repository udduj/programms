package practice1;

import java.util.Scanner;

public class Fibonessi {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter count: ");
		int count= scan.nextInt();
		
		int[] series= new int[count];
		series[0]= 0;
		series[1]= 1;
		
		// created array
		
		for(int i=2; i<count; i++)
		{
			series[i]= series[i-1]+ series[i-2];
			       // [2] =  2-1 + 2-2
		}
		
		// print that array
		
		System.out.print("Fabonacci series is: ");
		
		for(int i= 0; i<count; i++ )
		{
			System.out.print( series[i] + ",");//Fabonacci series is: 0,1,1,2,3,5,8,13,21,34,
		}
		
//		Scanner scan= new Scanner(System.in);
//		
//		System.out.println(" Enter number");
//		
//		 int num = scan.nextInt();
//		 
//		 int a = 0;
//		 
//		 int b= 1;
//		 
//	     int  c = a+b ;
//		 
//		 for ( int i=c; i<=num; i++) {
//			 
//			 int next = a + b;
//			 
//			 System.out.println( next+ ",");
//			 
//			 a = b;
//			 
//			 b= next ; 
//			 
//			 
//		 }
		 
//		 int a= 0;
//			int b= 0;
//			int c= 1;
//			int count;
//			Scanner scan = new Scanner(System.in);
//			System.out.println("enter value");
//			count= scan.nextInt();
//			
//			for(int i=0; i<count; i++) {
//				a=b; //0 1 1 2
//				b=c; //1 1 2 3
//				c=a+b; //1 2 3 5
//				System.out.println(a); //0 1
//				
//				
//			}
		 
		 
	}

}
