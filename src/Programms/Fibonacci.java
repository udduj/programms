package Programms;

public class Fibonacci {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 1;
		int num = 5;

		for (int i = 0; i < num; i++) {
			a = b; // 0 1 1 2
			b = c; // 1 1 2 3
			c = a + b; // 1 2 3 5
			System.out.print(a + ",");
		}
	}
}

//0,1,1,2,3,