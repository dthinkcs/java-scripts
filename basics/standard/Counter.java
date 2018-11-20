
/**
 * Write a description of Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter {
    static int count = 0;
    Counter()
    {
        count++;
    }
    
    public static void main()
    {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        System.out.println(Counter.count);
        System.out.println();
                System.out.println(c1.count);
    }
}


