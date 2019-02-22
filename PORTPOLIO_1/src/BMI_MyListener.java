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
		
	
		
		//BMI 계산
		float BMI = weight / ((height / 100)^2);
		String[]  state = {"고도비만", "중도비만", "과체중", "정상", "저체중"};
		String condition = "흥";
		String[] opinion = {"술 그만 마셔요!", "담배 끊으세요!", "운동 좀 하세요!"};
		
		
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
		
		
		//BMI 결과 출력
		if(wp.btn[0].isSelected() == true)
			ep.la[0].setText("이쁜" + name + "님의 신체 질량 지수 : " + BMI +
					"(" + condition + ")입니다.");
		else
			ep.la[0].setText("멋진" + name + "님의 신체 질량 지수 : " + BMI +
					"(" + condition + ")입니다.");
		
		String sumText = "";
		//소견 출력
		for(int i=0; i<3; i++) {
		if(wp.cb[i].isSelected() == true) {
			sumText += opinion[i];
			ep.la[1].setText(sumText);
		}

	}
	}
}
