import java.util.Scanner;

public class planTicket
{
	public static void main(String[] args)
	{
		final int P=3000;
		
		System.out.print("Please input current month[1-12]:  ");
		Scanner input=new Scanner(System.in);
		int month = input.nextInt();
		
		if(month >= 4 || month <= 11)
		{
			float first=P*0.9f;
			float second=P*0.8f;
			System.out.printf("The first sit is %.2f, second sit is %.2f.",first,second);
		}
		else
		{
			float first=P*0.5f;
			float second=P*0.4f;
			System.out.printf("The first sit is %.2f, second sit is %.2f.",first,second);
		}

		
	}
}
