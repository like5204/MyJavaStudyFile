public class Circle
{
	static public final double PI = 3.1415926;//定义一个静态变量

	private int radius;
	
	public int getRadius()
	{
		return radius;
	}

	public void setRadius(int r)
	{
		radius = r;
	}

	public double circumference()
	{
		//定义计算周长方法，返回double类型
		return 2 * PI * radius;
	}
}
