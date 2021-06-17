package com.program;

import java.util.Scanner;
public class Harmonic{
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter N: ");
    int num = sc.nextInt();
    sc.close();
    if(num != 0){
      double hp = 0;  
      for(double i=1 ; i<=num ; i++){
        double hn = hp + 1/i;   
        hp = hn;
      }
      System.out.println("Harmonic value for " +num+ "is: \n");
      System.out.println(hp);
    }else{
      throw new ArithmeticException("Invalid number");
    }

  }
}