
public class StringsD2 {
    

    public static void main()
    {
        //sameCharSamePos("Hello", "Hola");
        sameChar("LOOKS", "ONLOOKS");
        
        System.out.println("Manipal".replace('a', 'o').replace('a', 'o')); 
    }

    static void sameCharSamePos(String s1, String s2)
    {
        for (int i = 0; i < min(s1.length(), s2.length()); i++)
            if (s1.charAt(i) == s2.charAt(i))
                System.out.print(s1.charAt(i));
        System.out.println();
    }
    
    static void sameChar(String s1, String s2)
    {
        int c = 0;
        for (int i = 0; i < s1.length(); i++)
        {
            for (int j = 0; j < s2.length(); j++)
            {
                if (s1.charAt(i) == s2.charAt(j))
                {
                    System.out.println(s1.charAt(i));
                    c++;
                    break;
                }
            }
        }
        System.out.println();
        System.out.println(c);
        
    }
    
    static int min(int a, int b)
    {
        return (a < b) ? a : b;
    }
}
