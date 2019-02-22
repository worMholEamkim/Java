import java.awt.FlowLayout;

import javax.swing.JFrame;

public class DR_MyFrame extends JFrame{

	public DR_MyFrame() {
		setTitle("Daily Report!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(new DR_MyPanel());
		setSize(600, 600);
		setVisible(true);
	}
	
}
