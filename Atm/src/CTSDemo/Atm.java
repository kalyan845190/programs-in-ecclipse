package CTSDemo;

import java.util.Scanner;

public class Atm {
	private static Scanner sc;

	public static void main(String[] args)
	{
	sc = new Scanner(System.in);
	int a;
	System.out.print("enter amount: ");
	a=sc.nextInt();
	if(a<1000)
	{
	System.out.println("Minimum balance should be entered");
	}
	if(a>=1000)
	{
	System.out.println("Collect the cash");
	}
	}

}
