  GNU nano 5.6.1                                               Harmonic.java                                                Modified






















package javaPrograms;
public class HarmonicNumber{
	public static void main(String[] args)
	{
	
	double sum=0,n,i;
	System.out.println("Please Enter the value of N:=");
	n = Utility.getUserSpecificDouble(); 
	for(i=1;i<=n;i++)
	{
	sum=sum+(1/i);
	if(i==1)
	System.out.println("1 + ");
	else if(i==n)
	System.out.println("1/ "+i);
	else
	System.out.println("1/ "+i);
	}
	System.out.println();
	System.out.println("THE SUM OF THIS SERIES IS:="+sum);
	}
}
