import java.io.*;
import java.util.StringTokenizer;

public class PrintWordByStringTokenizer
{
	public static void main(String[] args)
	{
		try
		{
			//使用FileInputStream读取文件中所有内容到字符串s中
			FileInputStream fis = new FileInputStream("1.txt");
			String s = "";

			int n = 0;
			while((n=fis.read()) != -1)
			{
				s += (char)n;
			}

			StringTokenizer st = new StringTokenizer(s);

			while(st.hasMoreTokens())
			{
				System.out.print(st.nextToken() + " ");
			}

			
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
	}
}
