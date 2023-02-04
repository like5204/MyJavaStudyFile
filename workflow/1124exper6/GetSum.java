import java.util.Scanner;
public class GetSum
{
	public static void main(String[] args)
	{
		
		int a=0,b=0;
		Scanner sc = new Scanner(System.in);

		boolean x = false;

		a = inputValue(1);
		b = inputValue(2);

		System.out.println("第一个数是: " + a);	
		System.out.println("第二个数是: " + b);

		System.out.println("他们的和是: " + (a+b));
	}

	public static int inputValue(int i)
	{
		boolean x = false;
		Scanner sc = new Scanner(System.in);
		int a = 0;

		while(!x)
		{
			try
			{
				x = true;
				sc = new Scanner(System.in);
				System.out.print("Please enter number "+i+ " : ");
				a = sc.nextInt();
			}
			catch(Exception e)
			{
				x = false;
				System.out.println("输入有误，请重新输入");
			}

		}
		return a;
		
	}
}
