
/**
 * Write a description of HandleError here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class HandleBasicError {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            try
            {
                int a = sc.nextInt();
                int b = a / a;
            }
            catch (Exception e)
            {
                System.out.println("Division by Zero");
                int a = 0;
            }
        }
    }
}
