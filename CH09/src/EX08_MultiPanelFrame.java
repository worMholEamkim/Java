package EX08;
import java.awt.*;
import javax.swing.*;

public class EX08_MultiPanelFrame extends JFrame {
	public EX08_MultiPanelFrame() {
		super("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // 컨텐트팬은 디폴트로 BorderLayout 배치 관리자.
		
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
