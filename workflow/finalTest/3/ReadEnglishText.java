// 3. 从键盘上输入若干行的英文诗歌，写入一个文本文件“poems.txt 中
//    然后从文件中读取文本并输出到屏幕上。



import java.io.FileReader;
public class ReadEnglishText
{
	public static void main(String[] args)
	{
		
		String file = "poems.txt";
	

		try
		{
			FileReader fr = new FileReader(file);

			int i = 0;

			while((i = fr.read()) != -1)
			{
				System.out.print((char)i);
			}
			
			fr.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
}


}
