import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX08 extends JFrame {

	private JLabel la = new JLabel("우로1보");
	private final int FLYING = 10;
	public EX08() {
		setTitle("상,하,좌,우 키누르면 도망감");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		//2
		c.addKeyListener(new MyKeyListener2());
		
		la.setLocation(50,50);
		la.setSize(100, 20);
		
		//3
		c.add(la);
		setSize(500, 500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		
	}
	
	public static void main(String[] args) {
		new EX08();
	}

	class MyKeyListener2 extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - FLYING);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + FLYING);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - FLYING, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + FLYING, la.getY());
				break;
				
			}
		}
	}
}
