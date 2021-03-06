import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX01 extends JFrame {

	
	public EX01() {
		setTitle("Action 이벤트 리스너 예제스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//1 컴포넌트 생성
		JButton btn = new JButton("Action");
		//2 이벤트 리스너 객체 생성
		btn.addActionListener(new MyActionListener() {});
		//3 리스너를 컴포넌트에 꽂음
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
				btn.setText("액션");
			else
				btn.setText("Action");
			
			EX01.this.setTitle("btn.getText");
		}
		
	}
}
