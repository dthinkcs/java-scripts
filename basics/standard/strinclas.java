
/**
 * Write a description of strinclas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class strinclas {
    public static void main()
    {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        String s22 = new String(s2);
        System.out.println(s1 == s22);
        
        char ch[] = {'H', 'e', 'l', 'l', 'o'};
        String s3 = new String(ch);
        System.out.println(s3);
        byte b[] = {65, 66, 67, 68, 69};
        String s4 = new String(b);
        System.out.println(s4);
        
        String s = "India is a good Country";
        System.out.println(s.substring(2));
        
        //System.out.print(s 
    }
}
