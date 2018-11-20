
/**
 * Write a description of StringD3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringD3 {
    public static void main()
    {
        System.out.println(countFreq("My name is My name is My name name is ...Slim Shady!", "name"));
    }
    
    static int countFreq(String longtext, String subtext)
    {
        int LEN = longtext.length();
        int len = subtext.length();
        int count = 0;
        for (int i = 0; i < LEN - len; i++)
        {
            int j;
            for (j = 0; j < len; j++)
                if (longtext.charAt(i+j) != subtext.charAt(j))
                    break;
            
            if (j == len)
            {
                count++;
                j = 0;
            }
        }
        return count;
    }
}
