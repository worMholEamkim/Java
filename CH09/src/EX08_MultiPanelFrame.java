package EX08;
import java.awt.*;
import javax.swing.*;

public class EX08_MultiPanelFrame extends JFrame {
	public EX08_MultiPanelFrame() {
		super("���� ���� �г��� ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // ����Ʈ���� ����Ʈ�� BorderLayout ��ġ ������.
		
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new NorthPanel(), BorderLayout.NORTH);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EX08_MultiPanelFrame();
	}

}
