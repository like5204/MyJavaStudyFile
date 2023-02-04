public class Student
{
	private String name;
	private double score;

	
	public void setName(String _n){name=_n;}
	public void setScore(double _s){score=_s;}

	public String getName(){return name;}
	public double getScore(){return score;}

	public Student()
	{
		this("",0.0);
	}

	public Student(String _n, double _s)
	{
		name = _n;
		score = _s;
	}
}
