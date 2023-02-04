import java.util.Scanner;
import java.util.Calendar;

public class Constellation
{
	public static void main(String[] args)
	{
		System.out.print("Please enter your birthdat example:0302==> 302(The number should int): ");
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		String con=null;

		if(num >= 121 && num <= 219)con="水瓶";
		else if(num >= 220 && num <= 320)con="双鱼";
		else if(num >= 321 && num <= 420)con="白羊";
		else if(num >= 421 && num <= 521)con="金牛";
		else if(num >= 522 && num <= 621)con="双子";
		else if(num >= 622 && num <= 722)con="巨蟹";
		else if(num >= 723 && num <= 823)con="狮子";
		else if(num >= 824 && num <= 923)con="处女";
		else if(num >= 924 && num <= 1023)con="天平";
		else if(num >= 1024 && num <= 1122)con="天蝎";
		else if(num >= 1123 && num <= 1221)con="射手";
		else if(num >= 1222 && num <= 120)con="魔蝎";
		else con="Error";


		System.out.println("Your constellation is " + con );

	}
}
