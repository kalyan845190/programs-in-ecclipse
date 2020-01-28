package CTSDemo;
class Employee{
	public int emp_id;
	public String emp_name;
	Employee(int emp_id,String emp_name)
	{
		this.emp_id= emp_id;
		this.emp_name= emp_name;
	}
}

public class arrayofobjects {
	public static void main(String[] args)
	{
		Employee[] employeeArray;
		employeeArray=new Employee[5];
		employeeArray[0]=new Employee(1,"Taruni");
		employeeArray[1]=new Employee(2,"Taruni.R");
		employeeArray[2]=new Employee(3,"Taruni.T");
		employeeArray[3]=new Employee(4,"Taruni.y");
		employeeArray[4]=new Employee(5,"Taruni.U");
		for(int i=0;i<employeeArray.length;i++)
		{
			System.out.println(employeeArray[i].emp_id+"     "+employeeArray[i].emp_name);
		}
	}
	
}
