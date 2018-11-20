// {"59890", "99453", "47673", "48798", "66578", "99100", "34768", "871"}

public class T172 
{
    public static void main(String[] args)
    {
        try
        {
            if (args.length < 10)
                throw new MyException();
                
        }
        catch (MyException e)
        {
            System.out.println(e);
        }
        
        ChildThread c = new ChildThread(args);  
    }
}

class ChildThread
{
        
    ChildThread(String[] arr)
    {
        
        Thread1 t1 = new Thread1(arr);
        try
        {
            t1.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        print(arr);
        
        Thread2 t2 = new Thread2(arr);
        try
        {
            t2.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        print(arr);
    }
    
    static void print(String[] arr) 
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
    
}

class Thread1 implements Runnable
{
    Thread t;
    String[] arr;
    
    Thread1(String[] a)
    {
        arr = a;
        t = new Thread(this);
        t.start();
    }
    
    public void run()
    {
        for (int i = 0; i < arr.length - 1; i+= 2)
        {
            arr[i] = arr[i] + (Long.parseLong(arr[i]) / 2);
        }
    }
}

class Thread2 implements Runnable
{
    Thread t;
    String[] arr;
    
    Thread2(String[] a)
    {
        arr = a;
        t = new Thread(this);
        t.start();
    }
    
    public void run()
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (Long.parseLong(arr[j]) < Long.parseLong(arr[i]))
                {
                    String tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
    
    
}


class MyException extends Exception
{
    public String toString()
    {
        return "Input Less than 10";
    }
}




