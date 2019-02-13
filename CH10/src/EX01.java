import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX01 extends JFrame {

	
	public EX01() {
		setTitle("Action �̺�Ʈ ������ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//1 ������Ʈ ����
		JButton btn = new JButton("Action");
		//2 �̺�Ʈ ������ ��ü ����
		btn.addActionListener(new MyActionListener() {});
		//3 �����ʸ� ������Ʈ�� ����
		c.add(btn);
		
		setSize(300, 150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new EX01();
	}
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action"))
				btn.setText("�׼�");
			else
				btn.setText("Action");
			
			EX01.this.setTitle("btn.getText");
		}
		
	}
}