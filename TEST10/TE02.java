import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX02 extends JFrame 
{
	public EX02() {
		setTitle("�巡�뵿�� YELLOW�� ����");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		
		MyMouseListener ml = new MyMouseListener();
		//c.addMouseMotionListener(ml);
		c.addMouseListener(ml);
		
		setSize(250,150);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			JComponent c = (JComponent)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			JComponent c = (JComponent)e.getSource();
			c.setBackground(Color.GREEN);
		}		
	}
	static public void main(String [] args) {
		new EX02();
	}
}
