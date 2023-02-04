import java.util.Scanner;
import java.lang.Math;

public class GuessNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//显示开始界面， 提示输入， 交互， 判断结果大小， 设置次数？
		System.out.println("欢迎进入猜数游戏。您有7次机会！");
		int sum = 7;
		int v = -1;
		int t = (int)(Math.ceil(Math.random()*100));
		
		do
		{
			System.out.print("Please input your number[1-100]: ");
			v = sc.nextInt();
			sum--;//当此处为0时，为最后一次，有可能猜中;
			if(v == t)break;
			String s = v > t?"貌似数字大了一点":"小了，小了";
			System.out.println(s);

		}while(sum > 0); 
		if(sum >=  0 && v == t)System.out.println("恭喜您，在" + (7-sum) + "次中猜中数字!");
		else System.out.println("很遗憾， 您没能猜中数字"+t+" 再玩一次吧!");

	}
}
