
/**
 * Write a description of test1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


    class A
    {
        int x = 100;
        
    }
    
    
    class B extends A
    {
        int x = 200;
    
    }
public class test2 {
    

    
    public static void main()
    {
        System.out.println((new B()).x);
    }
    
}
