package practice1;

public class Arraypractice {
	
	public static void main(String[] args) {
		
	
	
	 int []numbers = {2,5,6,8,45 };
     
     System.out.println("***********");
     System.out.println(numbers[0]);
     System.out.println("***********");
     System.out.println(numbers[4]);
     System.out.println("***********");
     
     int len = numbers.length-1;
     
     System.out.println(len);
      System.out.println("***********");
     for (int i=len; i>=0; i--)
     {
        System.out.println(numbers[i]);
     }
      System.out.println("***********");
     
	}
}
