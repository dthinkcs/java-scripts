import java.io.*;
import java.util.*;
public class TestPRIMES 
{
    // String[] args =  {1, 2, 3, 4, 5};
    public static void main(String args[])
    {
        int counter = 0;
        for (int i = 1; i <= 50; i++)
        {
            if (isPrime(i))
            {
                System.out.print(((i % 3 == 1) ? "Good": i) + "\t");
                counter = (counter + 1) % 5;
            }
            if (counter == 0)
                System.out.println();
        }
    }
    
    
    
    static boolean isPrime(int n)
    {
        if (n == 1)
            return false;
            
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0)
                return false;
                
        
        return true;
    }
    
   
}
