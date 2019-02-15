import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyListener implements ActionListener 
{
	int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // ȯ���� ���� ����
	MyPanel p;
	
	MyListener(MyPanel p)
	{
		this.p = p;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String str = p.inputText.getText(); // �Էµ� �ݾ� ���ڿ�
		if(str.length() == 0) return; // �Էµ� �ݾ��� ����
		
		int money = Integer.parseInt(str); // �Էµ� �ݾ��� ������ ��ȯ
		int res;
		for(int i=0; i<unit.length; i++) 
		{
			res = money/unit[i]; // unit[i]�� ���� ���
			p.tf[i].setText(Integer.toString(res));
			if(res > 0) 
				money = money%unit[i]; // money ����
		}
	}
}
