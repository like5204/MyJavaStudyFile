import java.util.Scanner;

public class GetRandomValue
{
	public static void main(String[] args)
	{
		int[] arr = new int[100]; //初始化一个数组
		int index = -1;//初始化索引为-1
		Scanner sc = new Scanner(System.in);

		init_array(arr);//调用方法使用随机数来填充数组

		System.out.print("Please enter index(1~100): ");
		
		try
		{
			index = sc.nextInt();
			if(index < 1 || index > 100)
			{
				//输入的索引超出范围时
				throw new ArrayIndexOutOfBoundsException("Out of Bounds");
			}
			else
			System.out.println(arr[index-1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of Bounds");
		}
		catch(Exception  e)
		{
			//输入的索引非数字时
			System.out.println("输入索引有误");
		}

	}


	public static void  init_array(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)Math.floor((Math.random() * 90) + 10.0);//范围[10,100)
		}
	}
}
