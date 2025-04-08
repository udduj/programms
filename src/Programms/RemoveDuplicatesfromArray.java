package Programms;

import java.util.Arrays;

public class RemoveDuplicatesfromArray {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 2, 4, 1, 5};
	        arr = Arrays.stream(arr).distinct().toArray();
	        System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
	    }
	}

//Array after removing duplicates: [1, 2, 3, 4, 5]
