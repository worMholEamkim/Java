import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX12 extends JFrame {
	private String [] favorite = {"taeyeon", "boyoung", "dalchong"};
	private String [] names = {"saeam", "gunil", "youngsoo"};
	private ImageIcon [] Images = {new ImageIcon("images/taeyeon.jpg"),
			new ImageIcon("images/boyoung.jpg"),
			new ImageIcon("images/dalchong.jpg"),
	};
	
	private JLabel imgLabel = new JLabel(Images[0]);
	private JComboBox <String> strCombo = new JComboBox <String> (favorite);
;	public EX12() {
		setTitle("누가 누구랑 잘어울리나");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		strCombo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JComboBox <String> cb = (JComboBox <String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(Images[index]);;
			}
		});
		setSize(700, 700);
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		new EX12();
	}

}
