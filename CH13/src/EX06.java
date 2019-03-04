import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class EX06 extends JFrame {
	MyLabel bar = new MyLabel(100);
	TabAndThreadEx(String title){
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter() {
			public void KeyPressed(KeyEvent e) {
				bar.fill();
			}
		});
		setSize(350, 200);
		setVisible(true);
		
		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
	
	}
	
	
	public static void main(String[] args) {
		new TabAndThreadEx("아무키나 빨리 눌러 바 채우긔");
	}

}
