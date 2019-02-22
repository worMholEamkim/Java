import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class BMI_EastPanel extends JPanel{
	 String[] inputText = new String[7];
	 String[] text = {"��   ��: ", "Ű: ", "ü   ��: "};
	 JTextField[] input = new JTextField[3];
	 JRadioButton[] btn = new JRadioButton [2];
	 JCheckBox[] cb = new JCheckBox[3];
	 JLabel[] la = new JLabel[2];
	 BMI_WestPanel wp;
	 JLabel colorLabel = new JLabel("����");
	 private EtchedBorder bb = new EtchedBorder(EtchedBorder.LOWERED);
	 
	 BMI_EastPanel( BMI_WestPanel wp) {
		 
		 	la[0] = new JLabel("");
		 	la[1] = new JLabel("");
		 	
		 	this.wp  = wp;
			setLayout(new BorderLayout());
		
			JButton Measure = new JButton("��ü ���� ����");
			BMI_MyListener lis = new BMI_MyListener(wp, BMI_EastPanel.this);
			Measure.addActionListener(lis);
			add(Measure, BorderLayout.NORTH);
			
			JPanel textArea = new JPanel();
			textArea.setLayout(new GridLayout(4, 1));
			textArea.setBorder(new CompoundBorder(new TitledBorder("BMI ���"), new EmptyBorder(4, 4, 4, 4)));
			la[0].setSize(40, 40);
			
			la[0].setBorder(bb);
			textArea.add(la[0]);
			
			colorLabel.setOpaque(true);
			textArea.add(colorLabel);
			
			textArea.add(new JLabel("��  ��"));
			la[1].setSize(20, 20);
			
			la[1].setBorder(bb);
			textArea.add(la[1]);
			

			add(textArea, BorderLayout.CENTER);
			
			
			
	 }


}