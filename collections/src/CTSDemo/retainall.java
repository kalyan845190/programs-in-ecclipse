package CTSDemo;

import java.util.ArrayList;
import java.util.Collections;

public class retainall {
	public static void main(String[] args) 
    {
        ArrayList<String> p = new ArrayList<>();
      //  p.add("Kalyan");
        p.add("Mahesh");
        p.add("Kalyan");
        p.add("Taruni");
        p.add("Tejaswini");
          
    System.out.println(p);
    p.retainAll(Collections.singleton("Kalyan"));
     System.out.println(p);
    }
}


