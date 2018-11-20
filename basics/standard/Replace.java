import java.util.*;

public class Replace
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    String one = s.nextLine();
    String two = s.nextLine();

    int a[] = new int[26];
    for(int i = 0; i < one.length(); i++)
      a[one.toLowerCase().charAt(i) - 'a']++;
    for(int i = 0; i < 26; i++)
      if(a[i] > 1) one = one.replace(String.valueOf((char)(i + 'a')), two);
    System.out.println(one);
  }
}
