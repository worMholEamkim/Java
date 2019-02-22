import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TE05 extends JFrame {
	private JLabel Label;
	private JSlider sl;
	
	public TE05() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JSlider sl = new JSlider(JSlider.HORIZONTAL, 100, 200, 100);
		sl.addChangeListener(new MyChangeListener());
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(10);
		c.add(sl);
		
		String value = String.valueOf(sl.getValue());
		Label = new JLabel(value);
		c.add(Label);
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TE05();
	}

	class MyChangeListener implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			JSlider sli = (JSlider)e.getSource();
			String value = String.valueOf(sli.getValue());
			Label.setText(value);
		}
		
	}
}
