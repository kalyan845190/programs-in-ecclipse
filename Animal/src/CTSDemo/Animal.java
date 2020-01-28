package CTSDemo;

public class Animal {
void method()
{
	System.out.println("method of parent");
}
}
class Infant extends Animal{
	void method()
	{
		System.out.println("method of child");
	}
	void newmethod()
	{
		System.out.println("new method of child");
	}
	public static void main(String[] args) {
		Animal obj=new Animal();
		obj.method();
		Animal obj1=new Infant();
		obj1.method();
	Infant obj2=new Infant();
	obj2.newmethod();
	}
}
