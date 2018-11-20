
/**
 * Write a description of HiProPri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiProPri {
    public static void main(String args[])
    {
        Clicker hi = new Clicker(7);
        Clicker lo = new Clicker(3);
        hi.t.start();
        lo.t.start();
        try 
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        
        lo.stop();
        hi.stop();
        try
        {
            hi.t.join();
            lo.t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("InterruptedException caught");
        }
        
        System.out.println("Low-priority thread!" + lo.click);
        System.out.println("High-priority thread");
    }
}

class Clicker implements Runnable {
    int click = 0;
    Thread t;
    boolean running = true;
    public Clicker(int p) {
        t = new Thread(this);
        t.setPriority(p);
        
    }
    
    public void run() {
        while (running)
        {
            click++;
        }
    }
    
    public void stop() {
        running = false;
    }
  
}
