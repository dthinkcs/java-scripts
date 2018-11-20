import java.io.*;
import java.util.*;

public class TestException {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int score = -1;
        do{
            try 
            {
                System.out.println("Enter Score: ");
                score = sc.nextInt();
                if (score < 0)
                    throw new IncorrectScoreException();
            }
            catch (IncorrectScoreException e)
            {
                System.out.println(e);
            }
        } while (score < 0 );
        System.out.println(score);
    }
}

class IncorrectScoreException extends Exception
{
    public String toString()
    {
        return "Gand Phad Error";
    }
}
