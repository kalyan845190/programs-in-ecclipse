package CTSDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class get {
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("satyanarayana");
		list1.add("chaitanya");
		list1.add("Kalyan babu");
		list1.add("Ganesh");
		list1.add("Murali");
		System.out.println(list1);
		@SuppressWarnings("resource")
		Scanner p=new Scanner(System.in);
		int a=p.nextInt();
		String name=list1.get(a);
		System.out.println("name at index "+a+" is :  "+name);
}
}
