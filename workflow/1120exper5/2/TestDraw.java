//shape 修改为抽象类
public class TestDraw
{
	public static void main(String[] args)
	{
		Shape[] shapes = new Shape[3];

		shapes[0] = new Circle();
		shapes[1] = new Rect();
		shapes[2] = new Line();


		for(int i = 0; i < shapes.length; i++)
		{
			shapes[i].draw();
		}
	}
}




abstract class  Shape
{
	abstract public void draw();
	abstract public void drawFillColor(String color);
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing circle...");
	}

	public void drawFillColor(String color)
	{
		System.out.println("Drawing " + color + " circle...");
	}
}

class Rect extends Shape
{
	public void draw()
	{
		System.out.println("Drawing rect...");
	}
	public void drawFillColor(String color)
	{
		System.out.println("Drawing " + color + " rect...");
	}
}

class Line extends Shape
{
	public void draw()
	{
		System.out.println("Drawing line...");
	}
	public void drawFillColor(String color)
	{
		System.out.println("Drawing " + color + " line...");
	}
}
