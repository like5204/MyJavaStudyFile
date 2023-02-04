import java.util.Scanner;

public class CheckFilenameEmail
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		print("Please input filename: ");
		
		String fileName = input.next();

		input = new Scanner(System.in);
		print("Please input Email: ");
		
		String email = input.next();

		if(fileName!=""&&email!="")
		{
			int l = fileName.length();

			if(l>4&&fileName.lastIndexOf(".java")==l-5)
			{
				System.out.println("The filename ending is .java .");

				int start = email.indexOf("@");
				int end = email.indexOf(".");
				if(start!=-1&&end!=-1)
				{
					System.out.println("Email exit @ and . ");
					if(end > start)
					{
						System.out.println("Check Succes");
						return;
					}

				}
			
			}
		}

		System.out.println("Check Error");



	}

	static void  print(String a)
	{
		System.out.print(a);	
	}
	
}
