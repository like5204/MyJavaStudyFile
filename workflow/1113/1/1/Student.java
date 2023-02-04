public class Student
{
	String No;
	private String name;

	double eng,math,comp,total;
	
	//method

	public Student(String id, String n,double e,double m,double c)
	{
		No = id;
		name = n;
		eng = e;
		math = m;
		comp = c;
		sum();
		
	}
	public Student()
	{
		this("","",0,0,0);
		total = 0;
	}

	// getter
	public String getNo(){return No;}
	public String getName(){return name;}
	public double getEng(){return eng;}
	public double getMath(){return math;}
	public double getComp(){return comp;}
	public double getTotal(){return total;}

	//setter
	public void setNo(String s){No = s;}
	public void setName(String n){name = n;}
	public void setEng(double e){eng=e;sum();}
	public void setMath(double m){math=m;sum();}
	public void setComp(double c){comp=c;sum();}
	
	

	public String toString()
	{
		sum();
		return No + " " + name + " " + eng + " " + math + " " + comp + " " + total;
	}

	void sum()
	{
		total = eng+math+comp;
	}
	
	public double testScore()
	{
		sum();
		return total/3;
	}
	public boolean equals(Student s1)
	{
		if(s1.No==No && s1.name==name)
		return true;

		return false;
	}

	public int compare(Student s1)
	{
		if(total > s1.total)
		return 1;
		else if(total < s1.total)
		return -1;
		else
		return 0;
	}



		
	
}















