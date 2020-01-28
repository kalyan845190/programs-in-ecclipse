package CTSDemo;

import java.util.ArrayList;

public class removeIf {
	
	    public static void main(String[] args)throws CloneNotSupportedException  
	    {
	    	
	        ArrayList<Integer> p = new ArrayList<Integer>();
	        p.add(1);
	        p.add(2);
	        p.add(3);
	        p.add(4);
	        p.add(5);
	        p.add(6);
	        p.removeIf(p2->p2%2==0 );
	         
	        System.out.println(p);
	    }
	}


