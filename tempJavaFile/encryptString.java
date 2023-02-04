import java.util.Scanner;

public class encryptString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please need encrypt string: ");
		String s1 = sc.next();

		sc = new Scanner(System.in);
		System.out.print("Please need encrypt secret[1-127]: ");
		char s2 = (char)sc.nextInt();

		if(s1 != "")
		{
			System.out.println(encrypt(s1,s2));
		}
		else
		{
			System.out.println("String is empty");
		}
	}


	static String encrypt(String value, char secret)
	{
		byte[] bt = value.getBytes();
		
		for(int i = 0; i < bt.length; i++)
		{
			bt[i] = (byte)(bt[i] ^ secret);
		}

		String s1 = new String(bt,0,bt.length);

		return s1;

	}
}
