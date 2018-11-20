
public class TestPatt {
    public static void main()
    {
        int k = 'A';
        for (int i = 0; i <5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char)k + "\t");
                k += 2;
            }
            k -= 2;
            System.out.println();
        }
    }
}
