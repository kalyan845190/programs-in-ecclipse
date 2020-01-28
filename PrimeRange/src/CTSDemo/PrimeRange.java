package CTSDemo;

import java.util.Scanner;

public class PrimeRange {
	public static void main(String[] args)
	{
	int n=0,count,i=0,j;
	Scanner sc= new Scanner(System.in);

	for(n=1;n<=100;n++)
	{
	count=0;
	for( i=1;i<=n;i++)
	{
	if(n%i==0)
	{
	count++;
	}
	}
	if(count==2)
	{
	System.out.print( n+" ");
	}
	}


	}

}
