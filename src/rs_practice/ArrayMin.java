package rs_practice;

public class ArrayMin {
	
	public static void main(String[] args) {

		 int [] []abc ={ { 3,5,6},{8,7,9},{6,1,2}};
		 
	int	 min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
		 
		 for (int i = 0; i < 3; i++) { 

				for (int j = 0; j < 3; j++) { 
					
					if (abc[i][j]>max) {
						max= abc [i][j];
					}
				}
				
			}
		 System.out.println(max); 
		}

	


}
