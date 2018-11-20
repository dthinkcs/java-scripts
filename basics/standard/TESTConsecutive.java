//{"12","13", "1", "0", "2", "3" }
public class TESTConsecutive 
{
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length - 1 ; i++)
        {
            int num1 = Integer.parseInt(args[i]); // 12 <- "12"
            int num2 = Integer.parseInt(args[i + 1]);
            if (num2 - num1 == 1)
                System.out.println("Consecutive numbers occurred at index " + i + " and " + (i + 1) +  " and they are " + args[i] + " "+ args[i+1]);
        }
    }
}