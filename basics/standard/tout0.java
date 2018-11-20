
public class tout0 {
    static String str = "s";
    // static ONLY refer to static stuff
    public static void main()
    {
        new B().changeStr(str);
        System.out.println(str);
    }
}

class B
{
    public void changeStr(String str)
    {
        str += 'e';
    }
}
