import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class EX02 extends JFrame{
	private JLabel imgLabel = new JLabel();
	
	public EX02() {
		setTitle("Menu�� Action ������ ����� ����");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(250, 220);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		JMenu screenMenu = new JMenu("Screen");
		
		MenuActionListner listener = new MenuActionListner();
		
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
			
		}
		mb.add(screenMenu);
		setJMenuBar(mb);
	
	}
	
	class MenuActionListner implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "Load":
				if(imgLabel.getIcon() != null)
					return;
				imgLabel.setIcon(new ImageIcon("Images/img.jpg"));
				break;
			case "Hide":
				imgLabel.setVisible(false);
			case "ReShow":
				imgLabel.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
			}
		}


	public static void main(String[] args) {
		new EX02();
	}

}



