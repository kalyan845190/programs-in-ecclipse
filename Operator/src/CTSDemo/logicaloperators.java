package CTSDemo;
import java.util.*;
public class logicaloperators {
	public static void main(String[] args)
	{
	String username,password;
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter username: ");
	username=sc.next();
	System.out.println("Enter password: ");
	password=sc.next();
		if(username.equals("taruni") && password.equals("latha"))
	{
		System.out.println("Welcome to Email");
	}
	else
	{
		System.out.println("Invalid detials");
	}
	}
}
