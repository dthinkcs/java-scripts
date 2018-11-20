import java.util.*;
import java.io.*;

class Employee implements Serializable
{
	String name;
	int number;
	int salary;
	String address;

	Employee()
	{
		System.out.println("Enter name, number, salary and address.");
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		number = s.nextInt();
		salary = s.nextInt();

		s.next(); //used to consume \n character

		address = s.nextLine();
	}

	Employee(int x)
	{
		name = address = "uninit";
		number = salary = -1;
	}

	void display()
	{
		System.out.println(name + " " + salary);
	}
}

class AddSix
{
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		Employee[] em = new Employee[n];
		for(int i = 0; i < n; i++)
			em[i] = new Employee();

		try
		{
			ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream("addsixunsorted.txt"));
			for(int i = 0; i < n; i++)
				f.writeObject(em[i]);
			f.writeObject(new Employee(0));
			f.close();
		}

		catch(Exception e)
		{
			System.out.println("Writing error to unsorted file " + e);
		}

		ArrayList<Employee> a = new ArrayList<Employee>();

		try
		{
			ObjectInputStream f = new ObjectInputStream(new FileInputStream("addsixunsorted.txt"));
			while(true)
			{
				Employee x = (Employee)f.readObject();
				if(x.salary == -1) break;
				else a.add(x);
			}
			f.close();
		}

		catch(Exception e)
		{
			System.out.println("Reading error from unsorted file " + e);
		}

		Employee[] emp = a.toArray(new Employee[a.size()]);
		Arrays.sort(emp, new SortByName());

		try
		{
			ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream("addsixsorted.txt"));
			for(int i = 0; i < emp.length; i++)
				f.writeObject(emp[i]);
			f.writeObject(new Employee(0));
			f.close();
		}

		catch(Exception e)
		{
			System.out.println("Writing error to sorted file " + e);
		}

		try
		{
			ObjectInputStream f = new ObjectInputStream(new FileInputStream("addsixsorted.txt"));
			while(true)
			{
				Employee x = (Employee)f.readObject();
				if(x.salary == -1) break;
				else x.display();
			}
			f.close();
		}

		catch(Exception e)
		{
				System.out.println("Reading error from sorted file " + e);
		}		
	}
}

class SortByName implements Comparator<Employee>
{
    public int compare(Employee a, Employee b)
    {
        return a.name.compareTo(b.name);
    }
}