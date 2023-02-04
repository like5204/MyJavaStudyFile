import java.io.*;

public class TestReadWriteFileByBinary
{
	public static void main(String[] args)
	{
		//随机100个整数，写入二进制文件"Exercise.dat", 从文件中读取，每十个一行

		
		//DataOutputStream DataInputStream

		//writeInt, readInt

		//EOFException eof


		String fileName = "Exercise.dat";

		FileTool ft = new FileTool(fileName);
		ft.cal();


	}
}
class FileTool
{
	String fileName;
	DataOutputStream dos;
	DataInputStream dis;
	int s = 0;//标记写入的字节数
	boolean y;//标记写还是读
	
	public FileTool(String f)
	{
		//初始化文件名
		fileName = f;
	}

	public void  cal()
	{
		//组合该类中的其他方法
		y = true;//写!

		openFile();	

		for(int i = 0; i < 100; i++)
		{
			WriteData(rand(1,999));
		}
		
		s = dos.size();//存入写入文件的总字节数
		
		closeFile();

		y = false;//读

		openFile();

		readData();

		closeFile();

	}

	private void WriteData(int v)
	{
		try
		{
			dos.writeInt(v);
		}
		catch(IOException e)
		{
			System.out.println("写入数据时出现错误");
		}
	}
	private void readData()
	{
		boolean x = true;
		try
		{
			//按写入的总字节数来，输出
			int i = 0;
			while(i < s)
			{
				int temp = dis.readInt(); 
				i+=4;
				System.out.printf("%4d ",temp);
				if(i % 40 == 0)
				System.out.println();
			}
		}
		catch(IOException e)
		{
			System.out.println("Error in readData");
		}
	}
	private void  openFile()
	{
		//y为真时，以写入的方式打开文件，赋值dos
		//y为假时，以读取的方式打开文件，赋值dis
		if(y)
		{
			try
			{
				dos = new DataOutputStream(new FileOutputStream(fileName));
			}
			catch(IOException e)
			{
				System.out.println("准备写入 "+fileName+" 发生异常");
			}
		}
		else
		{
			try
			{
				dis = new DataInputStream(new FileInputStream(fileName));
			}
			catch(IOException e)
			{
				System.out.println("准备读取 "+fileName+" 发生异常");
			}
		}
	}
	private void  closeFile()
	{
		if(y)
		{
			try
			{
				dos.close();
			}
			catch(IOException e)
			{
				System.out.println("关闭dos 发生异常");
			}
			
		}
		else
		{
			try
			{
				dis.close();
			}
			catch(IOException e)
			{
				System.out.println("关闭dis 发生异常");
			}
		}

	}
	private int rand(int mn, int mx)
	{
		//返回指定范围内的随机数
		return (int)(mn + Math.random() * (mx + 1 - mn));
	}
}
