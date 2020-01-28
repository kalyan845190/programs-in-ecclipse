package CTSDemo;
import java.util.*;
public class Uppercase {
	public static void main(String[] agrs)
	{
	String name,convert;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter name: ");
	name=sc.next();
	convert=name.toLowerCase();
	System.out.print("Lowercase: ");
	System.out.println(convert);
	convert=name.toUpperCase();
	System.out.print("Uppercase: ");
	System.out.println(convert);

}
}
