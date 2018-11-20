class test4
{
    static void calc(float f, double d)
    {
        System.out.println("V1");
    }
    static void calc(double f, float d)
    {
        System.out.println("V2");
    }
    static void calc(double f, double d)
    {
        System.out.println("V3");
    }
    public static void main()
    {
        //calc(5, 6);
        calc(5.0, 6.0);
    }
}