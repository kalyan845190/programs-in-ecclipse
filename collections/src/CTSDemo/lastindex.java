package CTSDemo;

import java.util.ArrayList;

public class lastindex {
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("satyanarayana");
		list1.add("chaitanya");
		list1.add("Kalyan babu");
		list1.add("Ganesh");
		list1.add("Kalyan babu");
		list1.add("Murali");
		list1.add("Kalyan babu");
		System.out.println(list1);
		int a=list1.lastIndexOf("Kalyan babu");
		System.out.println("last index is :"+a);
		int b=list1.lastIndexOf("Kalyan ");
		System.out.println("index is :"+b);
}
}
