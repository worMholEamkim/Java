package EX08;

import java.awt.*;
import javax.swing.*;

class CenterPanel extends JPanel {
	public CenterPanel() {
		setBackground(Color.WHITE);
		setLayout(null); // 배치관리자 없음
		for(int i=0; i<10; i++) {
			JLabel l = new JLabel("*");
			l.setSize(20,20);
			l.setForeground(Color.RED);
			l.setLocation((int)(Math.random()*250+10), (int)(Math.random()*200+10));
			
			add(l);
		}
	}
}