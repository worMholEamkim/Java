import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DR_MyPanel extends JPanel {
	String[] inputText = new String[24];
	String[] TIME = {"1h ~ 2h", "2h ~ 3h", "3h ~ 4h", "4h ~ 5h",
			 "5h ~ 6h", "6h ~ 7h", "7h ~ 8h", "8h ~ 9h", "9h ~ 10h",
			 "10h ~ 11h", "11h ~ 12h", "12h ~ 13h",
			 "13h ~ 14h", "14h ~ 15h",
			 "15h ~ 16h", "16h ~ 17h", "17h ~ 18h", "18h ~ 19h", 
			 "19h ~ 20h", "20h ~ 21h",
			 "21h ~ 22h", "22h ~ 23h", "23h ~ 24h", "24h ~ 1h"};
	JTextField[] input = new JTextField[24];
	JComboBox<String>[] timeSet = new JComboBox[24] ;
	JPanel[] inputSet = new JPanel[24];
	
	DR_MyPanel()
	{
		
		
		//��ư ����
		JPanel btnSet = new JPanel();
		
		JButton btn1 = new JButton("��    ��");
		JButton btn2 = new JButton("��    ��");
		JLabel la = new JLabel("��ǥ�޼���");
		btnSet.add(btn1);
		btnSet.add(btn2);
		add(btnSet);
		add(la);
		
		//�̺�Ʈ ����
		DR_MyListener lis = new DR_MyListener(DR_MyPanel.this);
		btn2.addActionListener(lis);
		
		
		//�����г�, �ؽ�Ʈ�ʵ�, �ð��޺��ڽ� ����
//		for(int i=0; i<TIME.length; i++) {
//			inputSet[i] = new JPanel();
//			input[i] = new JTextField(10);
//		}
		
		
		//�ð��޺��ڽ� �迭ȭ
//		for(int i=0; i<TIME.length; i++) {
//		timeSet[i] = new JComboBox<String>(TIME);
//			
//		}
		
		//�����гο� ��ӹڽ��� �ؽ�Ʈ�ʵ� ���
//		for(int i=0; i<TIME.length; i++) {
//			inputSet[i].add(timeSet[i]);
//			inputSet[i].add(input[i]);
//		}
		
		//�⺻�г� ����
		//add(inputSet[0]);

		
	}
	}
