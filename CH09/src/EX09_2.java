import javax.swing.*;

import java.awt.*;

public class EX09_2 extends JFrame {
	public EX09_2() {
		setTitle("ContentPane░˙ JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new EX09_2();
	}

}
