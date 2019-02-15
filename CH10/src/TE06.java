import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TE06 extends JFrame {
	
	
	
	public TE06( ) {
		setTitle("클릭 연습 용 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("C");
		c.add(label);
		//1 x
		//3
		label.setSize(100, 100);
		label.setLocation(30, 30);
		
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();
			Container c = la.getParent();
			
			int xBound = c.getWidth() - la.getWidth();
			int yBound = c.getHeight() - la.getHeight();
			int x = (int)(Math.random()*xBound);
			int y = (int)(Math.random()*yBound);
			la.setLocation(x, y);
			
			
			}
		});
		
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TE06();
	}
//2
	
	
}
