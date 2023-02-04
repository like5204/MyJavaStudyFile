import java.util.Scanner;
import java.io.*;

public class SortToChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入待排序的字母,(ex:abcdef): ");
		String s = sc.next();
		
		System.out.print("请输入存放未排序字符串的文件名: ");
		String s2 = sc.next();

		
		System.out.print("请输入存放排序字符串的文件名: ");
		String s3 = sc.next();

		FileTool ft = new FileTool(s,s2,s3);
		ft.cal();

	}
}

class FileTool
{
	FileOutputStream fos1;
	FileOutputStream fos2;

	String fileName1,fileName2;
	String targetStr;
	char[]  astr=null;	

	public FileTool(String v, String f1, String f2)
	{
		//初始化排序字符串，文件1，文件2，以及将排序字符串转字符数组存入astr里
		targetStr = v;
		fileName1 = f1;
		fileName2 = f2;
		astr = v.toCharArray();
	}
	
	public boolean cal()
	{
		//唯一公开方法
		return openFile() && saveToFile(fos1) && sort() && saveToFile(fos2); 
	}


	private  boolean saveToFile(FileOutputStream fos)
	{
		//根据传递的fos不同，写不同的文件(始终写入的astr字符数组)
		boolean x = true;
		try
		{
			byte[] bs =  new String(astr).getBytes();
			fos.write(bs);	
		}
		catch(IOException e)
		{
			System.out.println("Problem write string: ");
			x = false;
		}
		
		return x;
	}
	private boolean sort()
	{
		//对字符数组astr里的字符进行排序;
		System.out.print("这是排序后的字符串: ");
		for(int i = 0; i < astr.length; i++)
		{
			int min = i;
			for(int j = i+1; j < astr.length;j++)
			{
				if((int)astr[min]>(int)astr[j])
				min = j;
			}
			char temp = astr[i];
			astr[i] = astr[min];
			astr[min] = temp;
			
			System.out.print(astr[i]);
		}

		return true;	
	}

	private boolean openFile()
	{
		//打开两个文件
		boolean x = true;
		try
		{
			File f = new File(fileName1);
			File f2 = new File(fileName2);

			if(f.exists())f.delete();
			if(f2.exists())f2.delete();//文件存在则删除

			f.createNewFile();
			f2.createNewFile();//创建文件

			fos1 = new FileOutputStream(f);
			fos2 = new FileOutputStream(f2);
		}
		catch(IOException e)
		{
			System.out.println("Problem open File: " + fileName1 + fileName2);
			x = false;
		}
		return x;
	}

	private boolean closeFile()
	{
		//对两个文件进行关闭
		boolean x = true;	
		try
		{
			fos1.close();
			fos2.close();
		}
		catch(IOException e)
		{
			System.out.println("Problem close File: " + fileName1 + fileName2);
			x = false;
		}
		return x;
		
	}

}
