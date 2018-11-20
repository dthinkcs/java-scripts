
/**
 * Write a description of packageDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringsD4 {
    public static void main()
    {
        Letterman obj = new Letterman();
        System.out.println(obj.isLetterDigit("Black Panther"));
        System.out.println(obj.isLetterDigit("Avengers4"));
        System.out.println(obj.isLetterDigit("Avengers Infity War"));
    }
}

interface GivenInterface {
    boolean isLetterDigit(String s);
    void exceptionMeth(int index);
}

class Letterman implements GivenInterface {
    public boolean isLetterDigit(String s)
    {
        return (Character.isLetter(s.charAt(0)) && Character.isDigit(s.charAt(s.length()-1)));
    }
    
    public void exceptionMeth(int index) {
        
       int arr[] = {10, 20, 30};
       try
       {
           System.out.println(arr[index]);
           try 
           {
               int c = 10 / index;
           }
           catch (ArithmeticException e)
           {
               System.out.println("Division by zero");
           }
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println("Array index oob: " + e);
       }
    }
}