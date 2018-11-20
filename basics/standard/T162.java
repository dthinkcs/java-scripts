import java.util.*;
public class T162 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLine();
            
        int sizeNew  = arr.length;   
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] != null)
                {
                    if (arr[i].equals(arr[j]))
                    {
                        arr[j] = null;
                        sizeNew--;
                    }
                }
            }
        }
        
        String[] arr2 = new String[sizeNew];
        int k = 0;
        for (int i = 0; i < sizeNew; i++)
            if (arr[k] != null)
                arr2[i]  = arr[k++];
        
        arr = arr2;
        
        // count the number of palindromes
        int count = 0;
        for (String s: arr) 
            if (isPalindrome(s))
                count++;
                
        String[] arrNew = new String[count];
        int i = 0;
        for (String s: arr)
            if (isPaindrome(s))
                arrNew[i++] = s;
        
        sortAlpha(arrNew);
        
        // print
        for (String s: arr)
            System.out.print(s + "\t");
        System.out.println();
    }
    
    static void printArr(String[] arr)
    {
        for (String s: arr)
            System.out.print(s + "\t");
        System.out.println();
    }
    
    static boolean isPalindrome(String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
        
    static void sortAlpha(String[] strArr)
    {
        for (int i = 0; i < strArr.length - 1; i++)
            for (int j = i + 1; j < strArr.length; j++)
                if (strArr[j].compareTo(strArr[i]) < 0)
                {
                    String tmp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = tmp;
                }
    }
}
