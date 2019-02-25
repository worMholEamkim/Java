import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class DR_MyListener implements ActionListener {

	private DR_MyPanel p;
	int cnt = 0;

	DR_MyListener(DR_MyPanel p) {
		this.p = p;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//객체 생성 및 컴포넌트 삽입
		p.input[cnt] = new JTextField(10);
		p.timeSet[cnt] = new JComboBox<String>(p.TIME);
		p.inputSet[cnt] = new JPanel();
		p.inputSet[cnt].add(p.timeSet[cnt]);
		p.inputSet[cnt].add(p.input[cnt]);
		p.add(p.inputSet[cnt]);
		cnt++;
		
		//화면 갱신
		p.revalidate();
		p.repaint();
		
	}

}
