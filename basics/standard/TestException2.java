import java.io.*;
import java.util.*;
public class TestException2 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int number;
        for (int i = 0; i < 5; i++)
        {
            try
            {
                number = sc.nextInt();      
                if (number < 0)
                    throw new NegativeNumberException();
                arr[i] = number;
            }
            catch (NegativeNumberException e)
            {
                
                i--;
                
            }
        }
    }
}

class NegativeNumberException extends Exception
{
    public String toSting()
    {
        return "";
    }
}

class OutOfRangeException extends Exception
{
    public String toSting()
    {
        return "";
    }
} 


