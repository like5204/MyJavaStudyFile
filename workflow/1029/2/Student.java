public class Student
{
	private String name;
	private int age;


	public Student()
	{
		this("",0);
	}

	public Student(String _n, int _a)
	{
		name = _n;
		age = _a;
	}
	
	public void show()
	{
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);

	}
}
