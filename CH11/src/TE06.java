import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextArea;

public class TE06 extends JFrame{
	private JTextArea ta;
	private JSlider sl;
	
	public TE06() {
		setTitle("텍스트에어리어 프랙티스프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextArea ta = new JTextArea(40);
		JSlider sl = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(5);
		
		ta.addActionListener(new MyActionListener());
		
		c.add(ta);
		c.add(sl);
	}
	public static void main(String[] args) {
		new TE06();
	}

	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JTextArea ta2 = (JTextArea)e.getSource();
			
		}
		
	}
}
