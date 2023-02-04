//(1）设计一个学生类Student和它的一个子类Undergraduate,
//    要求如下:Student类有name(姓名)和age(年龄)属性
//    一个包含两个参数的构造方法，用于给name和age属性赋值，一个show()方法打印Student的属性信息。

//（2）本科生类Undergraduate增加一个degree(学位)属性。
//     有一个包含三个参数的构造方法，前两个参数用于给继承的name和age属性赋值，
//     第三个参数给degree专业赋值，一个show()方法用于打印Undergraduate的属性信息。

//（3）在测试类中分别创建Student对象和Undergraduate对象，调用它们的show()。

class Student
{
	String name;
	int age;

	public Student(String n, int a)
	{
		name = n;
		age = a;
	}

	public void show()
	{
		System.out.println("My name is " + name + " my age is " + age);
	}
}

class Undergraduate extends Student
{
	String degree;

	public Undergraduate(String n, int a, String d)
	{
		super(n,a);
		degree = d;
	}

	public void show()
	{
		super.show();
		System.out.println("My degree is " + degree);
	}
}

public class TestClass
{
	public static void main(String[] args)
	{
		Student s1 = new Student("lxl",22);
		Undergraduate u1 = new Undergraduate("xz",18,"本科");

		s1.show();

		u1.show();
	}
}



