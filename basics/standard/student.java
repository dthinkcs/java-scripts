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
public class student {
  String name;
String age;
int regno;

     student() {

           Scanner s=new Scanner(System.in); 
 
  System.out.println("age");
  age=s.nextLine();
 System.out.println("name");
name =s.nextLine();
         System.out.println("reg num");
       regno = s.nextInt();
    }
    
        public static void main(String args[])
    {
          Ug o=new Ug();
         // PG b=new PG();

    }
}
class Ug extends student{
 String semester;
 int fees;
Ug()
{
             
        System.out.println("sem");
         
  Scanner s=new Scanner(System.in); 
        semester = s.nextLine();
               System.out.println("fees");
 
        fees=s.nextInt();
}
}
class PG extends student{
 String semester;
 int fees;
PG()
{
             
        System.out.println("sem");
         
  Scanner s=new Scanner(System.in); 
        semester = s.nextLine();
               System.out.println("fees");
 
        fees=s.nextInt();
}
}
class a
{
    public static void main(String args[])
    {
          Ug o=new Ug();
         // PG b=new PG();

    }
}


