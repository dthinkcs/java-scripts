
/**
 * Write a description of NumberFormatEDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NumberFormatExceptionDemoWasBUGGY {
    public static void main(String[] args)
    {
        String name;
        int roll_no;
        try 
        {
            name = args[0];
            roll_no = Integer.parseInt(args[1]);
        }
        catch (Exception e)
        {
            System.out.println("Number format exception occurred! Roll No set to 1");
            roll_no = 1;
        }
        
        double[] marks = new double[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i  < 3;)
        {
            try
            {
                String input = sc.nextLine(); 
                // sc.nextDouble is giing INFINITE LOOP!!!!!! since NEXTDOUBLLE WILL always be AN EXCEPTION.Therefore you need two steps
                marks[i] = Double.parseDouble(input);
                i++;
            }
            catch (Exception e)
            {
                System.out.println(e);
                System.out.println("Retry!");
            }
        }
         //catch (Exception e)
        
        //{
        //     System.out.println("Number format exception occurred");       
        //}
        
   }
}
/*
class ExceptionDemo3
{
   public static void main(String args[])
   {
      try{
	 int num=Integer.parseInt ("XYZ") ;
	 System.out.println(num);
      }catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }
   }
}

*/

