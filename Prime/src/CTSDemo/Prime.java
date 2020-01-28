package CTSDemo;

import java.util.Scanner;

public class Prime {public static void main(String[] args)
{
int n,p=0;
Scanner sc= new Scanner(System.in);
System.out.print("enter n value: ");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
p++;
}
if(p==2)
{
System.out.print("n is prime");
}
else
{
System.out.print("n is not prime");
}
}

}
