import java.io.*;

class CopyMaker
{
	//复制类
	String sourceName, destName;
	FileInputStream fis;
	FileOutputStream fos;
	

	private boolean openFiles()
	{
		boolean x = true;
		try
		{
			fis = new FileInputStream(sourceName);
		}
		catch(IOException e)
		{
			System.out.println("Problem opening " + sourceName);
			x = false;
		}

		try
		{
			fos = new FileOutputStream(destName);
		}
		catch(IOException e)
		{
			System.out.println("Problem opening " + destName);
			x = false;
		}

		return x;
	}
	
	private boolean copyFiles()
	{
		boolean x = true;
		byte byteData;
		try
		{
			//每次读取一个字节，写入目标文件流中
			while((byteData=(byte) fis.read()) != -1)
			{
				fos.write(byteData);
			}
		}
		catch(IOException e)
		{
			System.out.println("Problem reading or writing");
			x = false;
		}
		return true;
	}

	private boolean closeFiles()
	{
		boolean x = true;
		try
		{
			fis.close();
		}
		catch(IOException e)
		{
			System.out.println("Problem closing " + sourceName);
			x = false;
		}

		try
		{
			fos.flush();
			fos.close();
		}
		catch(IOException e)
		{
			System.out.println("Problem closing " + destName);
			x = false;
		}
		return x;

	}

	public boolean copy(String src, String dest)
	{
		sourceName = src;
		destName = dest;

		return openFiles() &&  copyFiles() && closeFiles();
	}

}
public class FileCopy
{
	public static void main(String[] args)
	{
		if(args.length == 2)
		{
			new CopyMaker().copy(args[0],args[1]);
		}
		else
		{
			System.out.println("Please enter two file path");
		}
	}
}
