/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author STUDENT
 */
import java.util.Scanner;
public class Box {

    double width;
    double height;
    double depth;
    
    Box (double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    
    double getVolume() 
    {
        return width * height * depth;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Box mybox = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(mybox.getVolume());
    }
}
