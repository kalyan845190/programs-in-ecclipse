package CTSDemo;
import java.util.*;
public class binary {
private static Scanner p;
public static void main(String[] args)
{
	int num,r=0,count=0,q=0,temp;
	Scanner p=new Scanner(System.in);
	System.out.println("Enter a number: ");
	num=p.nextInt();
	temp=num;
	while(num>0)
	{
		r=num%2;
		if(r==1)
		{
			count++;
		}
		num=num/2;
	}
	System.out.println(Integer.toBinaryString(temp));
	System.out.println("number of ones: "+count);
}

}
