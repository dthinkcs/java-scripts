
/**
 * Write a description of FiveSuperSecond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FiveSuperSecond {
    
    static void main()
    {
        A objAref = new B(10, 20);
        System.out.println("ref_type_A objAref.i (pointing to object B) == " + objAref.i);
        System.out.print("objAref.show() == "); objAref.show();
        
    }

}


class A {
    int i;
    
    void show(){}
}

class B extends A {
    int i; // this HIDES the i in A EVEN WITHOUT private
    
    B(int a, int b)
    {
        super.i = a;
        i = b; // this.i = b
    }
    
    void show () {
        System.out.println(this.i);
        System.out.println(super.i);
    }
}
