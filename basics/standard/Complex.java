/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.util.Scanner;
/**
 *
 * @author STUDENT
 */
class Complex
{
    double re;
    double im;

    Complex()
    {
        re = im = 0;
    }
    
    Complex(int re, int im)
    {
        this.re = re;
        this.im = im;
    }
    
    void add(int a, Complex b)
    {
        this.re += a + b.re; 
        this.im += b.im;
    }
    
    void add(Complex a, Complex b)
    {
        this.re += a.re + b.re; 
        this.im += a.im + b.im;
    }
    

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int re1 = sc.nextInt();
        int im1 = sc.nextInt();
        Complex comp1 = new Complex(re1, im1);
        
        int re2 = sc.nextInt();
        int im2 = sc.nextInt();
        Complex comp2 = new Complex(re2, im2);
        
        Complex comp3 = new Complex();
        comp3.add(comp1, comp2);
        System.out.println(comp3.re + " "  + comp3.im + "i");
        
        int n = sc.nextInt();
        comp3.add(n, comp3);
        System.out.println(comp3.re + " " + comp3.im + "i");

    }
}

