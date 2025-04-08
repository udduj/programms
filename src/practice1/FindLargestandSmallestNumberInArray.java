package practice1;

public class FindLargestandSmallestNumberInArray {
	
	
	public static void main(String []args) {
		
		
		int [] arr = { 7,8,71,17,92,32,4,1,9};
		
		
		int size = arr.length;
		
		System.out.println("Size of an array: " + size);
		
		// declare the smallest and largest variable
		
		int largest = arr[0];
		int smallest= arr[0];
		
		// use for loop to iterate first to last number of array
		
		for (int i=1; i<size; i++)
		{
			//If arr[i] > largest: If the current element is greater than the current largest value, 
			//then the largest variable is updated to the value of arr[i].
			
			if (arr[i]> largest)largest = arr[i];
			if (arr[i]<smallest)smallest= arr[i];
		}
		
		System.out.println("Largest number from array: "+ largest);
		System.out.println("Smallest number from the array: "+ smallest);
		
	}

}
//Size of an array: 9
//Largest number from array: 92
//Smallest number from the array: 1
