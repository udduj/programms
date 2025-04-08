package practice1;

import java.util.HashMap;

public class CalculateNumberofChracterinstring {
	
	
	public static void main(String []args) {
		
		//String str = "my my name name Udddessh";
	String str = "Udddessh";
		
		//String[]array= str.split(" ");
	String[]array= str.split("");
		
		int count = 1;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i=0; i<array.length; i++)
		{
			
			if (map.containsKey(array[i])) {
			
				map.put(array[i],map.get(array[i])+1);
			}
			else {
				map.put(array[i], count);
			}
				
		}
		System.out.println(map);// {name=2, Udddessh=1, my=2}
		//{s=2, d=3, U=1, e=1, h=1}
		
//		String s="swaati";
//		 
//		HashMap<Character,Integer>map= new HashMap<>();
//		 
//		for(Character c:s.toCharArray()){
//		if(map.containsKey(c)){
//		map.put(c,map.get(c)+1);
//		}
//		else{
//		map.put(c,1);
//		}
//		System.out.println(map);
//		}
	}

}
