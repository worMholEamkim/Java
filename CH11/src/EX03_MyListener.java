import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyListener implements ActionListener 
{
	int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
	MyPanel p;
	
	MyListener(MyPanel p)
	{
		this.p = p;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String str = p.inputText.getText(); // 입력된 금액 문자열
		if(str.length() == 0) return; // 입력된 금액이 없음
		
		int money = Integer.parseInt(str); // 입력된 금액을 정수로 변환
		int res;
		for(int i=0; i<unit.length; i++) 
		{
			res = money/unit[i]; // unit[i]의 개수 계산
			p.tf[i].setText(Integer.toString(res));
			if(res > 0) 
				money = money%unit[i]; // money 갱신
		}
	}
}
