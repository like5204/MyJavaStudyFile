import java.io.*;

public class TestSpeed
{
	public static void main(String[] args)
	{
		//分别使用测试FileWriter 和 BufferedWriter往文件中写入10万个随机数，比较用时;

		System.out.println("不使用Buffer的时间是: "+new TestFileWrite().test());
		System.out.println("使用Buffer的时间是: "+ new TestBufferWrite().test());
	}
}

class TestBufferWrite
{
	public long test()
	{
		
		long start = System.currentTimeMillis();
		try
		{
			FileWriter fw = new FileWriter("1.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			for(int i = 0; i < 100000; i++)
			{
				bw.write(i+"");
				bw.newLine();
			}
			bw.flush();
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
		
		long end = System.currentTimeMillis();

		return end-start;
	}
}

class TestFileWrite
{
	public long test()
	{
		long start = System.currentTimeMillis();
		try
		{
			FileWriter fw = new FileWriter("2.txt");
			
			for(int i = 0; i < 100000; i++)
			{
				fw.write(i+"\n");
			}

			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}

		long end = System.currentTimeMillis();

		return end-start;
	}
}
