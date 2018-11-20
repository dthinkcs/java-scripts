import java.util.*;
public class TestSUBS {
    public static void main(String[] args)
    {
        String s = (new Scanner(System.in)).nextLine();
        String sub1 = args[0];
        String sub2 = args[1];
        
        // second substring's count
        System.out.println(countIn(s, sub2));
        
        // replace
        System.out.println(s.replace(sub2, sub1));
        
    }
    
    static int countIn(String s, String sub)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            int currIdxSub = s.indexOf(sub, i);
            if (currIdxSub == -1)
                break;
            count++;
            i = currIdxSub + 1;
          
        }
        
        return count;
    }
}
