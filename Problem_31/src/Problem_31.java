
public class Problem_31 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet1 = new Pet("������", 8);
		Pet.count++;
		
		Pet pet2 = new Pet("�����", 13);
		Pet.count++;
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.getType() + "�� " + pet1.getAge() + "�����Դϴ�.");
		System.out.println(pet2.getType() + "�� " + pet2.getAge() + "�����Դϴ�.");
		
		System.out.println("���� �츮�� �ֿϵ��� ����" + Pet.getCount() + "�����Դϴ�.");
	}

}


