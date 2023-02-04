public class CalFactorial_5
{
	public static void main(String[] args)
	{
		for(int i = 2; i <= 10; i+=2)
		{
			if(i==8)continue;
			System.out.println("This is " + i + "! ==> " + fac(i));
		}
	}

	public static long fac(int num)
	{
		if(num <= 1)return 1;
		else return fac(num-1)*num;
	}
}	
