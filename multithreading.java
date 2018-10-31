
package lab7q1;


import java.io.*;
public class LAB7Q1 {

   
    public static void main(String[] args) throws Exception {
        // take input from input
        // convert a .txt file into a String[] which has all the words from the file
        String[] words = new String[3];
        
        BufferedReader br = new BufferedReader(new FileReader("D:\\foo.txt"));
        
        String line = br.readLine();
        int k = 0;
        while (line != null)
        {
            words[k++] = line;
            line = br.readLine();
        }
                
                
        Child1 tc1 = new Child1(words);
        Child2 tc2 = new Child2(words);
        // child1: print all words with all letters being vowel
        tc1.start();
        // child2: print all words with all letter being non-vowels
        tc2.start();
        
        // wait unitil the child thread is over
        tc1.join();
        tc2.join();
        // print all words displayed in main thread
        System.out.println("All words displayed");
    }
    
}

class Child1 extends Thread {
    String[] words;
    
    Child1 (String[] w)
    {
        words = w;
    }
    
    public void run()
    {
        for (int i = 0; i < words.length; i++)
        {
            if (allVowels(words[i]))
            { 
                System.out.println("ALL VOWELS: " + words[i]);
                try {
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {}
            }
        }
    }
    
    boolean allVowels(String word)
    {
        for (int i = 0; i < word.length(); i++)
        {
            char ch = Character.toLowerCase(word.charAt(i));
            
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
                return false;
           
        }
        
        return true;
    }
                    
}
    
class Child2 extends Thread {
    String[] words;
    
    Child2 (String[] w)
    {
        words = w;
    }
    
    public void run()
    {
        for (int i = 0; i < words.length; i++)
        {
            if (allNonVowels(words[i]))
            { 
                System.out.println("ALL NON VOWELS: " + words[i]);
                try {
                    Thread.sleep(2000);
                }
                catch (Exception e)
                {}
            }
        }
    }
    
    boolean allNonVowels(String word)
    {
        for (int i = 0; i < word.length(); i++)
        {
            char ch = Character.toLowerCase(word.charAt(i));
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return false;
           
        }
        
        return true;
    }
                    
}  
