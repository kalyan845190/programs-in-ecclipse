package CTSDemo;

import java.util.ArrayList;

public class clone {
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("good");
		list1.add("boy");
		list1.add("Kalyan babu");
		System.out.println(list1);
		@SuppressWarnings("unchecked")
		ArrayList<String> list2= (ArrayList<String>) list1.clone();
		System.out.println(list2);
		
}
}
