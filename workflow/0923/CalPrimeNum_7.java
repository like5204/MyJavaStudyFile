public class CalPrimeNum_7
{
	public static void main(String[] args)
	{
		int a = 0;
		for(int i = 2; i <= 100; i++)
		{
			if(Cal(i))
			{
				a++;
				System.out.print(i + " ");
				if(a % 5 == 0)System.out.println();
			}
		}
	}


	public static boolean Cal(int num)
	{
		boolean x = true;

		for(int i = 2; i <= num-1; i++)
		{
			if(num % i == 0)
			{
				x = false;
				break;
			}
		}

		return x;
	}
}
