import java.util.Scanner;

public class CalMaxMin_9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input First number: ");
		int num1 = sc.nextInt();
		System.out.print("Please input Second number: ");
		int num2 = sc.nextInt();
		int a = num1;
		int b = num2;

		while(b != 0)
		{
			int t = a % b;
			a = b;
			b = t;
		}

		System.out.println("最大公约数是: " + a);
	
		b = num1 * num2 / a;

		System.out.println("最小公倍数是: " + b);
		

	}
}
