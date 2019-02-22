import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class BMI_WestPanel extends JPanel{
	 String[] inputText = new String[7];
	 String[] text = {"이   름: ", "키: ", "체   중: "};
	 JTextField[] input = new JTextField[3];
	 JRadioButton[] btn = new JRadioButton [2];
	 JCheckBox[] cb = new JCheckBox[3];
	 JTextArea[] ta = new JTextArea[2];
	
	 
	 BMI_WestPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.EAST;
		
		
		
		add(new JLabel(text[0]), gbc);
		gbc.gridy += 1;
		add(new JLabel(text[1]), gbc);
		gbc.gridy += 1;
		add(new JLabel(text[2]), gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		
		input[0] = new JTextField(5);
		input[1] = new JTextField(5);
		input[2] = new JTextField(5);
		
		add(input[0], gbc);
		gbc.gridy += 1;
		add(input[1], gbc);
		gbc.gridy += 1;
		add(input[2], gbc);
		gbc.gridy += 1;
		
		ButtonGroup g = new ButtonGroup();
		btn[0] = new JRadioButton("여자");
		btn[1] = new JRadioButton("남자");
		g.add(btn[0]);
		g.add(btn[1]);
		
		JPanel radioButton = new JPanel(new GridBagLayout());
		radioButton.setBorder(new CompoundBorder(new TitledBorder("성  별"), new EmptyBorder(20, 4, 20, 4)));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		radioButton.add(btn[0], gbc);
		gbc.gridx++;
		radioButton.add(btn[1], gbc);
		
		
		JPanel checkBox = new JPanel(new GridBagLayout());
		checkBox.setBorder(new CompoundBorder(new TitledBorder("습   관"), new EmptyBorder(20, 4, 20, 4)));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		checkBox.add(cb[0] = new JCheckBox("음주"));
		gbc.gridx++;
		checkBox.add(cb[1] = new JCheckBox("흡연"));
		gbc.gridx++;
		checkBox.add(cb[2] = new JCheckBox("운동"));
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(radioButton, gbc);
		gbc.gridy++;
		add(checkBox, gbc);
		
		
}
}