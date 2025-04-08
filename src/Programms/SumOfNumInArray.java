package Programms;

import java.lang.reflect.Array;

public class SumOfNumInArray {
	
	public static void main(String[] args) {
		
		int [] a= {1,3,8,9,5,73,3,2};
		int sum=0;
		
		for (int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}

//104