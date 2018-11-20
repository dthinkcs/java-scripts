import java.io.*;
import java.util.*;
public class TestTest2 {
    public static void main() throws IOException
    {
        String s = new Scanner(System.in).nextLine();
        
        FileOutputStream fos = new FileOutputStream("E:\\Test2.dat");
        fos.write(s.getBytes());
        fos.close();
        
        FileInputStream fin = new FileInputStream("E:\\Test2.dat");
        int x;
        while ( (x =  fin.read()) != -1)
            System.out.print((char)x);
    }
}
