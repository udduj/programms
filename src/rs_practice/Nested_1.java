package rs_practice;

public class Nested_1 {
	
	
	public static void main(String[] args) {
		
		int rows = 4;
		int k=1;
		for (int i=rows; i>=1; i--)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(+k+ " ");
				k++;
			}
			System.out.println("");
		}
	}

}

//1 2 3 4 
//5 6 7 
//8 9 
//10 