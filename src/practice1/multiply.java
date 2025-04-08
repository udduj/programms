package practice1;

import java.util.Scanner;

public class multiply {
	
	
	
	public static void main(String[] args) {
		
		Scanner cs = new Scanner(System.in);
		System.out.println("enter number : ");
		
		int num = cs.nextInt();
		
		for (int i=0; i<=10; i++)
		{
			System.out.println(num + "*" + i + "=" + (num*i));
			
		}
	}

}
