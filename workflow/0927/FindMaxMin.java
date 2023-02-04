import java.util.Scanner;
import java.util.Arrays;
public class FindMaxMin
{
	public static void main(String[] args)
	{
		System.out.print("Please enter 10 个数");
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++)
		{
			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();
			//输入十个数
		}
	
		int max=0;
		int min=0;
		for(int i = 0; i < arr.length; i++)
		{
			max = arr[i]>arr[max]?i:max;
			min = arr[i]<arr[min]?i:min;
		}
		
		System.out.print("Max is " + arr[max] + "Min is " + arr[min]);
		//Arrays.sort(arr);

		//System.out.print("Max is " + arr[arr.length-1] + "Min is " + arr[0]);
	}
}
