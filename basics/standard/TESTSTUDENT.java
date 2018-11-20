import java.util.*;
import java.io.*;
import java.text.*;

class Student implements Serializable
{
    int percentage;
    char grade;
    
    Student (int p, char g)
    {
        percentage = p;
        grade = g;
    }
}

public class TESTSTUDENT {
    
    public static void main() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Student students[] = new Student[3];
        Student newStudents[] = new Student[3];
        
        for (int i = 0; i < 3; i++) {
           students[i] = new Student(sc.nextInt(), sc.next().charAt(0));
        }
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\JAVA\\students.tmp"));
        for (int i = 0; i < 3; i++)
            oos.writeObject(students[i]);
        oos.close();
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\JAVA\\students.tmp"));
        for (int i = 0; i < 3; i++)
            newStudents[i] = (Student) ois.readObject();
        ois.close();
        
        // OUTPUT
        for (int i = 0; i < 3; i++)
            System.out.println(newStudents[i].percentage);
        
        
    }
}
