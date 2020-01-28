package CTSDemo;

public class Cricket {

	String name;
	int age;
	String DOB;
	int centuries;
	int halfcenturies;
	Cricket(String b, int a, String c, int d, int e)
	{
		this.age=a;
		this.name=b;
		this.DOB=c;
		this.centuries=d;
		this.halfcenturies=e;
	}

	public static void main(String[] args)
	{
		Cricket obj1=new Cricket("Kohli",21,"22/08/1998",43,54);
		Cricket obj2=new Cricket("Dhoni",23,"15/02/1996",56,25);
	System.out.println(obj1.name+" "+obj1.age+" "+obj1.DOB+" "+obj1.centuries+" "+obj1.halfcenturies);
	System.out.println(obj2.name+" "+obj2.age+" "+obj2.DOB+" "+obj2.centuries+" "+obj2.halfcenturies);
}
}
