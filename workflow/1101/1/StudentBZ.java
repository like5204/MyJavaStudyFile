public class StudentBZ extends Student
{
	private String resp;

	public String getResp(){return resp;}
	public void setResp(String s){resp=s;}

	public StudentBZ(){}

	public StudentBZ(String  no, String name,double eng,double math,double comp, String r)
	{
		super(no,name,eng,math,comp);
		resp = r;
	}

	public double testScore()
	{
		return super.testScore() + 5;
	}

}
