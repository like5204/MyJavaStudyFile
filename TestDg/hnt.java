public class hnt
{
	public static void main(String[] args)
	{
		// cal hnt
		cal(3,'a','b','c');//a柱子上的盘子借助b移动到c柱子
	}

	static public void cal(int n,char x, char y, char z)
	{
		if(n == 1)
		{
			System.out.println(x + " ==> " + z);
		}
		else
		{
			cal(n-1,'a','c','b');
			System.out.println(x+"==>"+z);
			cal(n-1,'b','a','c');
		}
	}
}
