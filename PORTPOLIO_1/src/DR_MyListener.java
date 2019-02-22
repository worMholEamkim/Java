import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class DR_MyListener implements ActionListener {

	private DR_MyPanel p;
	int cnt = 0;

	DR_MyListener(DR_MyPanel p) {
		this.p = p;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		cnt++;
		p.add(p.inputSet[cnt]);
	}

}
