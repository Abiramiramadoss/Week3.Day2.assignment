package week3.assignment;

public class CharOccurance {

	public static void main(String[] args) {

		String str = "welcome to chennai";

		
		int count=0;
		
		char[] ch = str.toCharArray();
		
	    for(char each: ch){
	   	
            if(each == 'e'){
                count++;
			}
			
		}
		   
	  System.out.println("No.of'e'present is:" +count);  

	}

}
