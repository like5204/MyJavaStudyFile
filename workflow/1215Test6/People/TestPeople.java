import java.util.Arrays;
//5.声明一个类People，成员变量有姓名，出生日期，性别，身高，体重等
//生成10个People类对象，并放在一个一维数组中，编写方法按身高进行排序。

class People implements Comparable<People>
{
	String name;
	String birthdate;
	char gender;
	double height;
	double weight;
	
	@Override
	public int compareTo(People p2)
	{
		return (int)(this.height - p2.height);
	}
	public People(String n, String bir, char g, double h, double w)
	{
		name = n;
		birthdate = bir;
		gender = g;
		height = h;
		weight = w;
	}

}

public class TestPeople
{
	public static void main(String[] args)
	{
		People[] ps = new People[10];

		ps[0] = new People("张三","2002-11-09",'男',178,63);
		ps[1] = new People("李四","2002-01-09",'男',168,63);
		ps[2] = new People("王五","2002-11-09",'男',172,63);
		ps[3] = new People("a","2002-11-09",'男',159,63);
		ps[4] = new People("b","2002-11-09",'男',180,63);
		ps[5] = new People("c","2002-11-09",'男',185,63);
		ps[6] = new People("d","2002-11-09",'男',163,63);
		ps[7] = new People("e","2002-11-09",'男',169,63);
		ps[8] = new People("f","2002-11-09",'男',174,63);
		ps[9] = new People("g","2002-11-09",'男',188,63);

		Arrays.sort(ps);
		
		for(People p:ps)
		{
			System.out.print(p.height + "\t");
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
