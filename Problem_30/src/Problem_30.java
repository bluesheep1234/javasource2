
public class Problem_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet1 = new Pet();
		pet1.setType("������");
		pet1.setAge(8);
		
		Pet pet2 = new Pet();
		pet2.setType("�����");
		pet2.setAge(13);
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.getType() + "�� " + pet1.getAge() + "�����Դϴ�.");
		System.out.println(pet2.getType() + "�� " + pet2.getAge() + "�����Դϴ�.");
	}

}
