public class TestCircle
{
	public static void main(String[] main)
	{
		Circle c1 = new Circle();//实例化一个Circle对象
		c1.radius = 50;//给radius赋值50
		System.out.println(c1.circumference());//调用对象方法计算周长

		Circle c2 = new Circle();
		c2.radius = 100;
		System.out.println(c2.circumference());


		
	}
}
