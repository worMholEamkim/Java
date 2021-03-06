import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TE03 extends JFrame {

	public TE03() {
		setTitle("Ten Color Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1, 10);
		grid.setVgap(1);
		
		Container c = getContentPane();
		JButton [] btn = new JButton[10];
		for(int i=0; i<10; i++){
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
		
		for(int i=0; i<10; i++){
			c.add(btn[i]);
		}
		
		setSize(500,200);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new TE03();
	}

}
