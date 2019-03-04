import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class EX04 extends JFrame{
	private Container contentPane;
	
	public EX04() {
		setTitle("��������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400, 150);
		setVisible(true);
	}
	
	private void createToolBar() {
		JToolBar bar = new JToolBar("Kitae Menu");
		bar.setBackground(Color.LIGHT_GRAY);
		JButton newBtn = new JButton("NEW");
		newBtn.setToolTipText("���� ����");
		bar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("images/onen.jpg"));
		openBtn.setToolTipText("������ ����");
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("���� ����");
		bar.add(saveBtn);
		
		bar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("ã�����ϴ� ���ڿ��� �Է��ϼ�");
		contentPane.add(bar, BorderLayout.NORTH);
		
	}

	public static void main(String[] args) {
		new EX04();
	}

}
