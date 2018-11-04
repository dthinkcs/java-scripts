
package serializable0;

import java.io.*;

public class Serializable0 {


    public static void main(String[] args) throws Exception {
        double[] m1 = {100.0, 100.0, 100.0, 98.0, 97.0};
        Student s1 = new Student("Shirish Panu", m1);
        // serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\foo.tmp"));
        oos.writeObject(s1);
        
        s1 = null;
        // de-serialization        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\foo.tmp"));
        s1 = (Student) ois.readObject();
        
        s1.display();
    }
    
}

class Student implements Serializable
{
    String name;
    double marks[];
    double percentage;
    String grade;
    
    Student(String n, double[] m)
    {
        name = n;
        marks = new double[m.length];
        int sum = 0;
        for (int i = 0; i < m.length; i++)
        {
            marks[i] = m[i];
            sum += m[i];
        }
        percentage = sum / m.length;
        if (percentage > 90) 
            grade = "A";
        else if (percentage > 80) 
            grade = "B";
        else if (percentage > 70)
            grade = "C";
        else if (percentage > 60)
            grade = "D";
        else 
            grade = "E";
    }
    
    void display()
    {
        System.out.println(name);
        System.out.println(percentage);

        System.out.println(grade);

    }
}
