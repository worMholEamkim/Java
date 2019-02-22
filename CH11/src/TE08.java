import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class TE08 extends JFrame{
	
	private JLabel la = new JLabel();
	
	public TE08() {
		setTitle("이미지 갤러리 프랙티스 플레이");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JRadioButton btn = new JRadioButton("left");
		JRadioButton btn2 = new JRadioButton("right");
		
		
		
		setSize(500, 500);
		setVisible(true);
		
		
	}

	
	public static void main(String[] args) {
		new TE08();
	}

}
