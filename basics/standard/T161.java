
public class T161 {
    // {"10", "50", "52", "25", "67", "41", "44", "46"}
    public static void main(String[] args)
    {
        int startingIndex = -1;
        for (int i = 0; i < args.length; i++)
        {
            int num = Integer.parseInt(args[i]);
            if (num % 2 != 0)
            {
                if (startingIndex != -1)
                    System.out.println(" at starting index " + startingIndex);                    
                startingIndex = -1;
            }
            else
            {
                if (startingIndex == -1)
                    startingIndex = i;
                System.out.print(num + "\t"); 
           
            }
        }
        if (startingIndex != -1)
            System.out.println(" at starting index " + startingIndex);
    }
}
