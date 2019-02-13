import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX07 extends JFrame {
	private JLabel la = new JLabel();
	//public Component contentPane;
	Container c;
	public EX07() {
		setTitle("F1 : �ʷ��ʷ�, % : ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		
		//3
		c.addKeyListener(new MyKeyListener1());
		c.add(la);
		
		setSize(400, 400);
		setVisible(true);
		
		//Ű�Է�
		c.setFocusable(true);
		c.requestFocus();
	}
	
	
	
	public static void main(String[] args) {
		new EX07();
	}

	class MyKeyListener1 extends KeyAdapter{
		
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			
			
			if(e.getKeyChar() == '%')
				c.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				c.setBackground(Color.GREEN);	
		}
	}
}
