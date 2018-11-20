import java.util.*;

class Five extends Thread
{
	public void run()
	{
		for(int i = 1; i < 11; i++)
			System.out.println("5 x " + i + " = " + 5 * i);
	}
}

class Seven extends Thread
{
	public void run()
	{
		for(int i = 1; i < 11; i++)
			System.out.println("7 x " + i + " = " + 7 * i);
	}
}

class Thirteen extends Thread
{
	public void run()
	{
		for(int i = 1; i < 11; i++)
			System.out.println("13 x " + i + " = " + 13 * i);
	}
}

public class TablesDemo
{
	public static void main(String[] args) 
	{
		new Five().start();
		new Seven().start();
		new Thirteen().start();		
	}
}