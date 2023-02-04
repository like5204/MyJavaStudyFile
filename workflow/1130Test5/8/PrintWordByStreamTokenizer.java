import java.io.*;

public class PrintWordByStreamTokenizer
{
	public static void main(String[] args)
	{
		try
		{
			//使用或覆盖了已过时的 API。注: 有关详细信息, 请使用 -Xlint:deprecation 重新编译。 javac -Xlint:deprecation PrintWordByStreamTokenizer.java;
			//编译时会警告该类已经过时.
			StreamTokenizer st = new StreamTokenizer(new FileInputStream("1.txt"));

			while(st.nextToken() != StreamTokenizer.TT_EOF)//当下一个token不等于末尾标记
			{	
				System.out.print(st.sval + " ");//sval字符串， nval浮点数,	
			}

		}
		catch(IOException e)
		{
			System.out.println("捕获IO错误");
		}
	}
}
