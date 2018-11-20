import java.util.*;

class InputException extends Exception
{
  InputException()
  {
    System.out.println("Floating Point.");
  }
}

class Input
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int sum = 0;

    while(true)
    {
      int x;
      try
      {
        String n = s.next();
        x = Integer.parseInt(n);
      }
      catch(Exception e)
      {
        try
        {
          throw new InputException();
        }
        catch(InputException f)
        {
          System.out.println(f);
        }
        x = 0;
      }

      if(x == -1) break;
      else sum += x;
    }

    System.out.println(sum);
  }
}
