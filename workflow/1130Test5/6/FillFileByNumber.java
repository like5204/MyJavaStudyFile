import java.io.*;
import java.util.Scanner;

public class FillFileByNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//6. 创建一存储若干随机整数的文本文件， 文件名，整数的个数及范围均由键盘输入	
		System.out.print("请输入文件名: ");
		String fileName = sc.next();

		System.out.print("请输入整数的个数: ");
		int Numbers = sc.nextInt();

		System.out.print("请输入能取整数的最大值: ");
		int max = sc.nextInt();

		System.out.print("请输入能取整数的最小值: ");
		int min = sc.nextInt();

		
		NumberFile nf = new NumberFile(fileName, Numbers,max,min);
		nf.fill();

		System.out.println("填充"+fileName+"完成!!!");
	}
}

class NumberFile
{
	FileOutputStream  fos;
	String fileName;
	int numbers = 0;
	int max = 0;
	int min = 0;
	
	public NumberFile(String s, int n, int mx, int mn)
	{
		this.fileName = s;	
		this.numbers = n;
		this.max = mx;
		this.min = mn;
	}
	public boolean fill()
	{
		return openFiles() && Fill() && closeFiles();
	}
	private  boolean Fill()
	{
		//获取随机数，并进行填充
		boolean x = true;
		
		try
		{
			for(int i = 1; i <= this.numbers; i++)
			{
				int v = rand(min,max); 
				
				String s = v + "\t" + ((i%5==0)?"\n":"");
				fos.write(s.getBytes());
			}
		}
		catch(IOException e)
		{
			System.out.println("Problem Write: " + fileName);
			x = false;
		}	
		return x;

	}
	
	private boolean openFiles()
	{
		boolean x = true;
		try
		{
			fos = new FileOutputStream(fileName);
		}
		catch(IOException e)
		{
			System.out.println("Problem opening: " + fileName);
			x = false;
		}
		return x;
	}
	private boolean closeFiles()
	{
		boolean x = true;
		try
		{
			fos.flush();
			fos.close();
		}
		catch(IOException e)
		{
			System.out.println("Problem opening: " + fileName);
			x = false;
		}
		return x;	
	}

	private int rand(int mn, int mx)
	{
		//返回指定范围内的随机数
		return (int)(mn + Math.random() * (mx + 1 - mn));
	}
	
}
