package CTSDemo;
import java.util.*;
public class replace {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a;
	System.out.println("Enter first string: ");
	a=sc.nextLine();	
	System.out.println(a.trim());
	String b;
	System.out.println("Enter second string: ");
	b=sc.nextLine();	
	System.out.println("Replacing");
	String c=b.replace('r','e');
	System.out.println(c);
			
}
}
