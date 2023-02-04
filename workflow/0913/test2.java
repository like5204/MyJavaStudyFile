import java.util.Scanner;
import java.lang.Math;

public class test2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input year: ");
		int y = sc.nextInt();

		sc = new Scanner(System.in);
		System.out.print("Please input month: ");
		int m = sc.nextInt();

		if(m<0||m>12)
		{
			System.out.println("your input is illegal");
			return;
		}
			
		boolean x = isLeapYear(y);

		if(m==4||m==6||m==9||m==11)
		{
			System.out.println("This month have 30 days");
		}
		else if(m == 2)
		{
			int v = x?29:28;
			System.out.println("This month have "+v+" days");
		}
		else
		{
			System.out.println("This month have 31 days");
		}

		String seaon = reSeaon(m);

		System.out.println(m+"月是"+seaon);
	}

	static boolean isLeapYear(int y)
	{
		boolean  x = false;

		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			x = true;
		}
		return x;
	}
	
	static String  reSeaon(int m)
	{
		String seaon = "";

		switch(m)
		{
			case 3:
			case 4:
			case 5:
				seaon = "春季";
				break;
			case 6:
			case 7:
			case 8:
				seaon = "夏季";
				break;
			case 9:
			case 10:
			case 11:
				seaon = "秋季";
				break;
			case 12:
			case 1:
			case 2:
				seaon = "冬季";
				break;
			default:
				System.out.println("Input illegal");
		}

		return seaon;

	}
}
