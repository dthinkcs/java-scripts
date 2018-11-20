import java.util.*;
import java.io.*;
import java.text.*;
public class TESTJ {
    static void printMatrix(String[][] strM)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(strM[i][j] + "\t");
          
            }
            System.out.println();
        }
    }
    
    public static void main() throws Exception
    {
        String[][] strMat = new String[3][3];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                strMat[i][j] = sc.nextLine();
            }
        }
        
        printMatrix(strMat);
        
        // sort the 0 and 2 columns
        EvenThread evenThread = new EvenThread(strMat);
        evenThread.start();
        try{
            evenThread.join();
        }
        catch(Exception e){}
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\answer.txt"));
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                bw.write(strMat[i][j] + " ");
            }
            bw.newLine();
        }
        bw.close();
    }
    

}

class EvenThread extends Thread
{
    String[][] strMat;
    
    EvenThread(String[][] strMat)
    {
        this.strMat = strMat;
    }
    
    public void run()
    {
        String[] sArr1 = new String[3];
        String[] sArr2 = new String[3];
        
        for (int i = 0; i < 3; i++)
            sArr1[i] = strMat[i][0];
            
        for (int i = 0; i < 3; i++)
            sArr2[i] = strMat[i][2];
            
        Arrays.sort(sArr1);
        Arrays.sort(sArr2);
        
        for (int i = 0; i < 3; i++)
            strMat[i][0] = sArr1[i];
            
        for (int i = 0; i < 3; i++)
            strMat[i][2] = sArr2[i];
    }
}
