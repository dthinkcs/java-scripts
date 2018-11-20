// A sample Java program to sort an array of integers 
// using Arrays.sort(). It by default sorts in 
// ascending order 
import java.util.*; 

public class TESTsort 
{ 
    public static void main(String[] args) 
    { 
        // Our arr contains 8 elements 
        String[] arr = {"Babool", "Chutiya", "Barber", "Alexander"}; 

        Arrays.sort(arr, Collections.reverseOrder()); 
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr)); 
        
        char[] chArr0 = arr[0].toCharArray();
        Arrays.sort(chArr0);
        arr[0] = new String(chArr0);
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr)); 

    } 
} 
