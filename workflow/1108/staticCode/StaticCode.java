public class StaticCode{

	public static int  count = 0;

	{
		count++;
		System.out.println("非静态代码块 count="+count);
	}

	static{
		count++;
		System.out.println("静态代码块 count="+count);
	}

	static{
		count++;
		System.out.println("静态代码块 count="+count);
	}

	public static void main(String[] args)
	{
		System.out.println("-----StaticCode1 run-----");
		StaticCode sct1 = new StaticCode();
		System.out.println("-----StaticCode2 run-----");
		StaticCode sct2 = new StaticCode();

	}
}
