
/**
 * Write a description of output here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class output {
public static void main()
{
 int arr[ ] = {0 , 1, 2, 3, 4, 5, 14, 7, 8, 20};
 int n = 9;
 int n1 = arr[n] / 2 ;
 n = arr[arr[n1] / 2];
 System.out.println("n1 " +n1);
 System.out.println(arr[n1] / 2);
}
}
