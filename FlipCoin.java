package com.program;

import java.util.Scanner;       
public class FlipCoin {

package com.program;
public class FlipCoin {

	public static void main(String[] args) {
			System.out.println("Enter number of times to flip::");
		 	
		 	int flip = Utility.getUserSpecificInteger();
	        System.out.println("number of times are " +flip);
	        int i=1;
	        int head = 0;
	        int tail = 0;
	        while(i<=flip) {
	        double Randomvalue = Utility.getRandomDouble();
	        System.out.println(Randomvalue);
	        if(Randomvalue<0.5) 
	              {
					System.out.println("heads");
					head=(head+1);
	              }
	        	else 
	        	  {
						System.out.println("tails");
						tail=(tail+1);
		          }
	        	   i++;
	}	
	       
	      
	        double headpercentage=(( head/(head+tail)) * 100);
	        double tailpercentage=(( tail/(head+tail)) * 100);
	        System.out.println("heads percentage is " + headpercentage);
	        System.out.println("tails percentage is " + tailpercentage );
	        
	        
	}
}



