public class ThreadSleepTester
{
	public static void main(String[] args)
	{
		TestThread thread1 = new TestThread("线程1");
		TestThread thread2 = new TestThread("线程2");
		TestThread thread3 = new TestThread("线程3");

		System.out.println("3个线程启动");

		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println("3个线程结束");
	}
}

class TestThread extends Thread
{
	private int sleepTime;

	public TestThread(String name)
	{
		super(name);
		sleepTime = (int) (Math.random() * 6000);
	}

	@Override
	public void run()
	{
		try
		{
			System.out.println(getName() + " going to sleep for " + sleepTime);
			Thread.sleep(sleepTime);
		}
		catch(InterruptedException exception)
		{
		}
		System.out.println(getName() + " finished");
	}
}
