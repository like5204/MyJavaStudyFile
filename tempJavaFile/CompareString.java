public class CompareString
{
	public static void main(String[] args)
	{
		String x = "A";
		String y = "a";

		int v1 = x.compareTo(y); // +
		int v2 = y.compareTo(x);

		System.out.printf("%d, %d",v1,v2);

	}
}
