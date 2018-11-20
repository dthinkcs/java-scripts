
public class TestInherit 
{

}

abstract class Person // should not 
{
    String name;
    int age;
    
}



class Student extends Person
{
    String[] coursesTaken;
    
}

class Teacher extends Person
{
    String[] coursesTaught;
}


class Result extends Student
{
    String finalResult;
}



