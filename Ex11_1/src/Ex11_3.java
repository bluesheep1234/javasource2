
public class Ex11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car MyCar1 = new Car();
		MyCar1.setColor("빨강");
		MyCar1.setSpeed(0);
		
		MyCar1.UpSpeed(30);
		System.out.println("자동차1의 색상은" + MyCar1.getColor() + "이며, 현재 속도는" + MyCar1.getSpeed() + "km 입니다.");
		
	}

}
