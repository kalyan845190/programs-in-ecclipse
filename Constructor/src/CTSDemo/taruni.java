package CTSDemo;

public class taruni
{
		String name;
		int age;
		taruni()
		{
		this.age=21;
		this.name="taruni";
		}
		taruni(String n, int a)
		{
			this.age=a;
			this.name=n;
		}
	
		public static void main(String[] args)
		{
		taruni obj1=new taruni();
		taruni obj2=new taruni("latha",21);
		System.out.println(obj1.name+" "+obj1.age);
		System.out.println(obj2.name+" "+obj2.age);
	}
	}


