package apnacollage;

import java.util.Scanner;

public class Fibo {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		
		int[]numarray = new int[num];
		numarray[0]=0;
		numarray[1]=1;
		
		for (int i=2; i<numarray.length; i++) {
			numarray[i]= numarray[i-1]+numarray[i-2];
			
		}
		
		for (int i=0; i<numarray.length; i++) {
			System.out.print(numarray[i] + ",");
		}
	}

}
