package Programms;

import java.util.Arrays;

public class SecondLargestNofromArray {
	
	public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99, 50};
        Arrays.sort(arr);
        
        int secondLargest = arr[arr.length - 2];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println("Second largest element: " + secondLargest);
    }
}

//Second largest element: 50

