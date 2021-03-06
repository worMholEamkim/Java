import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX01_2 extends JFrame{
	public EX01_2() {
		setTitle("Action 이벤트 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//1
		JButton btn = new JButton("Action");
		//2
		btn.addActionListener(new MyActionListener());
		//3
		c.add(btn);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new EX01_2();
	}
	
	public class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action"))
				btn.setText("액션");
			else
				btn.setText("AAAAACTION");
			
			EX01_2.this.setTitle(btn.getText());
		}
		
	}
}
