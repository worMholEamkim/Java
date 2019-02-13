
public class PersonMain {

	public static void main(String[] args) 
	{
		//age는 main()메소드의 지역변수, 멤버변수 아님!
		
		int age = 20;
		int ageArr[] = {11, 22, 33};
		

		Person p1 = new Person();
		
		//1.변수 age
		p1.addAge(age);
		System.out.println("PersonMain: "+age);
		
		//2.배열 ageArr
		p1.addAgeArr(ageArr);
		System.out.println("PersonMain: "+ageArr[0]);
		
		//3.객체 c
		Car c = new Car();//2015년산 자동차 생성
		c.year = 2015;
		System.out.println("PersonMain 1:"+c.year);//???1?
		p1.addCar(c);		
		System.out.println("PersonMain 2:"+c.year);//????
		
		//4.객체 배열 c2[]
		Car c2[] = new Car[3];
		c2[0] = new Car();
		c2[1] = new Car();
		c2[2] = new Car();
		
		p1.addCarArr(c2);
		System.out.println("PersonMain Car Arr:"+c.year);//????
		
		
	

	}

}
