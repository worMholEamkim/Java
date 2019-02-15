import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class EX07 extends JFrame {
	private JRadioButton [] radio = new JRadioButton[3];
	private String [] text = {"태연", "보영", "달총"};
	private ImageIcon [] image = {
			new ImageIcon("images/taeyeon.jpg"),
			new ImageIcon("images/boyoung.jpg"),
			new ImageIcon("images/dalchong.jpg")
			
	};
	private JLabel imageLabel = new JLabel();
	
	
	public EX07() {
		setTitle("태연 보영 달총");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.RED);
		
		ButtonGroup g = new ButtonGroup();
		
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener2());
		}
		radio[2].setSelected(true);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(700, 700);
		setVisible(true);
		
		
		
		
	}

	
	public static void main(String[] args) {
		new EX07();
	}

	class MyItemListener2 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if(radio[0].isSelected())
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else
				imageLabel.setIcon(image[2]);
			
		}
		
	}


}
