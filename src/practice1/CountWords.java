package practice1;

public class CountWords {
	
	
	
		  public static void main(String[] args) {
		    String words = "One Two Three Four";
		    int countWords = words.split("\\s").length;
		    System.out.println(countWords);
		  }
		}


