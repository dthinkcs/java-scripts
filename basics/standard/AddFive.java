import java.util.*;
import java.io.*;

class AddFive
{
	public static void main(String[] args) 
	{
		File x = new File("C:/Users/ARVINDS-160953104/Desktop/Codes/oop-labs/lab-10");
		File[] list = x.listFiles();

		for(int i = 0; i < list.length; i++)
		{
			if(list[i].isFile()) System.out.println("File : " + list[i].getName());
			else if(list[i].isDirectory()) System.out.println("Directory : " + list[i].getName());
			else System.out.println("Error?");
		}		
	}
}