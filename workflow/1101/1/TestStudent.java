public class TestStudent
{
	public static void main(String[] args)
	{
		Student s2 = new Student("2011","lxl",60.0,80,90);
		System.out.println(s2);
		System.out.println(s2.getName() + " total score is: " + s2.testScore());
		
		StudentXW s3 = new StudentXW("2012","abc",50,70,100,"manager");
		System.out.println(s3);
		System.out.println(s3.getName() + " toal score is: " + s3.testScore());

		StudentBZ s4 = new StudentBZ("2013","xyz",100,50,20,"help");
		System.out.println(s4);
		System.out.println(s4.getName() + " toal score is: " + s4.testScore());


	}

}
