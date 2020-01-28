package CTSDemo;

import java.util.Scanner;

public class Equal {
	private static Scanner sc;

	public static void main(String[] args)
	{
	int a,b;
	sc = new Scanner(System.in);
	System.out.println("enter a value: ");
	a=sc.nextInt();
	System.out.println("enter b value: ");
	b=sc.nextInt();
	if(a==b)
	{
	System.out.print("Both are equal");
	}
	else
	{
	System.out.print("Both are not equal");
	}
	}
}
