import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX05 extends JFrame {
	
	private JLabel la = new JLabel("�ֹ�");
	
	public EX05( ) {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//1 x
		c.setLayout(null);
		//3
		c.addMouseListener(new MyListener4());
		
		la.setSize(30, 30);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EX05();
	}
//2
	class MyListener4 extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);	
		}
		
		
	}
}
