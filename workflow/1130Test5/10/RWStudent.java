import java.io.*;
class Student
{
	ObjectOutputStream oos;
	ObjectInputStream ois;
	public String name;
	String fileName;
	int age;
	boolean flag;

	public Student(String n, int a, String f)
	{
		this.flag=true;
		this.name = n;
		this.age = a;
		fileName = f;
	}
	public void WriteObj()
	{
		flag = true;

		openFile();

		try
		{
			oos.writeObject(this);
		}
		catch(IOException e)
		{

		}
		finally
		{
			closeFile();
		}
	}

	public void ReadObj()
	{
		flag = false;
		openFile();

		try
		{
			Student s = (Student) ois.readObject();
			System.out.println(s.name);
		}
		catch(IOException e)
		{
			System.out.println("IOEx" + e.getMessage());
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println("not found");

		}
		closeFile();
	}
	private void openFile()
	{
		if(flag)
		{
			try
			{
				FileOutputStream fos = new FileOutputStream(fileName);
				oos = new ObjectOutputStream(fos);
			}
			catch(IOException e)
			{
			
			}
		}
		else
		{
			
			try
			{
				FileInputStream fis = new FileInputStream(fileName);
				ois = new ObjectInputStream(fis);
			}
			catch(IOException e)
			{
			
			}
		}
	}

	private void closeFile()
	{
		if(flag)
		{
			
			try
			{
				oos.close();
			}
			catch(IOException e)
			{
			
			}
		}
		else
		{
			try
			{
				ois.close();
			}
			catch(IOException e)
			{
			
			}
		}
	}

}
public class RWStudent
{
	public static void main(String[] args)
	{
		Student s1 = new Student("lxl",16,"1.txt");
		s1.WriteObj();
		s1.ReadObj();
	}
}
