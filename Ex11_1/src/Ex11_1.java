
public class Ex11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car MyCar1 = new Car();
		MyCar1.color = "����";
		MyCar1.speed = 0;
		
		Car MyCar2 = new Car();
		MyCar1.color = "�Ķ�";
		MyCar1.speed = 0;
		
		Car MyCar3 = new Car();
		MyCar1.color = "���";
		MyCar1.speed = 0;
		
		MyCar1.UpSpeed(30);
		System.out.println("�ڵ���1�� ������" + MyCar1.color + "�̸�, ���� �ӵ���" + MyCar1.speed + "km �Դϴ�.");
		
		MyCar2.UpSpeed(60);
		System.out.println("�ڵ���2�� ������" + MyCar2.color + "�̸�, ���� �ӵ���" + MyCar2.speed + "km �Դϴ�.");
		
		MyCar3.UpSpeed(0);
		System.out.println("�ڵ���3�� ������" + MyCar3.color + "�̸�, ���� �ӵ���" + MyCar3.speed + "km �Դϴ�.");
	}

}
