
/**
 * Write a description of StringDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringDemo1 {
    public static void main(String args[])
    {
        StringMyAdder obj  = new StringMyAdder();
        try{
            System.out.println(obj.add(args[0], args[1]));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hey Bro Array oob!: 0x + 0y "  + e);
        }
    }
}

abstract class StringAdd
{
     abstract String add (String s1, String s2);
}

class StringMyAdder extends StringAdd
{
    String add(String s1, String s2)
    {

        int coeff1_1 = Integer.parseInt(s1.substring(0, s1.indexOf('x')));
        int coeff1_2 = Integer.parseInt(s1.substring(s1.indexOf('+')+1, s1.indexOf('y'))); 
        
        int coeff2_1 = Integer.parseInt(s2.substring(0, s2.indexOf('x')));
        int coeff2_2 = Integer.parseInt(s2.substring(s2.indexOf('+')+1, s2.indexOf('y'))); 
        
        return (coeff1_1+coeff2_1) + "x+" +  (coeff1_2+coeff2_2) + "y";
        
    }
    
    int coeff_first(String s1)
    {
        return Integer.parseInt(s1.substring(0, s1.indexOf('x')));
    }
}

