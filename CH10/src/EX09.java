import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX09 extends JFrame{
	
	private JLabel la = new JLabel("마우스이벤 ㄴ");
	
	public EX09() {
		setTitle("마우스모션데스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		//2
		MyMouseListener2 listener = new MyMouseListener2();
		
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		//3
		la.setSize(200, 80);
		la.setLocation(350, 50);
		c.add(la);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new EX09();
	}

	
	class MyMouseListener2 implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("마우스끌어즴 "+ e.getX() +", "+ e.getY() );
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("마우스움직영 "+ e.getX() +", "+ e.getY() );
			int x = e.getX();
			int y = e.getY();
			System.out.println(x +", "+ y);
			la.setLocation(x, y);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
		
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.RED);	
		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("마우스눌러짐 "+ e.getX() +", "+ e.getY() );
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("마우스떼짐 "+ e.getX() +", "+ e.getY() );
		}
		
	}
}
