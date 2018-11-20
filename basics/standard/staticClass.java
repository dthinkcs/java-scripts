
/**
 * Write a description of staticClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class staticClass {
    static int x;
    /*
    static
    {
        System.out.println("THIS IS ONLY WHEN first complied EXECUTED FIRST");

    }
    */
    
    static void main()
    {
        System.out.println("YOLO");
        //System.out.println(Anything.x);
    }
    
    static
    {
        System.out.println("THIS IS NOT REACHED EXECUTED FIRST");

    }
}

class Anything
{
    static int x = 0;
    static 
    {
        System.out.println("THIS IS ANOTHER STATIC BLOCK");
    }
   
}


