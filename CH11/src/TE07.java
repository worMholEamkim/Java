import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TE07 extends JFrame {
	private JLabel la = new JLabel("I Love Jave");
	private JSlider sl = new JSlider(JSlider.HORIZONTAL, 1, 100, 50);
	
	public TE07() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		la.setFont(new Font("TimesRoman", Font.PLAIN, 10));
		
		sl.addChangeListener(new MyChangeListener2());
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(5);
		
		
		c.add(sl, BorderLayout.NORTH);
		c.add(la, BorderLayout.CENTER);
		
		setSize(400, 400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new TE07();
	
	}

	class MyChangeListener2 implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			JSlider sli = (JSlider)e.getSource();
			int fontSize = sli.getValue();
			la.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
		}
		
	}
}
