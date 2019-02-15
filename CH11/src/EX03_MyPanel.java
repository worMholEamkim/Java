import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
	
class MyPanel extends JPanel 
{
	String [] text = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"}; // 환산할 돈의 이름. 레이블로 출력됨
	JTextField inputText; // 사용자로부터 금액이 입력될 텍스트 필드
	JTextField [] tf = new JTextField [8]; // 환산된 돈의 개수가 출력될 텍스트필드		

	MyPanel()
	{
		setBackground(Color.PINK);
		setLayout(null); // 패널의 배치관리자 제거
		
		//1.금액 글자 레이블
		JLabel la = new JLabel("금액");
		la.setHorizontalAlignment(JLabel.RIGHT);
		la.setSize(50, 20);
		la.setLocation(20, 20);
		add(la);
		
		//2. 금액을 입력하는 JTextField
		inputText = new JTextField(30);
		inputText.setSize(100, 20);
		inputText.setLocation(100, 20);
		add(inputText);
		
		//3. 계산 버튼
		JButton calcBtn = new JButton("계산");
		calcBtn.setSize(70, 20);
		calcBtn.setLocation(210, 20);
		add(calcBtn);
		
		// 계산된 액수별 돈의 갯수
		for(int i=0; i<text.length; i++) {
			//4.금액 글자 표시 레이블 
			la = new JLabel(text[i]);
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(50, 50+i*20);
			add(la);
			
			//화폐장수 출력 텍스트필드
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

