package practice1;

import java.util.Scanner;

public class Addonatural {

	public static void main(String[] args) {
		
		// ( 1 + 2 + 3 + 4 + 5 = 15)
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int num = sc.nextInt();//5

		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			
			System.out.print(i +",");// 1,2,3,4,5
			sum = sum + i;
		}

		System.out.println(sum);//15
		//sc.close();
	}
}
