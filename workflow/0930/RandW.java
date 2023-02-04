import java.io.IOException;

public class RandW
{
	public static void main(String[] args)
	{
		System.out.println("Please enter character[enter \\r over]");	

		int c;
		try
		{

			c = System.in.read();
			while(c != '\r')
			{
				System.out.print((char)c);	
				c = System.in.read();
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

		System.out.println("over");
	}
}
