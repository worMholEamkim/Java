import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TE02 extends JFrame {

	
	public TE02() {
		JTextField tf = new JTextField(10);
		Vector<String> names = new Vector <String>();
		JComboBox <String> strCombo = new JComboBox <String> ();
		
		setTitle("ÇØÈýÇÞÈ÷˜Ë½Ã");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel());
		c.add(tf);
		c.add(strCombo);
		
		
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//JTextField t = (JTextField)e.getSource();
				strCombo.addItem(tf.getText());
				tf.setText("");				
			}
		});
		
		setSize(700, 700);
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		new TE02();
	}

}
