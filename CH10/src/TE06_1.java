import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX06 extends JFrame {
	public EX06() {
		setTitle("Ŭ�� ���� �� �������α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("C");
		c.add(label);
		
		// ���̺� ���� ��ġ ����
		label.setLocation(100,100);
		label.setSize(20, 20);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				Container c = la.getParent();
				
				// �����̳��� ũ�� ������ ������ ���̺� ��ġ ����
				int xBound = c.getWidth() - la.getWidth(); // ���̺��� �� ��ŭ ����
				int yBound = c.getHeight() - la.getHeight(); // ���̺��� ���� ��ŭ ����				
				int x = (int)(Math.random()*xBound);
				int y = (int)(Math.random()*yBound);				
				la.setLocation(x, y);
			}
		});

		setSize(300,300);
		setVisible(true);
	}
	static public void main(String [] args) {
		new EX06();
	}
}
