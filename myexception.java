package Pack3;

import Pack1.*;
import Pack2.*;
import java.util.Scanner;
/**
 * exception example
 */
public class Test
{
  public static void main()
  {
    Scanner sc = new Scanner(System.in);

    int marks[] = new int[5];
    for (int i = 0; i < 5; i++)
    {
      try
      {
        int n = sc.nextInt();
        if (n < 0)
          throw new NegativeNumberException();
        else if (n > 100) 
          throw new OutOfRangeException();
        marks[i] = n;
      }
      catch(NegativeNumberException e)
      {
        System.out.println(e);
        i--;
      }
      catch (OutOfRangeException e)
      {
        System.out.println(e);  
        i--;
      }      
    }
  }
}
