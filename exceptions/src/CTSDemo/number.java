package CTSDemo;
import java.util.Scanner;
public class number {
	private static Scanner p;
	public static void main(String[] args)
	{
		int num;
		try {
			p = new Scanner(System.in);
			System.out.println(" Enter a number :");
			num=p.nextInt();
			System.out.println(" number  "+num);
		}
		catch(Exception a){
			System.out.println("Exception thrown  :"+ a);
			System.out.println(" Invalid format   ");
		}
			System.out.println("The end");
	}
}
