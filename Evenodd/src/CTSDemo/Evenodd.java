package CTSDemo;

import java.util.Scanner;

public class Evenodd {
	private static Scanner sc;

	public static void main(String[] args)
	{
	int n;
	sc = new Scanner(System.in);
	System.out.print("enter n value: ");
	n=sc.nextInt();
	if(n%2==0)
	{
	System.out.print("n is even");
	}
	else
	{
	System.out.print("n is odd");
	}
	}
}
