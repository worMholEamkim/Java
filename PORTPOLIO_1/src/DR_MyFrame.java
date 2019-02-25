import java.awt.GridLayout;

import javax.swing.JFrame;

public class DR_MyFrame extends JFrame{

	public DR_MyFrame() {
		setTitle("Daily Report!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gl = new GridLayout(1, 24);
		setLayout(gl);
		add(new DR_MyPanel());
		setSize(300, 600);
		setVisible(true);
	}
	
}
