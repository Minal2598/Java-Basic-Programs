package com.program;
public class Factors{
	public static void main(String args[]){
	      
	      
	      System.out.println("Enter a number ::");
	      int number = Utility.getUserSpecificInteger();
	      
	      for(int i = 2; i< number; i++) {
	         while(number % i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	   }

}
