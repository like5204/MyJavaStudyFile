import java.io.*;
class Student
{
	String name;
	int age;
	String bj;
	String pwd;
	String fileName;
	FileInputStream fis;
	FileOutputStream fos;
	boolean flag = true;

	public Student(String n, int a, String b, String p, String f)
	{
		name = n;
		age = (a >= 0 && a <= 130)?a:0;
		bj = b;
		pwd = p;
		fileName = f;
	}
	

	public void Write_()
	{
		String s = "";
		if(new File(fileName).exists())
		{
			//写数据时，判断文件是否存在且是否有数据，
			//将已有的数据读出来与将写的数据拼接一起写入
			s += Read_();
		}
		s = s + name + ";" + age + ";" + bj + ";" + "\n";

		flag = true;
		openFile();
		try
		{
			fos.write(s.getBytes());
		}
		catch(IOException e)
		{
			System.out.println("Write file error");
		}
		closeFile();
	}
	public String Read_()
	{
		String s1 = "";
		flag = false;
		openFile();
		try
		{
			//读取时，可能涉及中文，所以一次将所有字节读出
			byte[] buffer = new byte[fis.available()];
			
			fis.read(buffer);

			s1 = new String(buffer);

		}
		catch(IOException e)
		{
			System.out.println("Read file error");

		}
		closeFile();

		return s1;
	}

	
	private void openFile()
	{
		if(flag)
		{
			//为true时，初始化fos
			try
			{
				
				fos = new FileOutputStream(fileName);
				
			}
			catch(IOException e)
			{
				System.out.println("Open file error with fos");
			}
		}
		else
		{
			try
			{
				fis = new FileInputStream(fileName);
			}
			catch(IOException e)
			{
				System.out.println("Open file error with fis");
			}
		}

	}

	private void closeFile()
	{
		if(flag)
		{
			//为true时，关闭fos
			try
			{
				fos.close();	
			}
			catch(IOException e)
			{
				System.out.println("Close file error with fos");
			}
		}
		else
		{
			try
			{
				fis.close();
			}
			catch(IOException e)
			{
				System.out.println("Close file error with fis");
			}
		}
		
	}

	
}
public class RWFile
{
	public static void main(String[] args)
	{
		Student s1 = new Student("lxl",18,"3-2","456","1.txt");
		Student s2 = new Student("张三",25,"9-2","123","1.txt");
		Student s3 = new Student("李四",100,"19-3","abc","1.txt");
		
		s1.Write_();
		s2.Write_();
		s3.Write_();

		System.out.print(s1.Read_());
	}
}
