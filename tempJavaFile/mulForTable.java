public class mulForTable
{
	public static void main(String[] args)
	{
		// 打印乘法口诀表
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.printf("%d * %d = %d",i,j,i*j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------");
		System.out.println();

		for(int i=9; i>=1;i--)
		{
			for(int j=i; j>=1;j--)
			{
				System.out.printf("%d * %d = %d",i,j,i*j);
			}
			System.out.println();
		}
	}
}
