package rs_practice;

public class ArrayMultidimensional {

	public static void main(String[] args) {

		 int [] []abc ={ { 3,5,6},{8,7,9},{6,1,2}};

		// Correctly define and initialize the 2D array (3x3)
		//int[][] abc = new int[3][3];

		 
//		For understanding
//		
//		String arr[]= W.E.split(" ");
//		
//		String year= arr [0];
//		String month= arr [1];
//				
				
		// Assign values to the 2D array
//		abc[0][0] = 3;
//		abc[0][1] = 5;
//		abc[0][2] = 6;
//		abc[1][0] = 8;
//		abc[1][1] = 7;
//		abc[1][2] = 9;
//		abc[2][0] = 6;
//		abc[2][1] = 1;
//		abc[2][2] = 2;

		// Correct the loop to print values from index 0 to 2 (inclusive)
		for (int i = 0; i < 3; i++) { // Loop through rows (indices 0 to 2)

			for (int j = 0; j < 3; j++) { // Loop through columns (indices 0 to 2)
				System.out.print(abc[i][j] + " ");
			}
			System.out.println(); // Print a new line after each row
		}
	}

}

//3 5 6 
//8 7 9 
//6 1 2 
