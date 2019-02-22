import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DR_MyPanel extends JPanel {
	String[] inputText = new String[24];
	String[] TIME = {"1 ~ 2", "2 ~ 3", "3 ~ 4", "4 ~ 5",
			 "5 ~ 6", "6 ~ 7", "7 ~ 8", "8 ~ 9", "9 ~ 10",
			 "10 ~ 11", "11 ~ 12", "12 ~ 13",
			 "13 ~ 14", "14 ~ 15",
			 "15 ~ 16", "16 ~ 17", "17 ~ 18", "18 ~ 19", 
			 "19 ~ 20", "20 ~ 21",
			 "21 ~ 22", "22 ~ 23", "23 ~ 24", "24 ~ 1"};
	JTextField[] input = new JTextField[24];
	JPanel[] inputSet;
	JComboBox<String> timeCombo = new JComboBox<String>(TIME);
	JComboBox<String>[] timeSet;
	
	DR_MyPanel()
	{
		setLayout(new BorderLayout());
		
		//��ư ����
		JPanel btnSet = new JPanel();
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("��    ��");
		JButton btn2 = new JButton("��    ��");
		JLabel la = new JLabel();
		add(btn1);
		add(btn2);
		add(btnSet, BorderLayout.NORTH);
		
		
		//�̺�Ʈ ����
		DR_MyListener lis = new DR_MyListener(DR_MyPanel.this);
		btn2.addActionListener(lis);
		
		
		//�����г�, �ؽ�Ʈ�ʵ�, �ð��޺��ڽ� ����
		for(int i=0; i<TIME.length; i++) {
			inputSet[i] = new JPanel();
			setLayout(new FlowLayout());
			input[i] = new JTextField(10);
		}
		
		
		//�ð��޺��ڽ� �迭ȭ
		for(int i=0; i<TIME.length; i++) {
		timeSet[i] = timeCombo;
			
		}
		
		
		//�����гο� ��ӹڽ��� �ؽ�Ʈ�ʵ� ����
		for(int i=0; i<TIME.length; i++) {
			inputSet[i].add(timeSet[i]);
			inputSet[i].add(input[i]);
		}
	}
	}
