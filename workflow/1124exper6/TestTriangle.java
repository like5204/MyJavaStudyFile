import java.util.Scanner;
public class TestTriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[3];	

		for(int i = 0; i < arr.length;i++)
		{
			System.out.print("请输入第"+(i+1)+"个值: ");
			double v = sc.nextDouble();
			arr[i] = v;
		}

		
		try
		{
			Triangle t = new Triangle(arr[0],arr[1],arr[2]);
			System.out.printf("%4.2f",t.calArea());
		}
		catch(Exception e)
		{
			System.out.println("发送错误:" + e.getMessage());
		}
	}
}


class Triangle
{
	private double a,b,c;//三角形的长
	

	public Triangle(double x, double y, double z) throws Exception//声明该方法中可能发生的异常，交由上级调用程序去处理
	{
		if((x + y) > z && (x + z) > y && (z + y)>x)
		{
			this.a = x;
			this.b = y;
			this.c = z;
		}
		else
		{
			throw new Exception("输入的三条边不能构成三角形");
		}
	}

	public double calArea()
	{
		
		double p = 0.5 *(this.a + this.b + this.c);
		
		double s = Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c)); //计算面积

		return s;
	}

}
