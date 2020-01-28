package CTSDemo;
import java.util.*;
public class Operator {
public static void main(String[] args) {
	int num,r,q;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number: ");
	num=sc.nextInt();
	System.out.print("The number of one's in : "+num+"("+Integer.toBinaryString(num)+")");
	int result=countOne(num);
	System.out.println(" is: "+result);
	sc.close();
}
static int countOne(int n) {
	int count=0;

	while(n>2)
	{
		n=n&(n-1);
		count++;
	}
return count;
}
}




