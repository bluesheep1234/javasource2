
public class Ex11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car MyCar1 = new Car();
		MyCar1.color = "빨강";
		MyCar1.speed = 0;
		
		Car MyCar2 = new Car();
		MyCar1.color = "파랑";
		MyCar1.speed = 0;
		
		Car MyCar3 = new Car();
		MyCar1.color = "노랑";
		MyCar1.speed = 0;
		
		MyCar1.UpSpeed(30);
		System.out.println("자동차1의 색상은" + MyCar1.color + "이며, 현재 속도는" + MyCar1.speed + "km 입니다.");
		
		MyCar2.UpSpeed(60);
		System.out.println("자동차2의 색상은" + MyCar2.color + "이며, 현재 속도는" + MyCar2.speed + "km 입니다.");
		
		MyCar3.UpSpeed(0);
		System.out.println("자동차3의 색상은" + MyCar3.color + "이며, 현재 속도는" + MyCar3.speed + "km 입니다.");
	}

}
