import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TE03 extends JFrame{
	private int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	private String [] text = {"������", "����", "õ��", "500��", "100��", "50��", "10��"	, "1��"};
	private JTextField [] tf = new JTextField [8];
	
	public TE03() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		JButton btn = new JButton("���");
		
		.add(new JLabel("�ݾ�"));
		.add(new JTextField(20));
		
		
		

		
		
		
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TE03_MyFrame();
	}

}
