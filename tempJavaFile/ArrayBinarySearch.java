import java.util.Arrays;
public class ArrayBinarySearch
{
	public static void main(String[] args)
	{
		double[] a = {12.4,56.2,32.1,100,78.1,99.9,101.1};

		Arrays.sort(a);

		int l1 = Arrays.binarySearch(a, 100);

		int l2 = Arrays.binarySearch(a, 2,6,12.4);


		System.out.println("100 in Array a: " + l1);
		System.out.println("12.4 in Array a: " + l2);
	}
}
