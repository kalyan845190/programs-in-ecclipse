package CTSDemo;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	int i,sum=0,r,n,temp;
	System.out.print("enter n value: ");
	n=sc.nextInt();
	temp=n;
	while(n>0)
	{
	r=n%10;
	sum=sum*10+r;
	n=n/10;
	}
	n=temp;
	if(n==sum)
	System.out.print(sum +"is a palindrome number");
	else
	System.out.print(n +"is not a palindrome number");
	}
}
