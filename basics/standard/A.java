
/**
 * Write a description of A here.
 * 
 * @author (your name) 
 * @override (a version number or a date)
 */
public class A {
    int x = 10;
    
    int returnX()
    {
        return x;
    }
    
    
    
    public static void main()
    {
        A objB = new B();
        System.out.println(objB.returnX());
    }

    

}

class B extends A
{
    
    int returnX()
    {
        return 20;
    }
    

}


