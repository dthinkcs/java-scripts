package massrecruiter;

/*
class CounterRunnable implements Runnable
{
    Thread t1;
    Thread t2;
    int count = 0;
    CounterRunnable()
    {
        t1 = new Thread(this, "demo1");
        t2 = new Thread(this, "demo2");
        t1.start();
        t2.start();
    }
    public void run(){
        for (int i = 0; i < 10000; i++)
            count++;
       
    }
    

    
}
*/

class CounterR implements Runnable
{
    int count = 0;
    public  void run(){
      
    }
    
    s
}
public class Massrecruiter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        CounterR c = new CounterR();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        
        t1.start();
        t2.start();
        
        Thread.sleep(1000);
        System.out.println(c.count);
    }
    
    // BOOKS into files
}
