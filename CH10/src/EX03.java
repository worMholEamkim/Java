import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX03 extends JFrame{

	public EX03 (){
		setTitle("Action �̺�Ʋ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//1
		JButton btn = new JButton("action");
		//2
		btn.addActionListener(new MyActionListener());
		//3
		c.add(btn);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EX03();
	}
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("action"))
				b.setText("�׼�");
			else
				b.setText("action");
			setTitle(b.getText());
			
		}
		
	}
}
