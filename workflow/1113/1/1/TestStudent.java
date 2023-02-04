public class TestStudent
{
	public static void main(String[] args)
	{
		
		Student[] ss = new Student[5];

		ss[0] = new Student("2011","lxl",60,80,90);
		ss[1] = new Student("2012","abc",60,80,90);
		ss[2] = new Student("2013","def",60,80,90);
		ss[3] = new StudentXW("2014","xyz",60,80,90,"study");
		ss[4] = new StudentBZ("2015","iuy",60,80,90,"help");

		
		for(int i = 0; i < ss.length; i++)
		{
			double v = ss[i].testScore();
			System.out.println("Score is: " + v);
		}



	}

}
