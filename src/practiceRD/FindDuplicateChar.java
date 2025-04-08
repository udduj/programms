package practiceRD;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicateChar {
	
	
	
		
		public static void main(String[] args)
		{
		String str= "Hello hello my my name is Rupali";
		String str1= str.toLowerCase();
		String[] str2= str1.split(" ");
//			
//			Using array list	==========================================================================
//			
//			
		ArrayList<String> removedChar = new ArrayList<String>();
			ArrayList<String> duplicateChar = new ArrayList<String>();
			
		
//			for(int i=0; i<str2.length; i++)
//			{
//				if(!(removedChar.contains(str2[i]))) {
//					
//					removedChar.add(str2[i]);
//					
//				}
//				else if(!(duplicateChar.contains(str2[i])))
//				
//				{
//					duplicateChar.add(str2[i]);
//				}
//			}
//			
//			System.out.println("Duplicate char: "+ duplicateChar);
//			System.out.print("Removed duplicate char: ");
//			for(String ch:removedChar )
//			{
//				System.out.print(" "+ch);
//			}
			
	//		=======================================================
			
			//Using HashMap
			
			int count=1;
			
			HashMap<String, Integer> map= new HashMap<String, Integer>();
			for(int i=0; i<str2.length; i++)
			{
				if(map.containsKey(str2[i]))
				{
					map.put(str2[i], map.get(str2[i])+1);
				}
				else
				{
					map.put(str2[i], count);
					removedChar.add(str2[i]);
				}
			}
			
			System.out.println("Duplicate char: "+ map);
			System.out.print("Removed duplicate char: ");
			for(String ch:removedChar )
			{
				System.out.print(" "+ch);
			}
			
		
			
		}

}
