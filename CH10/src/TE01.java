import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TE01 extends JFrame {
	
		private JLabel la = new JLabel("�ڹٽȾ");
		
		public TE01() {
			setTitle("���콺���Ҵٿ�");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container c = getContentPane();
			
			//2
			c.addMouseListener(new MyMouseListener_1());
			la.setSize(80, 30);
			la.setLocation(50, 50);
			c.setLayout(null);
			//3
			c.add(la);
			
			setSize(500, 500);
			setVisible(true);
		}
	
	
	public static void main(String[] args) {
		new TE01();
	}
	
	class MyMouseListener_1 implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			la.setText("�ڹ� �� ���뤷�ФФ�"); 
		}

		@Override
		public void mouseExited(MouseEvent e) {
			la.setText("����ȭ��");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		
	}

}
