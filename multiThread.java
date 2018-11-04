/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myass;
import java.io.*;
class fibthread implements Runnable{
Thread t;
fibthread (){
t = new Thread(this,"fibo");
t.start();
}
void dispFib()
{
    int a = 0;
    int b = 1; 
    try {
        FileWriter fw = new FileWriter("D:\\fib.txt");
        
        while (a <= 10000)
        {
            // System.out.println(a + " ");
            fw.write(a + " ");
            int c = a + b;
            a = b; 
            b = c;
        }    
        
        fw.close();
    }
    catch (IOException e)
    {}
}
public void run (){
    dispFib();

  }
}
class prime implements Runnable{
Thread t ;
prime ()
{ t = new Thread (this,"prime");
    t.start();
}
public void run (){
dispprime();
}
void dispprime(){
    
    try
    {
        FileWriter fw = new FileWriter("D:\\primes.txt");
        for(int i =2;i<=1000;i++)
        {
            int n=i;int c =0;
            for(int j =2;j<n;j++){
                if(n%j==0)
                  c++;
            }
            if (c==0){
                fw.write(n + " ");
            }
        }
        
        fw.close();
    }
    catch (IOException e)
    {}
}}

/**
 *
 * @author Shubham Das
 */
public class Myass {

    
    public static void main(String[] args) throws Exception
    {
     fibthread ob = new fibthread(); 
     try{
        ob.t.join();}
     catch (Exception e){}
     
     prime ob1= new prime();
     try{
        ob1.t.join();}
     catch (Exception e){}
     
     String[] primes = new BufferedReader(new FileReader("D:\\primes.txt")).readLine().split(" ");
     String[] fibs  = new BufferedReader(new FileReader("D:\\fib.txt")).readLine().split(" ");
     
     for (int i = 0; i < primes.length; i++)
     {
         String prime = primes[i];
         for (int j = 0; j < fibs.length; j++)
         {
             String fib = fibs[j];
             if (prime.equals(fib))
                 System.out.println(prime);
         }
     }
    }
    
}
