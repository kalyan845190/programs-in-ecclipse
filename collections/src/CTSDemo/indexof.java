package CTSDemo;

import java.util.ArrayList;

public class indexof {
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("satyanarayana");
		list1.add("chaitanya");
		list1.add("Kalyan babu");
		list1.add("Ganesh");
		list1.add("Murali");
		System.out.println(list1);
		int a=list1.indexOf("Kalyan babu");
		System.out.println("index is :"+a);
		int b=list1.indexOf("Kalyan ");
		System.out.println("index is :"+b);
}
}

