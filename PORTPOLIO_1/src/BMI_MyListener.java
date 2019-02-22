import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

class BMI_MyListener implements ActionListener{
	BMI_WestPanel wp;
	BMI_EastPanel ep;
	
	public BMI_MyListener(BMI_WestPanel wp, BMI_EastPanel ep)
	{
		this.wp = wp;
		this.ep = ep;
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = wp.input[0].getText();
		
		if(name.equals(""))
			return;
		if(wp.input[1].getText().equals(""))
			return;
		if(wp.input[2].getText().equals(""))
			return;
			
		String hei = wp.input[1].getText();
		String wei = wp.input[2].getText();
		
		int height = Integer.parseInt(hei);
		int weight = Integer.parseInt(wei);
		
	
		
		//BMI ���
		float BMI = weight / ((height / 100)^2);
		String[]  state = {"����", "�ߵ���", "��ü��", "����", "��ü��"};
		String condition = "��";
		String[] opinion = {"�� �׸� ���ſ�!", "��� ��������!", "� �� �ϼ���!"};
		
		
		if(BMI > 30)
		{
			condition = state[0];
			ep.colorLabel.setBackground(Color.RED);
			
		}
		else if(BMI > 25) {
			condition = state[1];
			ep.colorLabel.setBackground(Color.RED);
		
		}
		else if(BMI > 22) {
			condition = state[2];
			ep.colorLabel.setBackground(Color.RED);
		}
		else if(BMI > 18) {
			condition = state[3];
			ep.colorLabel.setBackground(Color.GREEN);
		}
		else {
			condition = state[4];
			ep.colorLabel.setBackground(Color.BLUE);

		}		
		
		
		//BMI ��� ���
		if(wp.btn[0].isSelected() == true)
			ep.la[0].setText("�̻�" + name + "���� ��ü ���� ���� : " + BMI +
					"(" + condition + ")�Դϴ�.");
		else
			ep.la[0].setText("����" + name + "���� ��ü ���� ���� : " + BMI +
					"(" + condition + ")�Դϴ�.");
		
		String sumText = "";
		//�Ұ� ���
		for(int i=0; i<3; i++) {
		if(wp.cb[i].isSelected() == true) {
			sumText += opinion[i];
			ep.la[1].setText(sumText);
		}

	}
	}
}
