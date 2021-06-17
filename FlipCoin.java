package com.program;

import java.util.Scanner;       
public class FlipCoin {

	public static void main(String[] args) {
			System.out.println("Enter number of times to flip::");
		 	Scanner sc= new Scanner(System.in);
		 	int flip = sc.nextInt();
	        System.out.println("number of times are " +flip);
	        int i=1;
	        double head = 0;
	        double tail = 0;
	        while(i<=flip) {
	        double Randomvalue = Math.random();
	        System.out.println(Randomvalue);
	        if (Randomvalue<0.5) 
	              {
					System.out.println("heads");
					head = (head+1);
	              }
	        	else 
	        	  {
						System.out.println("tails");
						tail = (tail + 1);
		          }
	        	   i++;
	}	
	        double headpercentage=(( head /(head+tail)) * 100);
	        double tailpercentage=(( tail /(head+tail)) * 100);
	        System.out.println("heads percentage is " + headpercentage);
	        System.out.println("tails percentage is " + tailpercentage );
	        sc.close();
	        
	}

}
