import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX05 extends JFrame {
	private Thread th;
	public EX05() {
		setTitle("���������ͷ�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable);
		c.add(timerLabel);
		
		JButton btn = new JButton("kill Ÿ�̸�");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);
			}
			
		});
		
		c.add(btn);
		setSize(300, 170);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		new EX05();
	}

}
