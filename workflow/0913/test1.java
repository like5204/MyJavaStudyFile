import java.util.Scanner;
import java.lang.Math;

public class test1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Please input radius: ");
		double r = sc.nextDouble();

		sc = new Scanner(System.in);
		System.out.print("Please input integer k[1~3]: ");

		int k = sc.nextInt();


		switch(k)
		{
			case 1:
				double s = Math.PI * r * r;
				System.out.println("The circle area is " + s);
				break;
			case 2:
				double l = 2 * Math.PI * r;
				System.out.println("The circle length  is " + l);
				break;
			case 3:
				System.out.printf("you input 3. Error");
				break;
			default:
				System.out.printf("default");
		}
	}
}
