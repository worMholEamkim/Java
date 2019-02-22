import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class BMI_MyPanel extends JPanel{
	
	
	
	BMI_MyPanel() {
		setBorder(new EmptyBorder(8, 16, 16, 8));
		setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weighty = 2;

		BMI_WestPanel bmi_WestPanel = new BMI_WestPanel();
		bmi_WestPanel.setBorder(new CompoundBorder(new TitledBorder("Body Max Index"), new EmptyBorder(4, 4, 4, 4)));
		add(bmi_WestPanel, gbc);
		

		gbc.gridx++;
		
		BMI_EastPanel bmi_EastPanel = new BMI_EastPanel(bmi_WestPanel);
		bmi_EastPanel.setBorder(new CompoundBorder(new TitledBorder("°á°ú"), new EmptyBorder(4, 4, 4, 4)));
		add(bmi_EastPanel, gbc);
		
		

		
		
	
	}
	
}
