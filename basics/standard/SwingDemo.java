import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingDEMO implements ActionListener
{
    JLabel jl;
    JTextField jtf1;
    JTextField jtf2;
    JTextField jtf3;
    
    
    SwingDEMO()
    {
        JFrame jf = new JFrame("Largest of 3");
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jl = new JLabel("");
        jtf1 = new JTextField(20);
        jtf2 = new JTextField(20);
        jtf3 = new JTextField(20);
        
        JButton jb = new JButton("Show Largest OK");
        jb.addActionListener(this);
        

        
        jf.add(jtf1);
        jf.add(jtf2);
        jf.add(jtf3);
        
        jf.add(jb);
        jf.add(jl);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        int n1 = Integer.parseInt(jtf1.getText());
        int n2 = Integer.parseInt(jtf2.getText());
        int n3 = Integer.parseInt(jtf3.getText());
        
        if (n1 > n2 && n1 > n3)
        {
            jl.setText(Integer.toString(n1));
        }
        else if (n2 > n1 && n2 > n3)
        {
            jl.setText(Integer.toString(n2));
        }
        else
        {
            jl.setText(Integer.toString(n3));
        }
    }
    
    public static void main()
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                SwingDEMO s = new SwingDEMO();
            }
        }
        );
    }
}
