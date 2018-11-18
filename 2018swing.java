import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingDemo implements ActionListener
{
    JLabel jl;
    JTextField jtf1;
    JTextField jtf2;
    SwingDemo()
    {
        JFrame jf = new JFrame("Shirish Madarchod");
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jtf1 = new JTextField(20);
        jl = new JLabel("");
        JButton jb = new JButton("Shirish Madarchod OK");
        jb.addActionListener(this);
        /*jmb.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) {
                
            }

        });
        */
        
        jf.add(jtf1);
        jf.add(jb);
        jf.add(jl);
       
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if (isPalindrome(jtf1.getText()))
            jl.setText("Palindrome Madarchod hai");
        else
            jl.setText("NOT A PALINDROME");
    }
    
    boolean isPalindrome(String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
    
    public static void main()
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() 
            {
                SwingDemo s = new SwingDemo();
            }
        });
    }
}

