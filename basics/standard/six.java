import javax.swing.*;
import java.awt.Dimension;

class HelloWorld extends JFrame
{
	HelloWorld()
	{
		super("Hello World Swing");
		JPanel p = new JPanel();
		JLabel greet = new JLabel("Hello World!");
		p.add(greet);
		add(p);

		setSize(400,65);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class Six
{
	public static void main(String[] args) 
	{
		new HelloWorld();		
	}
}