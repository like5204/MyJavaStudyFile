import java.util.Arrays;
public class ArrayFill
{
	public static void main(String[] args)
	{
		//Array.fill
		final int SIZE = 5;

		int[] a = new int[SIZE];

		for(int i = 0; i < SIZE; i++)
		{
			Arrays.fill(a,i);
			System.out.println("Current i is " + i + " value is " + a[i]);
		}

	}
}
