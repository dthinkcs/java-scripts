import java.util.Scanner;

class MenuOne
{
  String a;
  int n;
  MenuOne(String x)
  {
    //lowercase
    a = x;
    n = a.length();
    System.out.println("1. Check for Palindrome.");
    System.out.println("2. Sort Alphabetically.");
    System.out.println("3. Reverse.");
    System.out.println("4. Merge with reverse.");
    System.out.println("5. Exit.");
  }

  Boolean palindrome()
  {
    return a.toLowerCase().equals(new StringBuffer(a).reverse().toString().toLowerCase());
  }

  String alphabets()
  {
    int count[] = new int[26];
    for(int i = 0; i < n; i++)
    count[a.charAt(i) - 'a']++;

    StringBuilder sorted = new StringBuilder();
    for(int i = 0; i < 26 ; i++)
      for(int j = 0; j < count[i]; j++)
        sorted.append((char)(i + 'a'));

    return sorted.toString();
  }

  String reverse()
  {
    return new StringBuffer(a).reverse().toString();
  }

  String merge()
  {
    return new StringBuffer(a).append(reverse()).toString();
  }

}

public class MenuOneDemoBuggy
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    String x = s.nextLine();
    MenuOne p = new MenuOne(x);
    out:
    while(true)
    {
      int c = s.nextInt();
      switch(c)
      {
        case 1:
          System.out.println(p.palindrome() ? "Palindrome." : "Not Palindrome.");
          break;
        case 2:
          System.out.println(p.alphabets());
          break;
        case 3:
          System.out.println(p.reverse());
          break;
        case 4:
          System.out.println(p.merge());
          break;
        case 5:
          System.out.println("Exiting.");
          break out;
        default:
          System.out.println("Enter valid choice.");
      }
    }
  }
}
