public class printCirStar
{
	public static void main(String[] args)
	{
		for(int i = -2; i < 3; i++)
		{
			int a=i<0?-i:i;

			for(int k = 1; k <= a; k++)System.out.print(" ");
			for(int j=1; j<=3-a;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
