package practice1;

import java.util.Scanner;

public class largestnumber {

	
	
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("Enter 3 numbers : ");
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		
//		 int largest = num1;
//		 
//		if (num2>largest)largest = num2;
//		if (num3>largest)largest = num3;
//		
//		System.out.println(largest);
//		
		
		int num[]={1,2,3,4,5};
		int max=num[0];
		 
		for(int i=0;i<num.length;i++){
		if(num[i]>max){
		max=num[i];
		}
		System.out.println(max);
		}
	}

	
}
