import java.lang.Math;
import java.util.Arrays;

public class FindRandomMaxMin_8
{
	public static void main(String[] args)
	{	
		int[] nums = new int[100];

		for(int i = 0; i < nums.length; i++)
		{
			//随机100个数
			nums[i] = (int)Math.ceil(Math.random()*100);
		}

		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] >  50)
			{	
				System.out.println("一共有" + (nums.length-i) + "个数超过50");
				break;
			}
		}

		System.out.println("The max number is " + nums[nums.length-1]);
		System.out.println("The min number is " + nums[0]);




	}
}
