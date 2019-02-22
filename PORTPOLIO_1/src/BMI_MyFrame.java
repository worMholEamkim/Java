import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class BMI_MyFrame extends JFrame {
	public BMI_MyFrame()
	{
		JFrame frame = new JFrame("신체 질량 지수 측정(BMI) - 김새암");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(new BMI_MyPanel());
		frame.pack();
		frame.setSize(700, 400);
		frame.setVisible(true);
		
		
		
	}


}
