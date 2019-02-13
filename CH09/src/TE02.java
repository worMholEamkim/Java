import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TE02 extends JFrame {

	public TE02() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(5, 7));
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new TE02();
	}

}
