public class duck_dg
{
	public static void main(String[] args)
	{
		//一个人赶着鸭子去每个村庄卖，每经过一个村子卖去所赶鸭子的一半又一只。这样他经过了七个村子后还剩两只鸭子，问他出发时共赶多少只鸭子？经过每个村子卖出多少只鸭子？
		System.out.println(fac(8));
	}

	public static int fac(int d)
	{
		if(d == 1)return 2;

		return (fac(d-1)+1)*2;
	}


}
