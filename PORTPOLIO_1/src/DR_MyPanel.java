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
		
		//버튼 삽입
		JPanel btnSet = new JPanel();
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("저    장");
		JButton btn2 = new JButton("추    가");
		JLabel la = new JLabel();
		add(btn1);
		add(btn2);
		add(btnSet, BorderLayout.NORTH);
		
		
		//이벤트 설정
		DR_MyListener lis = new DR_MyListener(DR_MyPanel.this);
		btn2.addActionListener(lis);
		
		
		//삽입패널, 텍스트필드, 시간콤보박스 생성
		for(int i=0; i<TIME.length; i++) {
			inputSet[i] = new JPanel();
			setLayout(new FlowLayout());
			input[i] = new JTextField(10);
		}
		
		
		//시간콤보박스 배열화
		for(int i=0; i<TIME.length; i++) {
		timeSet[i] = timeCombo;
			
		}
		
		
		//삽입패널에 드롭박스와 텍스트필드 삽입
		for(int i=0; i<TIME.length; i++) {
			inputSet[i].add(timeSet[i]);
			inputSet[i].add(input[i]);
		}
	}
	}
