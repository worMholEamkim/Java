import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EX09_5 extends JFrame {
	public EX09_5() {
		setTitle("GirdLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" �̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ����"));
		c.add(new JTextField(""));
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new EX09_5();
	}

}
