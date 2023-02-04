class Rect
{
	double width;
	double height;

	double getArea()
	{
		return width*height;
	}

	double getPerimeter()
	{
		return 2+(width+height);
	}
}

public class TestRect
{
	public static void main(String[] args)
	{
		Rect r1 = new Rect();
		r1.height = 40;
		r1.width = 4;
		
		System.out.println("Area is: " + r1.getArea());
		System.out.println("circumference  is: " + r1.getPerimeter());
		
		Rect r2 = new Rect();
		r2.height = 3.5;
		r2.width = 35.9;
		
		System.out.println("Area is: " + r2.getArea());
		System.out.println("circumference  is: " + r2.getPerimeter());
		
		

	}
}
