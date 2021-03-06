import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TE05 extends JFrame{

	public TE05() {
		setTitle("4X4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 4);
		
		Container c = getContentPane();
		JButton [] btn = new JButton[16];
		for(int i=0; i<16; i++){
			btn[i] = new JButton("i");
		}
		
		c.setLayout(grid);
		btn[0].setBackground(Color.RED);
		btn[1].setBackground(Color.ORANGE);
		btn[2].setBackground(Color.YELLOW);
		btn[3].setBackground(Color.GREEN);
		btn[4].setBackground(Color.cyan);
		btn[5].setBackground(Color.BLUE);
		btn[6].setBackground(Color.DARK_GRAY);
		btn[7].setBackground(Color.GRAY);
		btn[8].setBackground(Color.PINK);
		btn[9].setBackground(Color.BLACK);
		btn[10].setBackground(Color.RED);
		btn[11].setBackground(Color.ORANGE);
		btn[12].setBackground(Color.YELLOW);
		btn[13].setBackground(Color.GREEN);
		btn[14].setBackground(Color.cyan);
		btn[15].setBackground(Color.BLUE);
	
		for(int i=0; i<16; i++){
			c.add(btn[i]);
		}
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TE05();
	}

}
