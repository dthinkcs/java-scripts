class test6
{
    public static void main()
    {
        Float i1 = new Float(10);
        Double d1 = new Double(10.5);
        System.out.println(i1 + d1.toString());
        
        System.out.println(d1.toString() + i1 );
        
        System.out.println(d1.toString() + i1.toString());
        
        System.out.println(d1 + i1);
        
        System.out.println(1 + "2");
        System.out.println("1" + 2);
        
        System.out.println(1 + 2 + "3");
        System.out.println("1" + 2 + 3);
    }
}