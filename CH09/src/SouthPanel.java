package EX08;

import java.awt.*;
import javax.swing.*;

class SouthPanel extends JPanel {
	public SouthPanel() {
		setBackground(Color.YELLOW);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT)); // JPanel이 디폴트로 FlowLayout이지만, 확실히 하기 위해
		add(new JButton("Word Input"));
		add(new JTextField(15));
	}
}
