public class Undergraduate extends Student
{
	private String degree;

	public Undergraduate(String _n, int _a, String _d)
	{
		super(_n,_a);
		degree = _d;
	}

	public void show()
	{
		super.show();
		System.out.println("My degree is "+degree);
	}
}
