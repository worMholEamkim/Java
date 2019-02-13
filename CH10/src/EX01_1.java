
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
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//1단계
		JButton btn = new JButton("Action");
		
		//1단계. 컴포넌트 (예:btn)
		//2단계. 이벤트처리 리스너 객체 *중요
		//3단계. 2단계에서 만든 "리스너"를, 
		//      1단계에서 만든컴포넌트에 꽂아준다.
		
		//3단계
		//MyListner2 lis = new MyListner2();
		//위치1번 사용함
		//btn.addActionListener(new MyListner());
		//위치2번 사용함
		//btn.addActionListener(new MyListner2());
		
		//위치3번 사용함 //외부도 내부 아닌 바로 만들면서 사용
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

	//위치 2번 -> 내부
	public class MyListner2 implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			 JButton btn = (JButton)e.getSource(); //이벤트가 발생한 객체가 무엇???
			 //if(btn.getText() == "Action") //이렇게 하면 안됨
			 if(btn.getText().equals("Action"))
				 btn.setText("액션");
			 else
				 btn.setText("Action");
			 
			 //타이틀 바에 출력
			 EX01.this.setTitle(btn.getText());
			
		}
	}
	
}




