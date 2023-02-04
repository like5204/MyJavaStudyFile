import java.util.Scanner;

public class inputNumber
{
	public static void main(String[] args)
	{
		int number1, number2;

		System.out.print("Please input first number: ");
		Scanner input = new Scanner(System.in);

		number1=input.nextInt();

		System.out.print("Please input Second number: ");
		input=new Scanner(System.in);

		number2=input.nextInt();

		System.out.printf("number1=%d,number2=%d\n",number1,number2);

		if(number1==number2)
		{
			System.out.println("number1 == number2.");
		}
		else if(number1 > number2)
		{
			System.out.println("number1 > number2.");
		
		}
		else
		{
			System.out.println("number1 <  number2.");
		}
			
	}
}
