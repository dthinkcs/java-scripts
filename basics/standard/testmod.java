
public class testmod 
{
    public static void main()
    {
        double d = 20.5;
        double dist = d % 10;
        System.out.println(dist);
        dist = d % 10.5;
        System.out.println(dist);    // 20.5 - 10.5
        dist = d % 9.1;
        System.out.println(dist);    // 20.5 - 9.1 - 9.1 == 2.3
        System.out.println(7.5 % 2.5);
        //int a[][] = new int[][2];
        
    }
}

