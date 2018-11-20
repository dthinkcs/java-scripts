import java.util.Scanner;

class Count
{
  int ch = 0;
  int words = 1;
  int vowels = 0;
  int lines = 0;
  Count(String a)
  {
    ch = a.length();
    for(int i = 1; i < ch; i++)
      if(a.charAt(i) == ' ' && (Character.isLetter(a.charAt(i - 1)) || a.charAt(i - 1) == '.'))
        words++;

    for(int i = 0; i < ch; i++)
    {
      char x = a.charAt(i);
      if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') vowels++;
      else if (x == '.') lines++;
      else continue;
    }
  }
}

public class CountDemoBuggy
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    Count c = new Count(s.nextLine());
    System.out.println(c.ch + " " + c.words + " " + c.vowels + " " + c.lines);
  }
}
