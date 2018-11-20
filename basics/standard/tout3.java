
public class tout3 {
    public static void main()
    {
         String s1 = "Hello";
         String s2 = new String("Hello");
         String s3 = s2;
         System.out.println(s1.equals(s2)); // true
         System.out.println(s1 == s2); // false
        System.out.println(s1.endsWith(s3)); // true
        System.out.println(s1 == s3); // false
        byte b = (byte)258;
        System.out.println(b);
    }
}
