import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;

class Counter extends JFrame implements ActionListener
{
	private int i;
	private JPanel p;
	private JLabel title;
	private JTextField data;
	private JButton tap;

	Counter()
	{
		super("Counter");
		i = 0;
		p = new JPanel();

		title = new JLabel("Counter");
		p.add(title);

		data = new JTextField(new Integer(i).toString());
		data.setPreferredSize(new Dimension(100,30));
		p.add(data);

		tap = new JButton("Count");
		tap.addActionListener(this);	
		p.add(tap);

		add(p);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		data.setText(new Integer(i = i + 6).toString());
	}
}

class Seven
{
	public static void main(String[] args) 
	{
		new Counter();		
	}
}