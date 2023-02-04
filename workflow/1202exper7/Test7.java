import java.io.*;

public class Test7
{
	public static void main(String[] args)
	{
		String fileName = "Exercise.dat";
		
		try
		{

			DataOutputStream dosm = new DataOutputStream(new FileOutputStream(fileName));

			for(int i = 0; i < 100; i++)
			{
				int t = (int)Math.floor((Math.random() * 90) + 10.0);//范围[10,100)
				
				try
				{
					dosm.writeInt(t);
				}
				catch(IOException e)
				{
					System.out.println("Error");
				}
			}

			dosm.close();
		}
		catch(IOException e)
		{
			System.out.println("发生错误");

		}
		try
		{

			DataInputStream dism = new DataInputStream(new FileInputStream(fileName));

			try
			{
				try
				{
					int i = 0;
					while(true)
					{
						i++;
						
						int t = dism.readInt();
						System.out.printf("%2d ",t);
		
						if(i % 10 == 0)
						System.out.println();
					}
				}
				catch(EOFException eof)
				{
					System.out.println("读取完毕!!!");
				}
			}
			catch(IOException e)
			{
				System.out.println("发生错误");
			}
		}
		catch(IOException e)
		{
			System.out.println("发生错误");

		}
		
	}
}
