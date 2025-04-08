package Programms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalcNumOfChar {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a String");
//		String str = sc.next();

		String str = "Uddesh";
		String[] arr = str.split("");
		int count = 1;

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], count);
			}
		}
		System.out.println(hm);
	}
}

//{s=1, d=2, U=1, e=1, h=1}

//String s="swaati";
//
//HashMap<Character,Integer>map= new HashMap<>();
//
//for(Character c:s.toCharArray()){
//if(map.containsKey(c)){
//map.put(c,map.get(c)+1);
//}
//else{
//map.put(c,1);
//}
//System.out.println(map);
//}
