package EX08;

import java.awt.*;
import javax.swing.*;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setOpaque(true);
		setLayout(new FlowLayout()); // JPanel�� ����Ʈ�� FlowLayout������, Ȯ���� �ϱ� ����		
		add(new JButton("����"));
		add(new JButton("�ݱ�"));
		add(new JButton("������"));
	}
}