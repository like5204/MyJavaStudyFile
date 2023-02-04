public class TestStudent
{
	public static void main(String[] args)
	{

		Student s1 = new Student();

		s1.setName("张三");
		s1.setScore(12.0);

		Student s2 = new Student("李四",24.0);


		System.out.println(s1.getName());
		System.out.println(s1.getScore());
		System.out.println(s2.getName());
		System.out.println(s2.getScore());
	}


}
