package CTSDemo;
import java.util.*;
public class Concat {
	public static void main(String[] args)
	
	{
	String name1,name2;
	Scanner sc=new Scanner(System.in);
	name1=sc.nextLine();
	name2=sc.nextLine();
	name1=name1.concat(name2);
	System.out.println("After concatenation the string is : "+name1);

}}
