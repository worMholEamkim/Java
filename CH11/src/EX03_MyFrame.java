import java.awt.*;
import javax.swing.*;

public class EX03_MyFrame extends JFrame 
{
	public EX03_MyFrame() 
	{		
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������, �����̳�, JPanel ��� 
		setContentPane(new MyPanel());
		
		setSize(300,300);
		setVisible(true);
	}
}
