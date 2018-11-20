
/**
 * Write a description of Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Employee {
    String name;
    String city;
    double basic;
    double da;
    double hra;
    double total;
    
    Employee()
    {
        name = "";
        city = "";
        basic = 0;
        da = 0;
        hra = 0;
        total = 0;
    }
    
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("City: ");
        city = sc.nextLine();
        System.out.println("Basic Salary: ");
        basic = sc.nextDouble();
        System.out.println("DA%: ");
        da = sc.nextDouble();
        System.out.println("HRA%: ");
        hra = sc.nextDouble();
    }
    
    void calculate()
    {
        total = basic + basic * da / 100 + basic * hra / 100;
    }
    
    void display()
    {
        System.out.println("Total Salary: " + total);
    }
    
    
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        e1.getdata();
        e1.calculate();
        e1.display();
    }
}
