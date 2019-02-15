import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
	
class MyPanel extends JPanel 
{
	String [] text = {"������", "����", "õ��", "500��", "100��", "50��", "10��", "1��"}; // ȯ���� ���� �̸�. ���̺�� ��µ�
	JTextField inputText; // ����ڷκ��� �ݾ��� �Էµ� �ؽ�Ʈ �ʵ�
	JTextField [] tf = new JTextField [8]; // ȯ��� ���� ������ ��µ� �ؽ�Ʈ�ʵ�		

	MyPanel()
	{
		setBackground(Color.PINK);
		setLayout(null); // �г��� ��ġ������ ����
		
		//1.�ݾ� ���� ���̺�
		JLabel la = new JLabel("�ݾ�");
		la.setHorizontalAlignment(JLabel.RIGHT);
		la.setSize(50, 20);
		la.setLocation(20, 20);
		add(la);
		
		//2. �ݾ��� �Է��ϴ� JTextField
		inputText = new JTextField(30);
		inputText.setSize(100, 20);
		inputText.setLocation(100, 20);
		add(inputText);
		
		//3. ��� ��ư
		JButton calcBtn = new JButton("���");
		calcBtn.setSize(70, 20);
		calcBtn.setLocation(210, 20);
		add(calcBtn);
		
		// ���� �׼��� ���� ����
		for(int i=0; i<text.length; i++) {
			//4.�ݾ� ���� ǥ�� ���̺� 
			la = new JLabel(text[i]);
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(50, 50+i*20);
			add(la);
			
			//ȭ����� ��� �ؽ�Ʈ�ʵ�
			tf[i] = new JTextField(30);
			tf[i].setHorizontalAlignment(JTextField.CENTER);
			tf[i].setSize(70, 20);
			tf[i].setLocation(120, 50+i*20);
			
			add(tf[i]);
		}
		
		MyListener lis = new MyListener(MyPanel.this);
		calcBtn.addActionListener(lis);
		
	}
}

