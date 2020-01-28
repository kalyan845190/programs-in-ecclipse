package CTSDemo;

public class exceptions {
	public static void main(String[] args)
	{
		try {
			int num[]=new int[10];
			System.out.println("accessing the element :"+ num[45]);
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown  :"+ e);
		}
		
		System.out.println("Out of block");
	}
}
	/*int age[]= {3,4,5,6,7};
	
	for(int i=0;i<8;++i)
	{
	System.out.print("   "+age[i]);
	
	}
	}
}*/
