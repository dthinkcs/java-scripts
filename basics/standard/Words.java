import java.util.*;

class Words
{
  public static void main(String[] args)
  {
    Function f = new Function();
    f.generate(args[0],"",new ArrayList<String>());
    System.out.println(f.i + " words printed.");
  }
}

class Function
{
  static int i = 0;
  void generate(String x, String y, ArrayList<String> memo)
  {
    if(y.length() == 3 && !memo.contains(y))
    {
      System.out.println(y);
      memo.add(y);
      i++;
    }

    else for(int i = 0; i < x.length(); i++)
        generate(x.substring(0,i) + x.substring(i + 1), y + x.charAt(i), memo);
  }
}
