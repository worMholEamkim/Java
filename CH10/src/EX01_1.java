
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX01 extends JFrame 
{
	public EX01() 
	{
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//1�ܰ�
		JButton btn = new JButton("Action");
		
		//1�ܰ�. ������Ʈ (��:btn)
		//2�ܰ�. �̺�Ʈó�� ������ ��ü *�߿�
		//3�ܰ�. 2�ܰ迡�� ���� "������"��, 
		//      1�ܰ迡�� ����������Ʈ�� �Ⱦ��ش�.
		
		//3�ܰ�
		//MyListner2 lis = new MyListner2();
		//��ġ1�� �����
		//btn.addActionListener(new MyListner());
		//��ġ2�� �����
		//btn.addActionListener(new MyListner2());
		
		//��ġ3�� ����� //�ܺε� ���� �ƴ� �ٷ� ����鼭 ���
		//btn.addActionListener(???????);
		btn.addActionListener(new ActionListener() {}	);
		
		
		c.add(btn);
		

		setSize(350, 150);
		setVisible(true);	
	}
	public static void main(String [] args) 
	{
		new EX01();
	}

	//��ġ 2�� -> ����
	public class MyListner2 implements ActionListener 
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
			 
			 //Ÿ��Ʋ �ٿ� ���
			 EX01.this.setTitle(btn.getText());
			
		}
	}
	
}




