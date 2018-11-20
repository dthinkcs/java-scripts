import java.io.*;
public class TestBooks {
    public static void main() throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Book_details.txt"));
        Books[] books = new Books[5];
        books[0] = new Books();
        books[0].name = "Alice in Wonderland";
        books[0].edition = 1;
        books[1] = new Books();
        books[1].name = "Alice2 in Wonderland";
        books[1].edition = 2; 
        books[2] = new Books();        
        books[2].name = "Alice3 in Wonderland";
        books[2].edition = 3;    
        books[3] = new Books();                
        books[3].name = "Alice4 in Wonderland";
        books[3].edition = 4;       
        books[4] = new Books();                
        books[4].name = "Alice5 in Wonderland";
        books[4].edition = 5;   
        /*
         * sTRING.VALUEOF
        for (int i = 0; i < 5; i++)
            books[i] = new Books(sc.nextLine(), sc.nextInt());

        */
        
        for (int i = 0; i < 5; i++)
        {
            bw.write(books[i].name); bw.newLine();
            bw.write(books[i].edition); bw.newLine();
        }
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("D:\\Book_details.txt"));
        for (int i = 0; i < 5; i++)
        {
            System.out.println(br.readLine());
        }
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


