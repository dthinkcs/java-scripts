public class TestInterface {
    public static void main()
    {
        Student[] studs = new Student[3];
        studs[0] = new Student();
        studs[0].name = "RJ";
        studs[0].rollNumber = 2;
                studs[1] = new Student();
                studs[1].name = "RJ2";
                
        studs[1].rollNumber = 10;
                studs[2] = new Student();
                studs[2].name = "RJ3";
        studs[2].rollNumber = 1;
        
        StuArray sa = new StuArray();
        sa.sort(studs);
        sa.display(studs);
    }
}

interface Utility
{
    void sort(Object o[]);
    void display(Object o[]);
}

class StuArray implements Utility
{
    
    public void sort(Object[] students)
    {
        for (int i = 0; i < 3 - 1; i++)
        {
            for (int j = 0; j < 3 - 1 - i; j++)
            {   
                Student sj = (Student)(students[j]);
                Student sj1 = (Student)(students[j + 1]);
                if (sj1.rollNumber < sj.rollNumber)
                {
                    Object tmp = students[j];
                    students[j] = students[j+1];
                    students[j + 1] = tmp;
                }
            }
        }
    }
    
    public void display(Object[] students)
    {
        for (int i = 0; i < students.length; i++)
        {
            System.out.println(students[i]);
        }
    }
}

class Student
{
    String name;
    int rollNumber;
    
    public String toString()
    {
            return (name) + "\t"  + (rollNumber) ;

    }
    
}

