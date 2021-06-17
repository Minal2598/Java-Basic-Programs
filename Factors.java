package com.program;

import java.util.Scanner;
public class Factors{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    int num = sc.nextInt();
    sc.close();

    if(num == 0){
        System.out.println("Factorial of 0 is 1");
    }else if(num > 0){
      int result = 1;
      for(int i=num ; i>=1 ; i--){
        result = result * i;
      }
      System.out.println("Factorial of "+num+" is: " +result);
    }
  }
}
