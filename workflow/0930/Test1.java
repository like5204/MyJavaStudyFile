public class Test1
{
	public static void main(String[] args)
	{
		//单行最大，最大数列最小

		int[][] arrs = new int[][]{{3,48,9,12},{19,62,21,33},{87,79,31,77}};
		
		output(arrs);

		for(int i = 0; i < arrs.length; i++)
		{
			//循环行数
			int max = 0;
			for(int j = 0; j < arrs[i].length; j++)	//循环i行的每个元素，找一个最大值的下标arrs[i][max]
				max = arrs[i][j]>arrs[i][max]?j:max;
			
			int min = 0;
			for(int j = 0; j < arrs.length; j++)//在m列找最小值的下标
				min = arrs[j][max] < arrs[min][max]?j:min;

			if(i==min)System.out.println("The number is " + arrs[min][max]);
		}
	}

	public static void output(int[][] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
