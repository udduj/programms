package Programms;

import java.util.Arrays;

public class LargestThird {
	
	
	    public static void main(String[] args) {
	        int[] arr = {10, 5, 20, 8, 25, 15};
	        Arrays.sort(arr);
	        System.out.println("Largest three elements: "+ arr[arr.length - 3]);
	    }
	}

//Largest three elements: 15
