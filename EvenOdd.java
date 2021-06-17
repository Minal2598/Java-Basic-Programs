package com.program;

import java.util.Scanner;

public class EvenOdd
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int num;  
    System.out.println("Enter a number:");
    num = input.nextInt();
    input.close();

    if ( num % 2 == 0 )
        System.out.println("The entered number is even.");
     else
        System.out.println("The entered number is odd.");
  }
}
