import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX04 extends JFrame {
	public EX04() {
		setTitle("Money Changer with CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // ȯ���� ���� ����
		private String [] text = {"������", "����", "õ��", "500��", "100��", "50��", "10��", "1��"}; // ȯ���� ���� �̸�. ���̺�� ��µ�
		private JTextField source; // ����ڷκ��� �ݾ��� �Էµ� �ؽ�Ʈ �ʵ�
		private JTextField [] tf = new JTextField [8]; // ȯ��� ���� ������ ��µ� �ؽ�Ʈ�ʵ�
		private JCheckBox [] cb = new JCheckBox [7]; // üũ�ڽ�
		
		public MyPanel() {
			setBackground(Color.PINK);
			setLayout(null);
			
			// �ݾ� ���̺�
			JLabel la = new JLabel("�ݾ�");
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(20, 20);
			add(la);
			
			// �ݾ��� �Է��ϴ� JTextField
			source = new JTextField(30);
			source.setSize(100, 20);
			source.setLocation(100, 20);
			add(source);
			
			// ��� ��ư
			JButton calcBtn = new JButton("���");
			calcBtn.setSize(70, 20);
			calcBtn.setLocation(210, 20);
			add(calcBtn);
			
			// ���� �׼��� ���� ����
			for(int i=0; i<text.length; i++) {
				la = new JLabel(text[i]);
				la.setHorizontalAlignment(JLabel.RIGHT);
				la.setSize(50, 20);
				la.setLocation(50, 50+i*20);
				add(la);
				tf[i] = new JTextField(30);
				tf[i].setHorizontalAlignment(JTextField.CENTER);
				tf[i].setSize(70, 20);
				tf[i].setLocation(120, 50+i*20);
				
				add(tf[i]);
			}

			// üũ �ڽ�
			for(int i=0; i<cb.length; i++) {
				cb[i] = new JCheckBox("", true); // �ʱ⿡ ��� ���õ� ���·� ����
				cb[i].setOpaque(false); // üũ�ڽ��� ����� �����ϰ� �����Ͽ� ����Ʈ ���� ������ ��Ÿ������ ��
				cb[i].setHorizontalAlignment(JTextField.CENTER);
				cb[i].setSize(30, 20);
				cb[i].setLocation(200, 50+i*20);
				
				add(cb[i]);
			}
			
			// ��� ��ư�� Action ������
			calcBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String str = source.getText(); // �Էµ� �ݾ� ���ڿ�
					if(str.length() == 0) return; // �Էµ� �ݾ��� ����
					
					int money = Integer.parseInt(str); // �Էµ� �ݾ��� ������ ��ȯ
					int res;
					for(int i=0; i<unit.length; i++) {
						if(i==unit.length-1) { // 1�� ¥�� ����ϴ� ���
							res = money/unit[i]; // unit[i]�� ���� ���
							tf[i].setText(Integer.toString(res));
							break;
						}
						if(!cb[i].isSelected()) {// üũ�ڽ��� ������ ��쿡�� �ش� ������ ������ ���� ����
							tf[i].setText("0");
							continue;
						}
						
						res = money/unit[i]; // unit[i]�� ���� ���
						tf[i].setText(Integer.toString(res));
						if(res > 0) 
							money = money%unit[i]; // money ����
					}
				}
			});
		}
	}
	
	public static void main(String[] args) {
		new EX04();
	}
}
