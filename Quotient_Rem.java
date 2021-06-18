package com.program;

public class Quotient_Rem {
    public static void main(String[] args){
        
        int dividend, divisor, quo, rem;
        System.out.print("Enter Dividend:");
        dividend = Utility.getUserSpecificInteger();
        
        System.out.print("Enter Divisor:");
        divisor = Utility.getUserSpecificInteger();
        
        
        quo = dividend / divisor;
        
        rem = dividend % divisor;
        
        
        System.out.println("Quotient: "+quo);
        System.out.println("Remainder: "+rem);
    }
}
