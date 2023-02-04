import java.util.Scanner;

public class testStringBuffer
{
	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer();
		
		for(int i = 0; i < 5; i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.printf("Please input %d course",i+1);

			String s = sc.next();

			if(s != "")
			{
				String flag = i==4?"":",";
				s1.append(s+flag);
			}
			else
			i--;
		}
		System.out.println(s1.capacity());
		System.out.println(s1);
	}
}
