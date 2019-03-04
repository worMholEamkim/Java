import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;



	public class EX02 extends JFrame{


		public EX02() {
			setTitle("Runabble을 구현한 블라블라");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JLabel timerLabel = new JLabel();
			timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
			c.add(timerLabel);
			
			TimerRunnable runnable = new TimerRunnable(timerLabel);
			Thread th = new Thread(runnable);
			
			setSize(250, 150);
			setVisible(true);
			
			th.start();
		}
	
	
	public static void main(String[] args) {
		new EX02();
	}

	}
