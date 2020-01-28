package CTSDemo;

public class dividebyzero {
	public static void main(String args[])
	{
		int a=10,b=0;
		try {
						int c;
			c=a/b;
			System.out.println(c);
		}
	catch(ArithmeticException e)
	{
		
		System.out.println("Exception thrown  :"+ e);
	}
	
	System.out.println("End of main");
}

}
