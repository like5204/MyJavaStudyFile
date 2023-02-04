import java.util.Scanner;

public class yhsj
{
	public static void main(String[] args)
	{
		//输入行数，打印对于行数的杨辉三角
		System.out.print("Please input rows: ");
		Scanner input = new Scanner(System.in);
		
		int r = input.nextInt();
		
		int[] o = null;

		for(int i = 1; i <= r; i++)
		{
			for(int j = 0; j < r - i; j++)
			System.out.print(" ");
			//根据当前行数来打印空格
			

			int[] a = new int[i];//定义一个大小与当前行数一样大的整型数组

			if(i>1)
			{
				//当行数大于1时，设置数组首尾元素为1
				a[0]=1;a[i-1]=1;
				if(i > 2)
				{
					//当行数大于2时，需要使用上一行的元素
					for(int j = 1; j < i-1; j++)
					a[j]=o[j-1]+o[j];//画图发现规律
				}
				o = new int[i];//实例化o,存储这次的结果，为下一次使用做准备
				for(int j=0;j<i;j++)
				o[j]=a[j];//将a里的内容搬到o里
			}
			else
			{
				//当i=1时，数组只有一个1
				a[0] = 1;
			}
			for(int item:a)
			System.out.print(item+" ");//循环输出元素
			
			System.out.println();//当前行输出完毕，打印换行.
		}
		
		

	}
}
