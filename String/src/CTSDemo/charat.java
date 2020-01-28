package CTSDemo;
import java.util.*;
public class charat {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string: ");
	String a;
	int c;
	a=sc.nextLine();
	int len=a.length();
	System.out.println("String Length is: "+len);
	c=sc.nextInt();
	char b=a.charAt(c);
	System.out.println("Character at 8th position is: "+b);
}
}
