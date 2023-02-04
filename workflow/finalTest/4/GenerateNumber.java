//4. 产生100个两位的随机整数，把它们写入数据文件“random.dat” 中。
//   然后从文件中读取这些整数，按照每行10 个数的格式显示在屏幕上。



import java.io.FileWriter;
import java.io.FileReader;

public class GenerateNumber
{
	public static void main(String[] args)
	{
		
		int i = 0;

		String file = "random.dat";

		try
		{
			FileWriter fw = new FileWriter(file);

			while(i < 100)
			{
				if(i % 10 == 0)
				fw.write("\n");

				int r = (int)Math.floor((Math.random()*90)+10);//10~99
				
				fw.write(r+" ");
				i++;
			}
			
			fw.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}


		System.out.println("写入完成，开始读取");

		try
		{
			FileReader fr = new FileReader(file);

			i = 0;
			
			char[] buff = new char[2];

			while((i = fr.read(buff, 0, 2)) != -1)
			{
				//每次读取两个字符
				System.out.print(new String(buff));
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}

}
