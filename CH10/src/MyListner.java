import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//2�ܰ� ������ �����
//�������̽� <-> Ŭ������ ��, ���� ��!
//Ŭ������ �ƴ� �������̽��� ��� ���� ����
//extends�� �ƴ� implements �� �Ѵ�.
//��ġ 1��: �ܺ�
public class MyListner implements ActionListener 
{
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		 JButton btn = (JButton)e.getSource(); //�̺�Ʈ�� �߻��� ��ü�� ����???
		 //if(btn.getText() == "Action") //�̷��� �ϸ� �ȵ�
		 if(btn.getText().equals("Action"))
			 btn.setText("�׼�");
		 else
			 btn.setText("Action");
		
	}
}
