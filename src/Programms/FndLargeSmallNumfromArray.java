package Programms;

public class FndLargeSmallNumfromArray {
	
	public static void main(String[] args) {
		
		int [] arr = { 22,28,48,91,26,19};
		
		int largest = arr[0];
		int smallest = arr [0];
		
		for (int i=0; i<arr.length; i++)
			{
			if (arr[i]>largest)largest =arr[i];
			if (arr[i]<smallest)smallest=arr[i];			
	}
	System.out.println("Largest number from array: "+ largest); 
    System.out.println("Smallest number from the array: "+ smallest);
}
}

//Largest number from array: 91
//Smallest number from the array: 19