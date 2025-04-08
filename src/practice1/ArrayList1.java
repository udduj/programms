package practice1;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
//	    for (String i : cars) {
//	      System.out.println(i);
//	    }
	    
	   int len = cars.size();
	   
	   System.out.println(cars.get(1));//BMW
	   
	   for (int i=0; i<=len-1; i++)
	   {
		   System.out.println(i + "=" + cars.get(i)); 
	   }
	  }
}

//0=Volvo
//1=BMW
//2=Ford
//3=Mazda
