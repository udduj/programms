package practice1;

public class PrimeNumber {
	
//	A prime number is a natural number greater than 1 that has only two factors:
//		1️= 1
//		2️= Itself
//
//This means a prime number cannot be divided by any other number except 1 and itself without leaving a remainder.


	public static void main (String []args) 
	{
		int num = 0;
		
	    int	rem;
	    
	    boolean isprime = true;
			for (int i=2; i<num ; i++)
			{
				rem= num % i;
				
				if (rem==0)
				{
					isprime= false;
					break;
				}
			}
			if (isprime)
			{
				System.out.println("Prime ");
			}
			else {
				System.out.println("Not prime");
			}	
	}

}
