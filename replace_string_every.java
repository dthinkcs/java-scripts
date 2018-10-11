public class YourClassNameHere {
    public static void main(String[] args) {
      String s = "Missippi";
      int fq[] = new int[s.length()];
      for (int i = 0; i < s.length(); i++)
      {
        int c = 0;
        for (int j = 0; j < s.length(); j++)
          if (s.charAt(i) == s.charAt(j))
            c++;
        fq[i] = c;
      }
      //WRONG
      
      String s_rep = "kuta";
      /*
      String res = s;
      for (int i = 0; i < s.length(); i++)
        if (fq[i] >= 2)
        {
          String char_str = "" + s.charAt(i);
          res = res.replace(char_str, s_rep);
      
        }
      System.out.println(res);
      */
      String w = "";
      for (int i = 0; i < s.length(); i++)
      {
        if (fq[i] >= 2)
          w = w + s_rep;
        else
          w = w + s.charAt(i);
      }
      System.out.println(w);
    }
}
