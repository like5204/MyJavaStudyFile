//7   小明寒假出去旅游，有两个城市可选。为帮助小明决定去哪个程序，
//    请采用多线程技术，实现两个独立线程分别显示 10 次城市名，
//    每次显示后休眠一段时间（1000ms 以内）。
//    小明根据哪个先显示完毕，就决定去哪个城市旅游。

class A  extends Thread
{
	private String city;
	    
	public A(String c)
    	{
		this.city=c;
    	}
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(city);
			try 
			{
				//随机1000以内的时间
				int t = (int)Math.floor(Math.random()*1000)+1;
	    			Thread.sleep(t);
			}
			catch(InterruptedException e)
			{
	   			 e.printStackTrace();
			}
		}
		
	}
}



public class SelectCity
{
	public static void main(String[] args)
	{
		A a1 = new A("重庆");
		A a2 = new A("成都");

		a1.start();
		a2.start();
	}
}
