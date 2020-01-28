package CTSDemo;

import java.util.ArrayList;
import java.util.Collections;

public class removeall {
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Kalyan");
		list1.add("Mahesh");
		list1.add("Kalyan");
		list1.add("Ganesh");
		list1.add("Murali");
		System.out.println(list1);
		list1.removeAll(Collections.singleton("Kalyan"));
		System.out.println(list1);
}
}
