package com.program;

public class SwapNumber
{
 public static void main(String[] args) 
 {
  int a, b, c;
  System.out.println("Enter Value in a :");
  a = Utility.getUserSpecificInteger();
  System.out.println("Enter Value in b :");
  b = Utility.getUserSpecificInteger();
  c=a;
  a=b;
  b=c;
  System.out.println("Values in a:" +a);
  System.out.println("Values in b:" +b);
 }
}

