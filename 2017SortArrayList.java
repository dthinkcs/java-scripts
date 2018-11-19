import java.util.*;

public class T171 
{
    public static void main()
    {
        Employee[] emps = new Employee[5];
        emps[0] = new Employee(1, "Raj", 90000, "HR");
        emps[1] = new Employee(2, "Raj2", 10000, "HR");
        emps[2] = new Employee(3, "Raj3", 80000, "Tech");        
        emps[3] = new Employee(4, "Raj4", 70000, "HR");
        emps[4] = new Employee(5, "Raj5", 100 , "Tech");
        
        Manager m = new Manager(6, "Rishabh", 100000, "Board", emps);
        //m.HRsubordinates();
        //m.dispDescendingOrder();
                
        m.dispArr();
        m.sortDescendingOrder();
        m.dispArr();
    }
}

class Employee
{
    int id;
    String name;
    int salary;
    String department;
    
    Employee(int i, String n, int s, String d) {
        id = i;
        name = n;
        salary = s;
        department = d;
    }
}

class Manager extends Employee
{
    ArrayList<Employee> arrlist;
    
    Manager(int ID, String n, int s, String d, Employee[] arr) {
        super(ID, n, s, d);
        arrlist = new ArrayList();
        for (int i = 0; i < arr.length; i++)
            arrlist.add(arr[i]);
            
    }
        
    void dispArr()
    {
        for (int i = 0; i < arrlist.size(); i++)
        {
            System.out.println(arrlist.get(i).id);
            System.out.println(arrlist.get(i).name);
            System.out.println(arrlist.get(i).salary);
            System.out.println(arrlist.get(i).department);
        }
    }
    
    void sortDescendingOrder()
    {
        for (int i = 0; i < arrlist.size() - 1; i++)
            for (int j = i + 1; j < arrlist.size(); j++)
                if (arrlist.get(i).salary < arrlist.get(i + 1).salary)
                {
                    Employee temp = arrlist.get(i);
                    arrlist.set(i, arrlist.get(i + 1));
                    arrlist.set(i + 1, temp);
                }
    }
}
