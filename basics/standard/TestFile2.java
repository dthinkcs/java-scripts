import java.io.*;
public class TestFile2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("E:\\value.txt"));
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\valueOutput.txt"));
        
        String line; 
        int count = 0;
        while ( (line = br.readLine()) != null )
        {
            String[] numbersStr = line.split(" ");
            for (String numStr: numbersStr)
            {
                count++;
                if (count % 5 != 0)
                {
                    bw.write(numStr + " ");
                  
                }
                else
                {
                    long l = Long.parseLong(numStr);
                    if (l % 2 == 0)
                        bw.write("100 ");
                    else 
                        bw.write("101 ");
                }
                
            }
            bw.newLine();
        }
        
        br.close();
        bw.close();
        
    }
}
