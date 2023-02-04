// 2.设计一个Shape接口和它的两个实现类Square和Circle
//   要求如下：
//   Shape接口中有一个抽象方法area()，用于计算几何图形的面积，返回一个double类型的结果。
//   Square和Cirele中实现了Shape接口的area()抽象方法，分别求正方形和圆形的面积并返回值




interface Shape
{
	double area();
}

class Square implements Shape
{
	double height, width;
	public Square(double h, double w)
	{
		height = h;
		width = w;
	}

	public double area()
	{
		return height*width;
	}
}

class Circle implements Shape
{
	final double PI = 3.1415926;

	double r;

	public Circle(double r)
	{
		this.r = r;
	}

	public double area()
	{
		return (PI * r) * (PI * r);
	}
}

public class TestShape
{
	public static void main(String[] args)
	{
		Square s1 = new Square(10,5);
		Circle c1 = new Circle(4);

		System.out.println("Square area is: " + s1.area());
		System.out.println("Circle area is: " + c1.area());
	}
}


