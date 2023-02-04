import java.util.Scanner;
import java.util.Arrays;

public class FindMaxMin_6
{
	public static void main(String[] args)
	{
		Scanner  sc = new Scanner(System.in);

		System.out.println("请按照提示输入三个数字，我会找出最大与最小");
		int[] nums = new int[3];

		for(int i = 0; i < 3; i++)
		{
			System.out.print("Please input " + (i+1) + "个数");
			nums[i] = sc.nextInt();
		}
		
		//case 1
		//int max = 0;
		//int min = 0;

		//for(int i = 0; i < nums.length; i++)
		//{
		//	max = nums[i] > nums[max]?i:max;
		//	min = nums[i] < nums[min]?i:min;
		//}

		//System.out.println("The number max is " + nums[max]);
		//System.out.println("The number min is " + nums[min]);


		//case 2

		Arrays.sort(nums);
		System.out.println("The number max is " + nums[nums.length-1]);
		System.out.println("The number min is " + nums[0]);

		
	}
}
