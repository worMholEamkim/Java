package EX08;

import java.awt.*;
import javax.swing.*;

class SouthPanel extends JPanel {
	public SouthPanel() {
		setBackground(Color.YELLOW);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT)); // JPanel�� ����Ʈ�� FlowLayout������, Ȯ���� �ϱ� ����
		add(new JButton("Word Input"));
		add(new JTextField(15));
	}
}
