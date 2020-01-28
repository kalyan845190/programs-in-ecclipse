package CTSDemo;

import java.util.Scanner;

public class vowels {
	private static Scanner p;

	public static void main(String[] args)
	{
		int count=0;
		p = new Scanner(System.in);
		System.out.print("Enter the sentence  ");
		String s=p.nextLine();
		for( int i=0;i<s.length();i++)
		{
			
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' '||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				count++;
		}
		System.out.println("length of string  "+s.length()+" ");
		System.out.print("count  :"+count+" ");
		}

}
