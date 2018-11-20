import java.util.*;

class MyThread extends Thread 
{
	public void run()
	{
		setName("OldName");
		System.out.println("Started " + getName());
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		MyThread a = new MyThread();
		a.start();
		a.setName("NewName");
		System.out.println("New name is " + a.getName());	
	}
}