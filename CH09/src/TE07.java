import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class TE07 extends JFrame {
	
	public TE07() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(0, 0));
		
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		c.add(new CenterPanel(), BorderLayout.SOUTH);
		c.add(new NorthPanel(), BorderLayout.SOUTH);
		setSize(300, 300);
		setVisible(true);
		
		
	}
		
	
	public static void main(String[] args) {
		new TE07();
	}

}
