import java.util.*;

class One extends Thread 
{
	Print x;
	int m, n;
	One(Print a, int m, int n)
	{
		x = a;
		this.m = m;
		this.n = n;
	}
	public void run()
	{
		x.sayStuff(m);
		x.sayMoreStuff(n);
	}
}

class Print
{
	synchronized void sayStuff(int x)
	{
		for(int i = 1; i < 6; i++)
		{
			try
			{
				System.out.print(x * i + " ");
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}	
		}
	}

	void sayMoreStuff(int x)
	{
		synchronized(this)
		{
			for(int i = 1; i < 6; i++)
			{
				try
				{
					System.out.print(x * i + " ");
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
		Print obj = new Print();
		new One(obj,5,7).start();
		new One(obj,10,13).start();
	}
}