package CTSDemo;

import java.util.ArrayList;

public class ensurecapacity {
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<>(1);
		list1.add("good");
		list1.add("boy");
		list1.add("Kalyan babu");
		System.out.println(list1);
		list1.ensureCapacity(1);
		list1.add("bad");
		list1.add("boy");
		list1.add("Kalyan ");
		System.out.println(list1);
		
	}
}
