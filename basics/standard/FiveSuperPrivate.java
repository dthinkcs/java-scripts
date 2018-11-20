
/**
 * Write a description of FiveSuperSecond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FiveSuperPrivate {
    
    static void main()
    {
        B objAref = new B(10, 20);
        System.out.println("ref_type_B objAref.i (pointing to object B) == " + objAref.i);
        System.out.print("objAref.show() == "); objAref.show();
        
    }

}


class A {
    private int i;
   
    void show(){}
    
    int getI()
    {
        return i;
    }
    
    /*
    static void someMeth()
    {
    }
    */
}

class B extends A {
    int i; // this HIDES the i in A 
    
    B(int a, int b)
    {
        // super.i = a; // THIS CANNOT BE DONE but METHODS/constr CAN BE
        //super();
        i = b; // this.i = b
    }
    
    void show () {
        System.out.println(this.i);
        System.out.println(getI());
    }
    
    /* ERROR
     * must HAVE BEEN STATIC
    void someMeth()
    {
        
        
    }
    
    */
}
