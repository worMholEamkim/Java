import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class TE01 extends JFrame {

	public TE01() {
			setTitle("üũ�ڽ� ����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			JCheckBox enable = new JCheckBox("��ư ��Ȱ��ȭ");
			JCheckBox visible = new JCheckBox("��ư �����");
			JButton test = new JButton("test button");
			
			enable.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED) 
						test.setEnabled(false);
					else
						test.setEnabled(true);
				}
						
			});					
			visible.addItemListener(new ItemListener() {
					
				@Override
				public void itemStateChanged(ItemEvent e)
				{
					if(e.getStateChange() == ItemEvent.SELECTED) 
						test.setVisible(false);
					else
						test.setVisible(true);
				}		
			});
			
			
			setSize(300, 200);
			setVisible(true);
			
			c.add(enable);
			c.add(visible);
			c.add(test);
			
			
		
	}
	public static void main(String[] args) {
		new TE01();
	}

}
