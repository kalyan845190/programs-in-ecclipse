package CTSDemo;

import java.util.ArrayList;

public class contains {
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("good");
		list1.add("boy");
		list1.add("Kalyan babu");
		System.out.println(list1.contains("boy"));
		//System.out.println(list1.contains(54));
		System.out.println(list1.contains("good"));
}
}