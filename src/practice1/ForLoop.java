package practice1;

public class ForLoop {
	
	
	public static void main(String[] args) {
		
		String [] arr = new String [5];
		
		String [] air = { "rahul" , "Ram" ,"shyam" , "jay" , "roy" };
		
		int [] num = { 2,3,4,56,67,22,34,};
		
		arr[0]= "rahul";
		arr [1]="Ram";
		arr[2]="shyam";
		arr[3]="jay";
		arr[4]="roy";
		
		
		

		// First method
		
		for (String s: arr)
		{
			System.out.println(s);
		}
		
		System.out.println("*********************************");
		
		// second way
		
		for (int i=0; i<air.length; i++ )
		{
			System.out.println(air[i]);
		}
		
		System.out.println("*********************************");
		
		// Specific string 
		
		for (int i=0; i<air.length; i++ )
		{
			
			if (air[i].equals("roy"))
			{
				System.out.println(air[i]);
			}
			
		}
		
		System.out.println("*********************************");
		
		// another way
		
	int len = air.length;
	
	
	for (int i=0; i<len; i++ )
	{
		
		if (air[i].equals("roy"))
		{
			System.out.println(air[i]);
		}
		
	}
	System.out.println("*********************************");
	
	
		// even or odd
	
int len1 = num.length;

for ( int i=0; i<len1; i++)
{
	if ( num[i] % 2 == 0)
	{
		System.out.println("even number" +num[i]);
	}
	else
	{
		System.out.println("Odd number"+ num[i]);
	}
}
	
System.out.println("*********************************");

			
	
	}

}
