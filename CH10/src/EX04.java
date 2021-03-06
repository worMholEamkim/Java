import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX04 extends JFrame {
	
	private JLabel la = new JLabel("휘바");
	
	public EX04( ) {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//1 x
		c.setLayout(null);
		//3
		c.addMouseListener(new MyListener3());
		
		la.setSize(30, 30);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EX04();
	}
//2
	class MyListener3 implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			la.setLocation(x, y);
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			
		}
		
	}
}
