package CTSDemo;

public class tryfinal {
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
       finally
           {
			System.out.println("Inside the finally block");	
		   }

}
}