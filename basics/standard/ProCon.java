import java.util.*;

class Producer extends Thread
{
	Balance x;

	Producer(Balance b)
	{
		x = b;
	}

	public void run()
	{
		x.produce();
	}

}

class Consumer extends Thread
{
	Balance x;
	Consumer(Balance b)
	{
		x = b;
	}

	public void run()
	{
		x.consume();
	}

}

class Balance
{
	int i = 0;
	void produce()
	{
		while(true)
		{
			synchronized(this)
			{
				if(i == 10) 
				{
					try
					{
						wait();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
				System.out.print(i++ + " " );
				notify();
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
	void consume()
	{
		while(true)
		{
			synchronized(this)
			{
				if(i == 0) 
				{
					try
					{
						wait();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
				System.out.print(i-- + " " );
				notify();
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		Balance x = new Balance();
		new Producer(x).start();
		new Consumer(x).start();
	}
}