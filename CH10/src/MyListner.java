import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//2단계 리스너 만들기
//인터페이스 <-> 클래스와 비교, 같은 급!
//클래스가 아닌 인터페이스를 상속 받을 때는
//extends가 아닌 implements 로 한다.
//위치 1번: 외부
public class MyListner implements ActionListener 
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
		
	}
}
