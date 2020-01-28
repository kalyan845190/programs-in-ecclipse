package CTSDemo;
import java.util.ArrayList;
public class list {
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("satyanarayana");
		list1.add("chaitanya");
		list1.add("Kalyan babu");
		list1.add("Ganesh");
		list1.add("Murali");
		
		ArrayList<String> list2=new ArrayList<String>();
		list1.remove("Kalyan babu");
		list2.add("Haritha");
		list1.addAll(list2);
		System.out.println(list1);
	}

}
