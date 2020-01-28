package CTSDemo;
import java.util.*;
public class Fabonacci {
	public static void main(String[] args)
	{
	int a=0,b=1,c=0,i,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value: ");
		n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
	}
	
	}
}