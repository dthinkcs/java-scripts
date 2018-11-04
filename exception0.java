
package longthread;
import java.io.*;
public class LongThread {
    

    public static void main(String[] args) throws Exception {
        
        try 
        {
          for (int i = 0; i < args.length; i++)
            if(Integer.parseInt(args[i]) < 10)
                throw new MyException();
        }
        catch (MyException e)
        {
            System.out.println(e);
            return;
        }
          
        ChildThread obj = new ChildThread(args); 
        obj.t.join();
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
        
       
    }
    
}

class ChildThread implements Runnable
{
    Thread t;
    String[] arr;
    ChildThread (String[] a)
    {
        arr = a;
        t = new Thread(this);
        t.start();
     
    }
    
    public void run()
    {
        Child1 t1 = new Child1(arr);
        try {t1.t.join();} catch(Exception e){};
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println();
        Child2 t2 = new Child2(arr);
        
        try {t2.t.join();} catch(Exception e){};
                

    }
}

class Child1 implements Runnable
{
    Thread t;
    String[] arr;
    Child1 (String[] a)
    {
        arr = a;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        for (int i = 0; i < arr.length; i += 2)
            arr[i] = arr[i] + (Integer.parseInt(arr[i]) / 2);
    }
}
    
    
class Child2 implements Runnable
{
    Thread t;
    String[] arr;
    Child2 (String[] a)
    {
        arr = a;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length ; j++)
                if (Long.parseLong(arr[j]) < Long.parseLong(arr[i]))
                {
                     String temp = arr[j];
                     arr[j] = arr[i];
                     arr[i] = temp;
                }
        }
    }
}
    
class MyException extends Exception
{
    public String toString () 
    {
        return "Input Less than 10";
    }
}
