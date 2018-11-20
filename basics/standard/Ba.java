/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.util.*;
/**
 *
 * @author STUDENT
 */
class bank{
    double bal;
    Scanner x=new Scanner(System.in);
    void input(){
         System.out.println("input");
         bal=x.nextInt();
   
    }
            
    void roi(){
       
    System.out.println("Rate of interest"+bal);
}
}
class SBI extends bank{

void roi(){
  System.out.println(bal);
  System.out.println("Rate of interest"+bal*0.08);
}
}
class ICICI extends bank{
   
    void roi(){
        System.out.println("Rate of interest"+bal*0.07);
        }
}
class AXIS extends bank{
 
    void roi(){
        System.out.println("Rate of interest"+bal*0.09);
        }
}
public class Ba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bank z= new bank();
         
        SBI a=new SBI();
        ICICI b=new ICICI();
        AXIS c=new AXIS();
        bank k;
        k=z;
        k.input();
        //k.roi();
        
        a.bal = b.bal = c.bal = k.bal;
        k=a;
        
        k.roi();
        k=b;
        //k.input();
        k.roi();
       
        k=c;
        k.roi();
        
        
        // TODO code application logic here
    }
    
}
