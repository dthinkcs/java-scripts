public class TestPattern 
{
    public static void main()
    {
        int k = 1;
        for (int i = 'A'; ; )
        {
            for (int j = 0; j < k; j++)
            {
                System.out.print((char)i + "\t");
                if (i == 'U')
                    return;
                if (j != k - 1)
                    i = i + 2;
                   
            }
            k++;
            System.out.println();
        }
    }
}
