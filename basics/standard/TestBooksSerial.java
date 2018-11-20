import java.io.*;
public class TestBooksSerial {
    public static void main() throws Exception
    {
  
        
        Books[] books = new Books[5];
        books[0] = new Books();
        books[0].name = "Alice in Wonderland";
        books[0].edition = 1;
        books[1] = new Books();
        books[1].name = "Alice2 in Wonderland";
        books[1].edition = 2; 
        books[2] = new Books();        
        books[2].name = "Harry";
        books[2].edition = 3;    
        books[3] = new Books();                
        books[3].name = "Alice4 in Wonderland";
        books[3].edition = 4;       
        books[4] = new Books();                
        books[4].name = "Harry";
        books[4].edition = 5;   
        /*
         * sTRING.VALUEOF
        for (int i = 0; i < 5; i++)
            books[i] = new Books(sc.nextLine(), sc.nextInt());

        */
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Book_details.tmp"));
        for (int i = 0; i < 5; i++)
            oos.writeObject(books[i]);
        oos.close();

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("D:\\Book_details.tmp"));
        for (int i = 0; i < 5; i++)
        {
            Books b = (Books) oin.readObject();
            if (b.name.equals("Harry"))
            {
                System.out.println(b.name);
                System.out.println(b.edition);
            }
        }
        oin.close();
    }   
}

class Books implements Serializable{
    String name;
    int edition;
    
    Books()
    {}
    
    Books(String n, int e)
    {
        this.name = n;
        this.edition = e;
    }
}


