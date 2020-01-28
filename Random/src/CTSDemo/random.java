package CTSDemo;
import java.util.*;
public class random {
public static void main(String[] args)
{
	int c;
	Random r=new Random();
	for(c=1;c<=10;c++)
	{
		System.out.println(r.nextInt(5));
	}
}
}
