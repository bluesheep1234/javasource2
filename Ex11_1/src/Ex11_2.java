
public class Ex11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car MyCar1 = new Car(); 
		MyCar1.color = "����";
		MyCar1.speed = 0;
		
		MyCar1.UpSpeed(30);
		System.out.println("�ڵ���1�� ������" + MyCar1.color + "�̸�, ���� �ӵ���" + MyCar1.speed + "km �Դϴ�.");
		System.out.println("�ڵ���1�� ������" + MyCar1.getColor() + "�̸�, ���� �ӵ���" + MyCar1.getSpeed() + "km �Դϴ�.");
	}

}
