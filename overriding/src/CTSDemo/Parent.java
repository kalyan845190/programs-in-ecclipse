package CTSDemo;

public class Parent {
void methodOfParentClass()
{
	System.out.println("Parent's method()");
}
}
class Child extends Parent{
	void methodOfParentClass()
	{
		System.out.println("Child's method()");
	}
}
class MethodOverriding{
	public static void main(String[] args) {
		Parent obj1=new Parent();
		obj1.methodOfParentClass();
		Parent obj2=new Child();
		obj2.methodOfParentClass();
	}
}
