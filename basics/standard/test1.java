
/**
 * Write a description of test1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test1 {
    public static void main()
    {
        int arr[] = {0, 1, 2, 3, 4,5,14,7,8,9};
        int n = 6;
        int n1 = arr[n]/2;
        n = arr[arr[n1]/2];
        System.out.println(n1); // 7
        System.out.println(arr[n1]/2);//3
    }
    
}
