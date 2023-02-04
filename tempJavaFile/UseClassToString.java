public class  UseClassToString
{
	private String name;
	private int age;

	public UseClassToString(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return "My name is " + this.name + ", my age is " + this.age;
	}
	public static void main(String[] args)
	{
		UseClassToString ut = new UseClassToString("abc",15);

		System.out.print(ut);
	}
}
