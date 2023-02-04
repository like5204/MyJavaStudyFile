class Person
{
	public void Say()
	{
		System.out.println("This is Person class");
	}
}

class Student extends Person
{
	public void Say()
	{
		System.out.println("This is Student class");
	}
}
class Worker extends Person
{
	public void Say()
	{
		System.out.println("This is Worker class");
	}
}


public class TestPet
{
	public static void main(String[] args)
	{
		Person[] ps = {new Student(),new Worker()};

		System.out.println(ps[0]);
		for(int i = 0; i < ps.length; i++)
		{
			ps[i].Say();
		}
	}
}
