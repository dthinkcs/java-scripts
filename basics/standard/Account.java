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
class Account {
String name;
int accno;
String TOA;

Account(String name,int accno,String TOA)
{
      this.name=name;
      this.accno=accno;
      this.TOA=TOA;
}

    public static void main(String[] args) {
        
        String name;
int accno;
String TOA;
Scanner s=new Scanner(System.in);
System.out.println("enter acc type");
TOA=s.nextLine();

System.out.println("eneter name");
name=s.nextLine();
System.out.println("eneter accno");
accno=s.nextInt();

if(     TOA.equals("savings"))
{
    savings sa=new savings(name,accno,TOA);
    sa.bal();
    sa.deposint();
    sa.withdraw();
    //o.penality();
}
    else {
   curracc o=new curracc(name,accno,TOA);
    System.out.println("1");

   o.bal();
    o.deposint();
    o.withdraw();
    o.penality();
}}
    
}
  class curracc extends Account{
double bal=0;
double deposit;
        

    public curracc(String name, int accno, String TOA) {
        super(name, accno, TOA);

    }
    
    void bal()
    {
        System.out.println("enter desposit");
        Scanner s=new Scanner(System.in);
        deposit =s.nextDouble();

        bal=bal+deposit;    
System.out.println("final bal is"+bal);
}
    void deposint()
    {
        bal=bal+0.02*bal;
        
        System.out.println("after interest bal is"+bal);
    }
    
    void withdraw()
    {
        double withd;
                Scanner s=new Scanner(System.in);

            withd =s.nextDouble();
if(bal>=withd){
        bal=bal-withd;    
System.out.println("final bal is"+bal);
}
else
{
System.out.println("shortage of bal");

}       
    }
    void penality()
    {
        
     if(bal<1000)
         bal=bal-10;
         
    }
    
        public static void main(String[] args) {
        
        String name;
int accno;
String TOA;
Scanner s=new Scanner(System.in);
System.out.println("enter acc type");
TOA=s.nextLine();

System.out.println("eneter name");
name=s.nextLine();
System.out.println("eneter accno");
accno=s.nextInt();

if(     TOA.equals("saving"))
{
    savings sa=new savings(name,accno,TOA);
    sa.bal();
    sa.deposint();
    sa.withdraw();
    //o.penality();
}
    else {
   curracc o=new curracc(name,accno,TOA);
    System.out.println("1");

   o.bal();
    o.deposint();
    o.withdraw();
    o.penality();
}}
    
    }

class savings extends Account{
double bal=0;
double deposit;

    public savings(String name, int accno, String TOA) {
        super(name, accno, TOA);
    }
        
    
    void bal()
    {
        System.out.println("enter desposit");
        Scanner s=new Scanner(System.in);
        deposit =s.nextDouble();

        bal=bal+deposit;    
System.out.println("final bal is"+bal);
}
    void deposint()
    {
        bal=bal+0.02*bal;
        
        System.out.println("after interest bal is"+bal);
    }
    
    void withdraw()
    {
        double withd;
                Scanner s=new Scanner(System.in);

            withd =s.nextDouble();
if(bal>=withd){
        bal=bal-withd;    
System.out.println("final bal is"+bal);
}
else
{
System.out.println("shortage of bal");

}       
    }
    void penality()
    {
        
     if(bal<1000)
         bal=bal-10;
         
    }
    
        public static void main(String[] args) {
        
        String name;
int accno;
String TOA;
Scanner s=new Scanner(System.in);
System.out.println("enter acc type");
TOA=s.nextLine();

System.out.println("eneter name");
name=s.nextLine();
System.out.println("eneter accno");
accno=s.nextInt();

if(     TOA.equals("saving"))
{
    savings sa=new savings(name,accno,TOA);
    sa.bal();
    sa.deposint();
    sa.withdraw();
    //o.penality();
}
    else {
   curracc o=new curracc(name,accno,TOA);
    System.out.println("1");

   o.bal();
    o.deposint();
    o.withdraw();
    o.penality();
}}
    
    }
class d{
    public static void main(String[] args) {
        
        String name;
int accno;
String TOA;
Scanner s=new Scanner(System.in);
System.out.println("enter acc type");
TOA=s.nextLine();

System.out.println("eneter name");
name=s.nextLine();
System.out.println("eneter accno");
accno=s.nextInt();

if(     TOA.equals("saving"))
{
    savings sa=new savings(name,accno,TOA);
    sa.bal();
    sa.deposint();
    sa.withdraw();
    //o.penality();
}
    else {
   curracc o=new curracc(name,accno,TOA);
    System.out.println("1");

   o.bal();
    o.deposint();
    o.withdraw();
    o.penality();
}}
    
}
