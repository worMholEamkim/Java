import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class EX10 extends JFrame {
	
	public EX10() {
		setTitle("더블클릭하면 바꼉");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		//2
		c.addMouseListener(new MyMouseListener3());
		
		
		setSize(300, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new EX10();
	}

	class MyMouseListener3 extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				Component c = (Component)e.getSource();
				c.setBackground(new Color(r, g, b));
				
			}
		}
	}
}
