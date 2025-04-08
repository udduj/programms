package Programms;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicateChar {
	
	public static void main(String[] args) {
		
		String str1 = "Uddesh";
		String[] str2 = str1.split("");
		
		ArrayList<String> duplicatechar = new ArrayList<String>();
		ArrayList<String> removechar = new ArrayList<String>();
		
		int count =1;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i=0; i<str2.length; i++)
		{
			if (map.containsKey(str2[i])) {
				map.put(str2[i], map.get(str2[i])+1);
			}
			else
				{
				map.put(str2[i], count); 
				removechar.add(str2[i]); 
				}
		}
		System.out.println("Duplicate char: "+ map); 
		System.out.print("Removed duplicate char: "); 
		
		for(String ch:removechar ) 
		{ 
		System.out.print(" "+ch); 
		} 
	}
}

//Duplicate char: {s=1, d=2, U=1, e=1, h=1}
//Removed duplicate char:  U d e s h
