package practice1;

public class SumofnumbersinArray {
	
	
	 public static void main(String[] args) {
		    int[] myArray = {1, 5, 10, 25};
		    int sum = 0;
		   
		      
		    // Loop through array elements and get the sum
		    for (int i = 0; i < myArray.length; i++) {
		      sum = sum + myArray[i];
		    }
		    System.out.println("The sum is: " + sum);
		  }

}
