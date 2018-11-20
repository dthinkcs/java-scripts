import java.io.*;
public class TestFile {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("E:\\value.txt"));
        String lines = "";
        
        String line; 
        while ((line = br.readLine()) != null)
        {
            lines = lines + (line + " ");
        }
        
        String[] words = lines.split(" ");
        for (String w: words)
        {
            System.out.println(w);
        }
    }
}
