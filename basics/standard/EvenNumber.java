class EvenNumberException extends Exception
{
  EvenNumberException()
  {
    System.out.println("EVEN.");
  }
}

class EvenNumber
{
  public static void main(String[] args)
  {
    String s = args[0];
    try
    {
      if(Integer.parseInt(s) % 2 == 0)
        throw new EvenNumberException();
      else System.out.println("Odd.");
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
