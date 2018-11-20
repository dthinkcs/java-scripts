public class TestCaught {
    public static void main()
    {
        try
        {
            int a = 5 / 0;
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
        
        }
        catch(NullPointerException e2)
        {
        
        }
        catch(ArithmeticException e3)
        {
            throw e3;
        }
        finally
        {
            System.out.println("statement 5");
        }
        System.out.println("statement 4");
    }
}
