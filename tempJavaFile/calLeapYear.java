import java.util.Scanner;


public class calLeapYear
{
	public static void main(String[] args)
	{
		System.out.print("Please input year(ex 2022): ");
		Scanner input = new Scanner(System.in);
		int y = input.nextInt();


		System.out.print("Pleaseinput month[1~12]: ");
		input=new Scanner(System.in);
		int m = input.nextInt();

		boolean x = false;

		if(y%4==0)
		{
			x = true;
			if(y%100==0&&y%400!=0)x=false;

		}
		
		int d= 0;

		switch(m)
		{
			case 1:d=31;break;
			case 2:d=x?29:28;break;
			case 3:d=31;break;
			case 4:d=30;break;
			case 5:d=31;break;
			case 6:d=30;break;
			case 7:d=31;break;
			case 8:d=31;break;
			case 9:d=30;break;
			case 10:d=31;break;
			case 11:d=30;break;
			case 12:d=31;break;
			default:d=0;
		}


		if(x)System.out.printf("This year(%d) is leap year and the month(%d) have %d day",y,m,d);
		else System.out.printf("This year(%d) not is leap year and the month(%d) have %d day",y,m,d);

	}
}
