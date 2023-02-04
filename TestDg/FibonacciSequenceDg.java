import java.util.Scanner;

class FibonacciSequenceDg
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input the Fibonacci number: ");

		int v = sc.nextInt();


		System.out.println(fac(v));
	}

	public static int fac(int n)
	{
		if(n <= 2)return 1;


		return fac(n-1)+fac(n-2);
	}
}
