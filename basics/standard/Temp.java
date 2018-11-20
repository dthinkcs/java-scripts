
/**
 * Write a description of Temp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Temp {
    int x = 10;
    void show (int x, Temp z)
    {
       System.out.println(x);
       System.out.println(z.x);
    }
    
    public static void main()
    {
        Temp t = new Temp();
        t.show(20, t);
    }
}
